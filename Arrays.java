//N.hutchison
// 3/29/18
//
// Arrays
//
// Honor Code: On my honor this is my own program code,
// I recieved help from no one in designing and debugging 
// this code.

import java.util.Scanner;

public class Arrays{

  double[] numbers = new double[5];
  double[] deviations = new double[5];

  Scanner input = new Scanner(System.in);
  private double average;
  private double sum;
  private double standardDeviation;

  public double getAverage(){
    return average;
  }

  public void setAverage(double average){
    this.average = average;
  }

  public double getSum(){
    return sum;
  }

  public void setSum(double sum){
    this.sum = sum;
  }

  public void promptUser(){

    for(int i = 0; i <numbers.length; i++){
      System.out.print("Please enter a number: ");
      numbers[i] = input.nextDouble();
    }
  }

  public void printArray(double[]x){
    for(int i =0; i < x.length; i++)
      System.out.print(x[i] + " ");
  }

  public void calculateSum(double[]x){
    double thisSum = 0;
    for(int i =0; i < x.length; i++)
      sum += x[i];
    setSum(thisSum);
  }

  public void calculateAverage(double[]x){
    setAverage(getSum()/x.length);
  }

  public double calculateDeviation(double x){
    return Math.pow((x - getAverage()), 2);
  }

  public void calculateStandardDeviation(){
    for(int i = 0; i < numbers.length; i++){
      deviations[i] = calculateDeviation(numbers[i]);
    }

    calculateSum(deviations);
    calculateAverage(deviations);
    this.standardDeviation = Math.sqrt(getAverage());
  }

  public void mainLoop(){
    calculateSum(numbers);
    calculateAverage(numbers);
    calculateStandardDeviation();
  }

  public void printResults(){
    System.out.print("The Standard Deviation is: " + standardDeviation);
  }

  public static void main(String[] args) {
    Arrays newArray = new Arrays();
    newArray.promptUser();
    newArray.mainLoop();
    newArray.printResults();
    
  }//end of main
}//end of class