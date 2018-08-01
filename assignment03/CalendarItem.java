package assignment03;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CalendarItem{

  private LocalDateTime start;
  private LocalDateTime end;
  private String title;
  private String location;
  private String description;
  private CalendarItem nextItem;

  public void setStart(LocalDateTime aStart){
    if(end != null && end.isBefore(aStart))
    throw new IllegalArgumentException("the start cannot be after end");
    start = aStart;
  }

    public void setEnd(LocalDateTime aEnd){
      if(start != null && start.isAfter(aEnd))
      throw new IllegalArgumentException("the start cannot be after end");
      end = aEnd;
    }

    public void setTitle(String aTitle){
      title = aTitle;
    }

    public void setLocation(String aLocation){
      location = aLocation;
    }

    public void setDescription(String aDescription){
      description = aDescription;
    }

    public void setNextItem(CalendarItem aNextItem){
      nextItem = aNextItem;
    }

    public LocalDateTime getStart(){
      return start;
    }

    public LocalDateTime getEnd(){
      return end;
    }

    public String getTitle(){
      return title;
    }

    public String getLocation(){
      return location;
    }

    public String getDescription(){
      return description;
    }

    public CalendarItem getNextItem(){
      return nextItem;
    }
    public String toString() {
      DateTimeFormatter dayForm =  DateTimeFormatter.ofPattern("MMMM d, yyyy");
      DateTimeFormatter timeForm =  DateTimeFormatter.ofPattern("h:m a");
      return start.format(dayForm) +" from " + start.format(timeForm)
      + " to " + end.format(timeForm) + "\n"
			+ title + " in " + location + "\n"
			+ description;
    }

    public boolean endsBefore(CalendarItem other){
      return end.isBefore(other.getStart());
    }

    public boolean startsAfter(CalendarItem other){
      return start.isAfter(other.getEnd());
    }

    public boolean noTimeConflictWith(CalendarItem other) {
  	   return endsBefore(other) || startsAfter(other);
     }

     public boolean hasTimeConflictWith(CalendarItem other) {
  	   return !noTimeConflictWith(other);
     }

     public boolean isEqual(CalendarItem other){
       return other.getStart() == start;
     }


}
