// the SportChooser program!

import java.util.Scanner;

public class SportChooser   // this is the program class
   {    // here is the main method of the program
   

   public static void main(String[] args){
      
    Scanner scanner = new Scanner(System.in);//added a scanner to get input

     int seasonNum = 1;//init the variable to trigger while loop
      // loop 'while' the seasonNum entered by the user is in valid range of 1 - 4
     //
    while ( seasonNum >= 1 && seasonNum <= 4  )//added '=' to correct logic
         {

    
     System.out.println("Enter the season you like the most (1-Winter, 2-Spring, 3-Summer, 4-Fall): " );
     seasonNum = scanner.nextInt();//added ';' at end of line

         switch ( seasonNum ){
  		    
          case 1:  // Winter...
  		       {
  			   System.out.println("Snowboarding!\n");
  			   break;
  		       }
  		    case 2:   // Spring...
  		       {
  			   System.out.println("Sailing!\n");
           break;//added break 
  		       }
  		    case 3:   // Summer...
  		       {
  			   System.out.println("Surfing!\n");
  			   break;
  		       }
  		    case 4:
  		       {
  			   System.out.println("Bicycling!\n");
  			   break;
  		       }
  		    default:
  		       {
  			   System.out.println("Invalid entry... goodbye!\n");
  			   break;
  		       }
  		    }   // end of the switch...
	     }   // end of the 'while' loop

      System.out.println("That's the end of this exciting program!");
      }    // end main
   } // end class