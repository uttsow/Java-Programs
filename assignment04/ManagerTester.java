package assignment04;
import java.util.*;

public class ManagerTester{
  public static void main(String[] args){
    //Tester for Manager
    Person person1 = new Person("Rahman", "Uttsow", 'N');
    Person person2 = new Person("Swerb", "Nick", 'H');
    Person person3 = new Person("Harris", "Daniel", 'J');
    Person person4 = new Person("Mazurkiewicz", "Dave", 'J');
    Person person5 = new Person("Foreman", "Matt", 'V');
    Person person6 = new Person("Jordan", "Isaac", 'M');
    Person person7 = new Person("Bell", "Thomas", 'C');

    Manager manager1 = new Manager(person1);
    Manager manager2 = new Manager(person3);

    Employee employee1 = new Employee(person4);
    Employee employee2 = new Employee(person2);
    Employee employee3 = new Employee(person5);
    Employee employee4 = new Employee(person6);
    Employee employee5 = new Employee(person7);

    employee1.setSalary(900000);
    employee2.setSalary(600000);
    employee3.setSalary(100000);
    employee4.setSalary(134000);
    employee5.setSalary(17000);
    manager1.setSalary(2000000);
    manager2.setSalary(400000);

    manager1.setDepartment("CEO");
    manager2.setDepartment("Workers");

    manager1.addToTeam(employee1);
    manager1.addToTeam(employee2);

    manager2.addToTeam(employee3);
    manager2.addToTeam(employee4);
    manager2.addToTeam(employee5);

    System.out.println(manager1);
    System.out.println("-------------------------------------");
    System.out.println(manager2);

  }
}
