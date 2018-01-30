// NHutchison
//Added dog cat fish age functions
//1/30/18
import java.util.Scanner;

public class MyDogsAge{ // this is the program class

	Scanner input = new Scanner(System.in);

	int dogAge, catAge, fishAge;


	public void getDogAge(){
		System.out.print("What is your dog's age? ");
		dogAge = input.nextInt();
	}


	public void getCatAge(){
		System.out.print("What is your cat's age? ");
		catAge = input.nextInt();
	}

	public void getFishAge(){
		System.out.print("What is your fishes'ses age? ");
		fishAge = input.nextInt();
	}
	
	public void printPetsAge(){
		System.out.println("you dog is " + dogAge + " years old!");
		System.out.println("you cat is " + catAge + " years old!");
		System.out.println("you fish is " + fishAge + " years old!");

	}


   
   public static void main(String[] args){
   		MyDogsAge petsAge = new MyDogsAge();
   		petsAge.getDogAge();
   		petsAge.getCatAge();
   		petsAge.getFishAge();

   		petsAge.printPetsAge();

      
      }    // end main
   }    // end class