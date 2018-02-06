// N.Hutchison
// 2/6/18
// Tax Calculator App
//
//
//OOP design to calculate user's bmi
 //Honor Code: I pledge that this program represents my own
// program code. I received help from no one
//in designing and debugging my program.

import java.util.Scanner;

public class TaxCalculator{

  Scanner input = new Scanner(System.in);

  private double income;
  private double taxOwed;


  public boolean isSingle(){

    System.out.print("Enter 1 if single or 2 if married: ");
    if(input.nextInt() == 1){
      return true;
    }
    else return false;

  }


  public double getIncome(){
    System.out.print("Enter taxable income for the year: ");
    income = input.nextDouble();
    return income;
  }

  public void setIncome(double income){
    this.income = income;
  }

  public void setTaxOwed(double taxOwed){
    this.taxOwed = taxOwed;
  }

  public TaxCalculator(double income, double taxOwed){
    super();
    setIncome(income);
   
  }

  public double calculateTaxOwed(){
    if(income < 9325){
      taxOwed = (income * 0.1); 
    }
    else if(income < 37950){
      taxOwed = ((income - 9325) * .15) + 932.5;
    }
    else if(income < 91900){
      taxOwed = ((income - 37950) * 0.25) + 5226.25;
    }
    else if(income < 191650){
      taxOwed = ((income - 91900) * 0.28 )+18713.75;
    }
    else if(income < 416700){
      taxOwed = ((income - 191650) * 0.33) + 46643.75;
    }
    else if(income <418400){
      taxOwed = ((income - 416700) * 0.35) + 120910.25;
    }
    else {
      taxOwed = ((income - 418400) * 0.396) + 121505;
    }

    return taxOwed;
  }
  
  public void printResult(){
    System.out.println("entered income is: " + income);
    System.out.println("Expected tax owed: " + taxOwed);
  }


  public static void main(String[] args) {

    TaxCalculator user = new TaxCalculator(0,0);
    if(user.isSingle()){
      user.getIncome();
      user.calculateTaxOwed();
      user.printResult();
    }
    else System.out.println("This functionality is under construction! ");

  }//end of main
}//end of class