package assignment01;

public class Driver{
  public static void main(String[] args){
//Create 3 person object and use that to create 3 person student
    Person p1 = new Person("Rahman", "Uttsow", 'C');
    Person p2 = new Person("Wang", "Zoe", 'D');
    Person p3 = new Person("Ding", "Martin", 'L');

    Student rahman = new Student(p1);
    Student wang = new Student(p2);
    Student ding = new Student(p3);

    Class calulus = new Class("Story of Calculus", "330", 4, 10120);
    Class science = new Class("Science sucks", "108", 4, 29830);
    Class history = new Class("History is ancient", "104", 4, 34980);

//sets classes for each created class and sets qual points
    wang.setClass1(calulus);
    wang.setQualPoints1(16.0);
    wang.setClass2(science);
    wang.setQualPoints2(16.0);
    wang.setClass3(history);
    wang.setQualPoints3(16.0);

//create 4 new classes for student 3 and set the class and qual points
    Class art = new Class("Art History", "101", 3, 12345);
    Class psych = new Class("Psych is for losers", "105", 4, 34763);
    Class rockThrow = new Class("School well spent","601", 4, 66665);
    Class cheer = new Class("I love cheer", "101", 3, 34753);

    ding.setClass1(art);
    ding.setQualPoints1(16.0);
    ding.setClass2(psych);
    ding.setQualPoints2(11.1);
    ding.setClass3(rockThrow);
    ding.setQualPoints3(16.0);
    ding.setClass4(cheer);
    ding.setQualPoints4(3);

  //Print out the students
    System.out.println(rahman.getName() + " has a GPA of: " + rahman.computeSemesterGPA());
    System.out.println(rahman.getName()+ " expected GPA was: 0");
    System.out.println("--------------------------------" );

    System.out.println(wang.getName() + " has a GPA of: " + wang.computeSemesterGPA());
    System.out.println(wang.getName()+ " expected GPA was: 4.0");
    System.out.println("--------------------------------" );

//needs to use the float "printf" for this
    System.out.print(ding.getName());
    System.out.printf(" has a GPA of %.3f\n", ding.computeSemesterGPA());
    System.out.println(ding.getName()+ " expected GPA was: 3.293");
    System.out.println("--------------------------------" );

  }
}
