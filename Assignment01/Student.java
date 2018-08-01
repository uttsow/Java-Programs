package assignment01;

public class Student{
  private Person self;

  private Class class1 = Class.DUMMY_CLASS;
  private Class class2 = Class.DUMMY_CLASS;
  private Class class3 = Class.DUMMY_CLASS;
  private Class class4 = Class.DUMMY_CLASS;

//known delegate method
//using a method to call another class to do the work
  public void setQualPoints1(double qPoints){
    class1.setQualPoints(qPoints);
  }
  public void setQualPoints2(double qPoints){
    class2.setQualPoints(qPoints);
  }
  public void setQualPoints3(double qPoints){
    class3.setQualPoints(qPoints);
  }
  public void setQualPoints4(double qPoints){
    class4.setQualPoints(qPoints);
  }
//getter to return full name
  public String getName(){
    return(self.getFirstName() + " " + self.getMiddleInitial()+". "+ self.getLastName());
  }
//Constructor that has 1 person parameter and set to self
  public Student(Person aPerson){
    self = aPerson;
  }
//Getters for class1-4
  public Class getClass1(){
    return class1;
  }
  public Class getClass2(){
    return class2;
  }
  public Class getClass3(){
    return class3;
  }
  public Class getClass4(){
    return class4;
  }
//setters for class1-4. Void required and argument must be class!
  public void setClass1(Class c1){
    class1 = c1;
  }
  public void setClass2(Class c2){
    class2 = c2;
  }
  public void setClass3(Class c3){
    class3 = c3;
  }
  public void setClass4(Class c4){
    class4 = c4;
  }
//Computes the total qualPoints and credits from each class!
  public double computeSemesterGPA(){
    double gpa = 0.0;
    double totalPoints = (class1.getQualPoints()+class2.getQualPoints()+class3.getQualPoints()+class4.getQualPoints());
    double totalCredits = (class1.getNumCredits()+class2.getNumCredits()+class3.getNumCredits()+class4.getNumCredits());
    if(totalCredits > 0){
      gpa = totalPoints/totalCredits;
    }
    return gpa;
  }
}
