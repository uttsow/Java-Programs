package assignment01;

public class Class{
  private String name;        //Define private variables to be used
  private String number;      //These are known as instance variables!
  private int crn;
  private int numCredits;
  private double qualPoints;

  public static final Class DUMMY_CLASS = new Class("Dummy", "000", 0, 0);

  public Class(String aName, String aNumber, int aNumCredits, int aCrn){

    /* "this" seperates variable names
  from the parameter and instance
  ex: this.name refers to instance varable
  used when argument and instance variable name are the same!
    */
    this.name = aName;
    this.number = aNumber;
    this.numCredits = aNumCredits;
    this.crn = aCrn;

  }
  //All getters to return instance variables
  public String getName(){
    return name;
  }
  public String getNumber(){
    return number;
  }
  public int getCrn(){
    return crn;
  }
  public int getNumCredits(){
    return numCredits;
  }
  public double getQualPoints(){
    return qualPoints;
  }

  public void setQualPoints(double qPoints){    //Setter use void!
    qualPoints = qPoints;
  }
}
