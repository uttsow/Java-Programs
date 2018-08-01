package assignment03;

import java.time.LocalDateTime;
import java.util.Optional;

public class CalendarTester{

  public static void main(String[] args) {
    CalendarList calList = new CalendarList();

    CalendarItem test1 = new CalendarItem();
    test1.setDescription("Appointment 1");
    test1.setEnd(LocalDateTime.of(2017,9,19,11,40));
    test1.setStart(LocalDateTime.of(2017,9,19,10,40));
    test1.setTitle("CS 140");
    test1.setLocation("FA 212");

    CalendarItem test2 = new CalendarItem();
    test2.setDescription("Appointment 2");
    test2.setEnd(LocalDateTime.of(2017,9,26,19,35));
    test2.setStart(LocalDateTime.of(2017,9,26,18,35));
    test2.setTitle("CS 140");
    test2.setLocation("FA 212");


    CalendarItem test4 = new CalendarItem();
    test4.setDescription("Appointment 4");
    test4.setEnd(LocalDateTime.of(2017,11,06,4,55));
    test4.setStart(LocalDateTime.of(2017,11,06,2,30));
    test4.setTitle("CS 140");
    test4.setLocation("FA 212");

    CalendarItem test5 = new CalendarItem();
    test5.setDescription("Appointment 5");
    test5.setEnd(LocalDateTime.of(2017,11,15,8,10));
    test5.setStart(LocalDateTime.of(2017,11,15,6,10));
    test5.setTitle("CS 140");
    test5.setLocation("FA 212");


    calList.insertItem(test2);
    calList.insertItem(test4);
    calList.insertItem(test5);
    calList.printCalendar();
    System.out.println("-------------------------------------------------");



    CalendarItem test3 = new CalendarItem();
    test3.setDescription("Appointment 3");
    test3.setEnd(LocalDateTime.of(2017,9,26,20,25));
    test3.setStart(LocalDateTime.of(2017,9,26,19,00));
    test3.setTitle("CS 140");
    test3.setLocation("FA 212");

    System.out.println("Test for adding a previous item using testingInsert");
    calList.testingInsert(test1);
    calList.printCalendar();
    System.out.println("-------------------------------------------------");

    calList.setNext();
    calList.resetFirst();
    System.out.println("Test fpr calendar after setNext() and resetFirst()");
    calList.printCalendar();
    System.out.println("-------------------------------------------------");

    System.out.println("Tests for noTimeConflictWith:");
    System.out.println("**********************************");
    System.out.println("Case 1");
    System.out.println("Expected result: true");
    System.out.println("Actual result: " + test1.noTimeConflictWith(test2));
    System.out.println("Case 2");
    System.out.println("Expected result: false");
    System.out.println("Actual result: " + test2.noTimeConflictWith(test3));
    System.out.println("--------------------------------------\n");


    System.out.println("Tests for hasTimeConflictWith:");
    System.out.println("**********************************");
    System.out.println("Case 1");
    System.out.println("Expected result: true");
    System.out.println("Actual result: " + test2.hasTimeConflictWith(test3));
    System.out.println("Case 2");
    System.out.println("Expected result: false");
    System.out.println("Actual result: " + test1.hasTimeConflictWith(test2));

    System.out.println("-------------------------------------------------");
    System.out.println("Use insertItem() to add a conflicting appointment:");
    calList.insertItem(test3);
    calList.printCalendar();
    System.out.println("-------------------------------------------------");


  }
}
