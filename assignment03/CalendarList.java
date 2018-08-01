package assignment03;

import java.time.LocalDateTime;
import java.util.Optional;

public class CalendarList {
    private CalendarItem first;
    private CalendarItem next;


    public void setNext(){
      CalendarItem nowItem = new CalendarItem();
      LocalDateTime nowObject = LocalDateTime.now();
      nowItem.setStart(nowObject);
      nowItem.setEnd(nowObject);
      CalendarItem temp = first;
      if(temp.isEqual(nowItem) || temp.startsAfter(nowItem))
        next = temp;
      else{
        while(temp.getNextItem() != null){
          if(temp.getNextItem().isEqual(nowItem) || temp.getNextItem().startsAfter(nowItem)){
            next = temp.getNextItem();
            break;
          }

          temp = temp.getNextItem();
        }
    }
  }

    public void resetFirst(){
      setNext();
      first = next;
    }

    public Optional<CalendarItem> findConflict(CalendarItem newItem){
      CalendarItem temp = first;
      while(temp != null) {
        if(temp.hasTimeConflictWith(newItem)) {
       return Optional.of(temp);
     }
     temp = temp.getNextItem();
   }
   return Optional.empty();
 }

    private void insert(CalendarItem newItem){
      if(first == null){
  			first = newItem;
  		}
      else if (newItem.endsBefore(first)){
  			newItem.setNextItem(first);
  			first = newItem;
  		}
      else{
  			CalendarItem temp = first;
  			while(temp.getNextItem() != null && !newItem.endsBefore(temp.getNextItem())) {
          temp = temp.getNextItem();
        }
  			newItem.setNextItem(temp.getNextItem());
        temp.setNextItem(newItem);
  		}
  	}

    public void insertItem(CalendarItem newItem){
      if(first != null){
        setNext();
        CalendarItem nowItem = new CalendarItem();
        LocalDateTime nowObject = LocalDateTime.now();
        nowItem.setStart(nowObject);
        nowItem.setEnd(nowObject);

        if(newItem.endsBefore(nowItem))
           throw new IllegalArgumentException("too late for the appointment");

        if(newItem.getStart().isBefore(nowObject))
          throw new IllegalArgumentException("That appointment is valid");

        Optional<CalendarItem> temp = findConflict(newItem);
        if(temp.isPresent()) {
          throw new IllegalArgumentException("You have a conflict. "
          + "Please use findConflict to find the conflicting appointment");
        }
      }
      insert(newItem);
    }

    void testingInsert(CalendarItem newItem){
      if(first != null){
        Optional<CalendarItem> temp = findConflict(newItem);
        if(temp.isPresent()) {
          throw new IllegalArgumentException("You have a conflict. "
          + "Please use findConflict to find the conflicting appointment");
        }
      }
      insert(newItem);
    }

    public void printNext(){
      System.out.println(next);
    }

    public void printCalendar(){
      CalendarItem temp = first;
      while(temp != null){
        System.out.println(temp);
        temp = temp.getNextItem();
      }
    }

}
