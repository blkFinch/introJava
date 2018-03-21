/*N.Hutchison
BMI calculator
2/5/18

OOP design to calculate user's bmi
 Honor Code: I pledge that this program represents my own
// program code. I received help from (enter the names of
// others that helped with the assignment, write no one if
// you received no help) in designing and debugging my program.


*/
import java.util.Scanner;
import java.util.InputMismatchException;
import java.text.DecimalFormat;

public class BMIcalculator{

  Scanner input = new Scanner(System.in);

  private static DecimalFormat formatter = new DecimalFormat(".##");//for cleaner output of BMI

  private double weight;
  private double height;
  private double bmi;

  private double CONV = 703;//constant conversion rate

  //getters and setters

  public double getHeight(){
    System.out.print("Enter Height in inches: ");
    try{
      height = input.nextDouble();
    }
    catch(InputMismatchException e){
      System.out.println("Please enter a float or integer!");
    }
    return height;
  }

  public void setHeight(double height){
    this.height = height;
  }

  public double getWeight(){
    System.out.print("Enter Weight in pounds: ");
    try{
      weight = input.nextDouble();
    }
    catch(InputMismatchException e){
      System.out.println("Please enter a float or integer!");
    }
    return weight;
  }

  public void setWeight(double Weight){
    this.weight = weight;
  }

  public double calculateBMI(){
    try{
      bmi = weight / Math.pow(height, 2) * CONV;
    }
    catch(ArithmeticException e){
      System.out.println("Invalid height or weight- Height and Weight must both be greater than zero");
    }
    return bmi;
  }

  public void setBMI(double bmi){
    this.bmi = bmi;
  }
  //end region

  //construtors

  public BMIcalculator(double height, double weight, double bmi){
    super();
    setHeight(height);
    setWeight(weight);
    setBMI(bmi);
  }

  public void getUserInput(){
    getHeight();
    getWeight();
    calculateBMI();
  }
  //end constructor region

  //test bmi to detirmine if healthy
  public boolean isUnderWeight(){
    if(bmi < 18.5){
      return true;
    }
    else return false;
  }

  public boolean isHealthyWeight(){
    if((18.5 <= bmi) && (bmi <= 24.9)){
      return true;
    }
    else return false;
  }

  public boolean isOverWeight(){
    if((25 <= bmi)&& (bmi <= 29.9)){
      return true;
    }
    else return false;
  }

  public boolean isObese(){
    if(30<= bmi){
      return true;
    }
    else return false;
  }

  //print results
  public String testToString(){
    if(isUnderWeight()){
      return "You are underweight! eat more protien!";
    }
    else if(isHealthyWeight()){
      return "You are a healthy weight! Congrats!";
    }
    else if(isOverWeight()){
      return "You are overweight! Watch those carbs!";
    }
    else if(isObese()){
      return "you are obese.";
    }
    else return "invalid BMI -ouch - ow ow...";
  }

  public String bmiToString(){
    return "Your BMI is: " + formatter.format(bmi);
  }

  public void printResult(){
    System.out.println(bmiToString());
    System.out.println(testToString());
  }



  public static void main(String[] args){

    BMIcalculator userBMI = new BMIcalculator(0,0,0);
    userBMI.getUserInput();
    userBMI.printResult();
  	
  }//end of main
}//end of class
