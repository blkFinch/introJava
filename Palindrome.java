import java.util.Scanner;

public class Palindrome{

  boolean isPalindrome = true;
  String userInput;

  Scanner input = new Scanner(System.in);

  public void getInput(){
    System.out.print("Enter string: ");
    String userIn = input.nextLine();
    this.userInput = userIn;
  }

  public void checkPalindrome(){
    int low = 0;
    int high = userInput.length() - 1;

    while(low < high ){
      if(userInput.charAt(low) != userInput.charAt(high)){
        isPalindrome = false;
        break;
      }

      low ++;
      high --;
    }

    if(isPalindrome){
      System.out.println(userInput + " is a palindrome!");
    }
    else{
      System.out.println("Not a Palindrome!!");
    }
  }
  public static void main(String[] args) {
    Palindrome userPal = new Palindrome();
    userPal.getInput();
    userPal.checkPalindrome();
    
  }
}