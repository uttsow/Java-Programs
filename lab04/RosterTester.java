package lab04;

import java.util.ArrayList;
import java.util.Arrays;

public class RosterTester{

  public static void main(String[] args){

    Roster classRoster = new Roster();
    Student student1 = new Student(12, "Uttsow");
    Student student2 = new Student(33, "John");
    Student student3 = new Student(21, "Ben");
    Student student4 = new Student(51, "Dave");
    Student student5 = new Student(41, "Ozzie");

    System.out.println("addStudent test:");
    classRoster.addStudent(student1);
    classRoster.addStudent(student2);
    classRoster.addStudent(student3);
    classRoster.addStudent(student4);
    classRoster.addStudent(student5);
    System.out.println("Expected Roster: [Uttsow, John, Ben, Dave, Ozzie]");
    System.out.println("Result: " + classRoster);
    System.out.println("----------------------------------------------------");


    System.out.println("dropStudent test:");
    classRoster.dropStudent("Ozzie");
    System.out.println("Student dropped: Ozzie");
    System.out.println("Expected Roster: [Uttsow, John, Ben, Dave]");
    System.out.println("Result: " + classRoster);
    System.out.println("----------------------------------------------------");


    System.out.println("sortById test:");
    System.out.println("Expected Roster: [Uttsow, Ben, John, Dave]");
    classRoster.sortById();
    System.out.println(classRoster);
    System.out.println("-----------------------------------------------------");


    System.out.println("Printing the names and IDs of the students in the roster:");
    for(Student s: classRoster.getRoster()){
      System.out.println(s.getName() + "\t" + "ID: " + s.getId());
    }
  }
}
