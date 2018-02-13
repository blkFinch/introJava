public class Student {

  private String firstName;
  private string lastName;
  private String aNumber;
  private int age;
  private double tuition;

  Student(){

  }

  public Stduent(String firstName, String lastName, String aNumber){
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.aNumber = aNumber;
  }

  public Stduent(String firstName, String lastName, String aNumber, int age, double tuition){
    super();
    this.firstName = firstName;
    this.lastName = lastName;
    this.aNumber = aNumber;
    this.age = age;
    this.tuition = tuition;
  }

  public String getFirstName(){
    return firstName;
  }

  public void setFirstName(String firstName){
    this.firstName = firstName;
  }

   public String getLastName(){
    return lastName;
  }

  public void setLastName(String lastName){
    this.lastName = lastName;
  }

   public String getAnumber(){
    return aNumber;
  }

  public void setAnumber(String aNumber){
    this.aNumber = aNumber;
  }

  public int getAge(){
    return age;
  }

  public void setAge(int age){
    this.age = age;
  }

  public double getTuition(){
    return tuition;
  }

  public void setTuition(double tuition){
    this.tuition = tuition
  }

  public String toString(){
    return "Student" + getFirstName() + " " + getLastName();
  }

  public static void main(String[] args) {


    
  }//end of main

}//end of class