//N.hutchison
//month converter
//

import java.util.Scanner;

public class MonthConverter{

  private int userMonth;
  private String month;
  private String season;

  Scanner userInput = new Scanner(System.in);


  public int getUserInput(){
    System.out.println("Please enter a number 1-12");
    return userInput.nextInt();
  }

  public void setUserMonth(){
    userMonth = getUserInput();
  }

  public void checkSeason(){
    System.out.println("Calculating season\n.\n.\n.");
    switch(userMonth){
      case 12: 
      case 1: 
      case 2: 
              season = "Winter";
              break;

      case 3: 
      case 4: 
      case 5: 
              season = "Spring!";
              break;

      case 6: 
      case 7: 
      case 8: 
              season = "Summer";
              break;

      case 9: 
      case 10: 
      case 11: 
              season = "Fall...";
              break;

      default: month = "not a month";
                    break;
    }
  }

  //including this function to meet the if/else requirements
  public void checkMonth(){
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

  public void printResults(){
    System.out.println(month + " is in " + season );
  }

  public static void main(String[] args) {
    MonthConverter newMonth = new MonthConverter();
    newMonth.setUserMonth();
    newMonth.checkMonth();
    newMonth.checkSeason();
    newMonth.printResults();
    
  }//end of main
}//end of class