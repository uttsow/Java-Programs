package assignment01;

public class Person{
  private String lastName;
  private String firstName;
  private char middleInitial;

  public Person(String aLastName, String aFirstName, char aMiddleInitial){
    lastName = aLastName;
    firstName = aFirstName;
    middleInitial = aMiddleInitial;
  }

  public String getLastName(){      //Getters
    return lastName;
  }
  public String getFirstName(){
    return firstName;
  }
  public char getMiddleInitial(){
    return middleInitial;
  }
}
