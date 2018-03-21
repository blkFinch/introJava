//N.Hutchison
//Midterm
//Honor Code: This represents my own program code
//I recieved help from no one is designing or debugging this code

import java.util.Scanner;
public class Occurrence{

  Scanner input = new Scanner(System.in);

  private int max;
  private int count;

  //loop for getting user input
  public void getInput(){
    System.out.println("Enter numbers (enter 0 to finish):");
    int userInput = input.nextInt();
    max = userInput;

    while(userInput != 0){
      userInput=input.nextInt();
      if(userInput > max){
        max = userInput;
        count = 1;
      }
      else if (userInput == max){
      count ++;
      }
      
    }

    System.out.println("Sequence complete- max = " + max);
    System.out.println("occurrences of max: " + count);

  }

  public static void main(String[] args) {
    Occurrence newArray = new Occurrence();
    newArray.getInput();
  }//end of main
}//end of class