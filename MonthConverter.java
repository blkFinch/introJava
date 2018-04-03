//N.hutchison
//month converter
//

import java.util.Scanner;

public class MonthConverter{

  private int userMonth;
  private String month;

  Scanner userInput = new Scanner(System.in);

  public int getUserInput(){
    System.out.println("Please enter a number 1-12");
    return userInput.nextInt();
  }

  public void setUserMonth(){
    userMonth = getUserInput();
  }

  public void checkMonth(){
    System.out.println("Calculating month\n.\n.\n.");
    switch(userMonth){
      case 1: month = "January";
                    break;
      case 2: month = "Febuary";
                    break;
      case 3: month = "March";
                    break;
      case 4: month = "April";
                    break;
      case 5: month = "May";
                    break;
      case 6: month = "June";
                    break;
      case 7: month = "July";
                    break;
      case 8: month = "August";
                    break;
      case 9: month = "September";
                    break;
      case 10: month = "October";
                    break;
      case 11: month = "November";
                    break;
      case 12: month = "December";
                    break;
      default: month = "not a month";
                    break;
    }
  }

  //including this function to meet the if/else requirements
  public void checkMonthAlt(){
    System.out.println("Calculating month\n.\n.\n.");
    if(userMonth == 1){ month = "January"; }
    else if(userMonth == 2){ month = "Febuary"; }
    else if(userMonth == 3){ month = "March"; }
    else if(userMonth == 4){ month = "April"; }
    else if(userMonth == 5){ month = "May"; }
    else if(userMonth == 6){ month = "June"; }
    else if(userMonth == 7){ month = "July"; }
    else if(userMonth == 8){ month = "August"; }
    else if(userMonth == 9){ month = "September"; }
    else if(userMonth == 10){ month = "October"; }
    else if(userMonth == 11){ month = "November"; }
    else if(userMonth == 12){ month = "December"; }
    else
      month = "not a month";
  }

  public void printMonth(){
    System.out.println("That is " + month);
  }

  public static void main(String[] args) {
    MonthConverter newMonth = new MonthConverter();
    newMonth.setUserMonth();
    newMonth.checkMonth();
    newMonth.printMonth();
    
  }//end of main
}//end of class