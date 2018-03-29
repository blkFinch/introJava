//N.hutchison
//
//Calculate Future investment value
//
//Honor Code: On my honor this is my own program code
//I recieved help from no one in designing and debugging
//this code

import java.util.Scanner;
import java.text.DecimalFormat;

public class CalculateValue{

  Scanner input = new Scanner(System.in);

  DecimalFormat formatter = new DecimalFormat(".##");

  private double futureInvestmentValue;
  private double investmentAmount;
  private double monthlyInterestRate;
  private int numberOfYears;

  //getters and setters
  public double getInvestmentAmount(){
    return investmentAmount;
  }

  public void setInvestmentAmount(double investmentAmount){
    this.investmentAmount = investmentAmount;
  }

   public double getMonthlyInterestRate(){
    return monthlyInterestRate;
  }

  public void setMonthlyInterestRate(double monthlyInterestRate){
    
    this.monthlyInterestRate = monthlyInterestRate;
  }

  public double getNumberOfYears(){
    return numberOfYears;
  }

  public void setNumberOfYears(int numberOfYears){
    this.numberOfYears = numberOfYears;
  }

  //function simultaneously gets user input
  //and sets the object's values with it
  public void setUserValues(){

    System.out.print("Enter Investment Amount: ");
    setInvestmentAmount(input.nextDouble());

    System.out.print("Enter annual interest rate as percent: ");
    setMonthlyInterestRate((input.nextDouble()/100));

    System.out.print("Enter number of years: ");
    setNumberOfYears(input.nextInt());

  }

  //does the math
  public void calculateValue(){
    this.futureInvestmentValue = investmentAmount * Math.pow((1 + (monthlyInterestRate/100)),(numberOfYears * 12));
  }

  public double getFutureInvestmentValue(){
    return futureInvestmentValue;
  }

  //cleans up the results to be readable
  private String formatResults(){
    return formatter.format(getFutureInvestmentValue());
  }
 
  public void printResults(){
    System.out.println("The future value is " + formatResults());
  }


  //main loop
  public static void main(String[] args) {
    CalculateValue newInvestment = new CalculateValue();
    newInvestment.setUserValues();
    newInvestment.calculateValue();
    newInvestment.printResults();
    
  }//end of main
}//end of class