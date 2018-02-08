//N.Hutchison
//2/8/18
//
//Rock Paper Scissors Game
//
 //Honor Code: I pledge that this program represents my own
// program code. I received help from no one
//in designing and debugging my program.

import java.util.Scanner;
import java.util.Random;

public class RPS{
  
  Scanner input = new Scanner(System.in);
  Random random = new Random();
  private int userInput;
  private int compChoice;
  private int games;

  public int getGames(){
    System.out.println("How many games? ");
    games = input.nextInt();
    return games;
  }

  public void setGames(int games){
    this.games = games;
  }

  public int getInput(){
    System.out.println("1- Rock \t2-Paper \t3-Scissors");
    System.out.print("Enter Choice: ");
    userInput = input.nextInt();

    return userInput;
  }

  public void setInput(int userInput){
    this.userInput = userInput;
  }

  public int getComputerChoice(){
    compChoice = random.nextInt(3 - 1 + 1) + 1;
    return compChoice;
  }

  public void setCompChoice(int compChoice){
    this.compChoice = compChoice;
  }

  public RPS(int games, int userInput, int compChoice){
    super();
    setGames(games);
    setInput(userInput);
    setCompChoice(compChoice);
  }

  public void playerChoseRock(){

    System.out.println("You chose Rock!");
    if(compChoice == 1){
          System.out.println("Computer chose Rock");
          System.out.println("DRAW!");

    }
    else if(compChoice == 2){
      System.out.println("Computer chose Paper");
      System.out.println("You Lose");

    }
    else{
      System.out.println("Computer chose Scissors");
      System.out.println("You Win!");
    }
  }

   public void playerChosePaper(){

    System.out.println("You chose Paper!");

    if(compChoice == 1){
          System.out.println("Computer chose Rock");
          System.out.println("Win!");

    }
    else if(compChoice == 2){
      System.out.println("Computer chose Paper");
      System.out.println("DRAW!");

    }
    else{
      System.out.println("Computer chose Scissors");
      System.out.println("You Lose!");
    }
  }

   public void playerChoseScissors(){

    System.out.println("You chose Scissors!");
    if(compChoice == 1){
          System.out.println("Computer chose Rock");
          System.out.println("You Lose!");

    }
    else if(compChoice == 2){
      System.out.println("Computer chose Paper");
      System.out.println("You Win!");

    }
    else{
      System.out.println("Computer chose Scissors");
      System.out.println("DRAW!");
    }
  }



  public void decideWinner(){

    switch(userInput){
      case 1:
        playerChoseRock();
        break;
      case 2:
        playerChosePaper();
        break;
      case 3:
        playerChoseScissors();
        break;
    }
  }


  public void runGame(){
    getGames();
    while(games > 0 ){
      getInput();
      getComputerChoice();
      decideWinner();
      games -= 1;
    }
  }


  public static void main(String[] args) {
    RPS game = new RPS(0,0,0);
    game.runGame();

  }//end of main
}//end of class