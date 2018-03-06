import java.util.Scanner;
import java.text.DecimalFormat;

public class Payroll{

  private String name;
  private double hours;
  private double payrate;
  private double fedTax;
  private double fedTaxRate;
  private double stateTax;
  private double stateTaxRate;
  private double grossPay;
  private double totalDeduction;
  private double netPay;

  Scanner input = new Scanner(System.in);
  DecimalFormat formatter = new DecimalFormat("#0.00");

  public void setName(String name){
    this.name = name;
  }
  public String getName(){
    return name;
  }

  public void setHours(double hours){
    this.hours = hours;
  }
  public double getHours(){
    return hours;
  }

  public void setPayrate(double payrate){
    this.payrate = payrate;
  }
  public double getPayrate(){
    return payrate;
  }

  public double getFedTaxRate(){
    return fedTaxRate;
  }
  public void setFedTaxRate(double fedTaxRate){
    this.fedTaxRate = fedTaxRate;
  }

  public void setFedTax(double fedTax){
    this.fedTax = fedTax;
  }
  public double getFedTax(){
    return fedTax;
  }
  public void calcFedTax(){
    setFedTax(getGrossPay() * getFedTaxRate());
  }

   public double getStateTaxRate(){
    return stateTaxRate;
  }
  public void setStateTaxRate(double stateTaxRate){
    this.stateTaxRate = stateTaxRate;
  }

  public void setStateTax(double stateTax){
    this.stateTax = stateTax;
  }
  public double getStateTax(){
    return stateTax;
  }

  public void calcStateTax(){
    setStateTax(getGrossPay() * getStateTaxRate());
  }


  public double getGrossPay(){
    return grossPay;
  }
  public void setGrossPay(double grossPay){
    this.grossPay = grossPay;
  }
  public void calcGrossPay(){
    setGrossPay(getHours() * getPayrate());
  }

  public double getTotalDeduction(){
    return totalDeduction;
  }
  public void setTotalDeduction(double totalDeduction){
    this.totalDeduction=totalDeduction;
  }
  public void calcTotalDeduction(){
    setTotalDeduction(getStateTax() + getFedTax());
  }

  public double getNetPay(){
    return netPay;
  }

  public void setNetPay(double netPay){
    this.netPay = netPay;
  }

  public void calcNetPay(){
    setNetPay(getGrossPay() - getTotalDeduction());
  }


  public void getInput(){
    System.out.print("Enter Name: ");
    setName(input.nextLine());

    System.out.print("Enter total hours: ");
    setHours(input.nextDouble());

    System.out.print("Enter payrate: ");
    setPayrate(input.nextDouble());

    System.out.print("Enter state tax rate: ");
    setStateTaxRate(input.nextDouble());

    System.out.print("Enter federal tax rate: ");
    setFedTaxRate(input.nextDouble());
  }

  public void calulateTotals(){
    calcGrossPay();
    calcStateTax();
    calcFedTax();
    calcTotalDeduction();
    calcNetPay();
  }

  public void printResults(){
    System.out.println("name: " + getName());
    System.out.println("gross pay: " + formatter.format(getGrossPay()));
    System.out.println("total tax deduction: " + formatter.format(getTotalDeduction()));
    System.out.println("net pay: " + formatter.format(getNetPay()));
  }

  public Payroll(String name, double hours,double payrate, 
                            double fedTax, double stateTax){
    this.name = name;
    this.hours = hours;
    this.payrate = payrate;
    this.fedTax = fedTax;
    this.stateTax = stateTax;
  }

  public Payroll(String name, double hours,double payrate, double fedTax, 
                double stateTax, double totalDeduction, double grossPay, double netPay){
    this.name = name;
    this.hours = hours;
    this.payrate = payrate;
    this.fedTax = fedTax;
    this.stateTax = stateTax;
    this.grossPay = grossPay;
    this.totalDeduction = totalDeduction;
    this.netPay = netPay;
  }

  public static void main(String[] args) {
    Payroll employee = new Payroll("doe", 0, 0, 0, 0);
    employee.getInput();
    employee.calulateTotals();
    employee.printResults();
  }//end of main
}//end of class

