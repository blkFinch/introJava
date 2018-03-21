//N.Hutchison
//What To Do
//Intro to Comp Sci

import java.util.Scanner;
public class WhatToDo{

  Scanner input = new Scanner(System.in);
  private double userMoney;
  private boolean isBroke = false;

  public void getInput(){
    System.out.print("How much money do you have?");
    this.userMoney = input.nextDouble();
  }

  public void checkMoney(){
    if(userMoney < 0){
      System.out.println("Negative money- you're broke");
      isBroke = true;
    }
    else if(userMoney == 0){
      System.out.println("Go read a book!");
    }
    else if(userMoney <= 10.5){
      System.out.println("Go to a movie!");
    }
    else if(userMoney <= 25){
      System.out.println("Dinner and dancing!");
    }
    else if(userMoney > 25){
      System.out.println("You're flush! Go to vegas!");
    }
  }

  public void mainLoop(){
    while(!isBroke){
      getInput();
      checkMoney();
    }
    System.out.println("G O O D B Y E");
  }


  public static void main(String[] args) {
    WhatToDo newUser = new WhatToDo();
    newUser.mainLoop();
  }//end of main
}//end of class