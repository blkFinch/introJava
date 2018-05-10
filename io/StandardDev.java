//N.hutchison
// 3/29/18
//
// Deviation
//
// Honor Code: On my honor this is my own program code,
// I recieved help from no one in designing and debugging 
// this code.

import java.util.Scanner;
import java.util.Random;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.Arrays;

public class StandardDev{
  Random rand = new Random();

  double[] numbers = new double[32];
  double[] deviations = new double[32];

  Scanner input = new Scanner(System.in);
  private double average;
  private double sum;
  private double standardDeviation;
  private double max;
  private double min;

  //getters and setters
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

  //get input from user
  public void promptUser(){

    for(int i = 0; i <numbers.length; i++){
      System.out.print("Please enter a number: ");
      numbers[i] = input.nextDouble();
    }
  }

  //generates the random numbers
  public void generateRandomArray(){
    for(int i = 0; i <numbers.length; i++){
      int n = rand.nextInt(501);
      numbers[i] = n;
      System.out.print(n + " ");
    }
  }

  private void sortArray(){
    Arrays.sort(numbers);
    this.min = numbers[ 0 ];
    this.max = numbers[ numbers.length - 1 ];
  }

  //calculates sum
  public double calculateSum(double[]x){
    double thisSum = 0;
    for(int i =0; i < x.length; i++)
      thisSum += x[i];
    return thisSum;
  }

  //calculates average of array
  double calculateAverage(double[]x, double sum){
    return sum/x.length;
  }

  //calculates a single deviation
  double calculateDeviation(double x){
    return Math.pow((x - getAverage()), 2);
  }

  //calculates the average of all deviations
  void calculateStandardDeviation(){
    for(int i = 0; i < numbers.length; i++){
      deviations[i] = calculateDeviation(numbers[i]);
    }

    double deviationSum = calculateSum(deviations);
    standardDeviation = Math.sqrt(calculateAverage(deviations, deviationSum));
  }

  //handles all the calculations
  public void mainLoop(){
    sortArray();
    setSum(calculateSum(numbers));
    setAverage(calculateAverage(numbers, getSum()));
    calculateStandardDeviation();
  }

  //PRINT RESULTS
  public String resultsString(){
    return "The max is: " + max + "\n" + "the min is: " + min + "\n" +
            "the standard deviation is: " + standardDeviation;
  }
  public void printResults(){
    System.out.println("The Standard Deviation is: " + standardDeviation);
    System.out.println("The max is: " + max);
    System.out.println("The min is: " + min);
    try{
      File file = new File("Standard.txt");
      FileWriter fw = new FileWriter(file);
      BufferedWriter bw = new BufferedWriter(fw);
      bw.write(resultsString());
      bw.close();
    }catch(IOException e){
      e.printStackTrace();
    }
  }

  public static void main(String[] args) {
    StandardDev newArray = new StandardDev();
    newArray.generateRandomArray();
    newArray.mainLoop();
    newArray.printResults();
    
  }//end of main
}//end of classs