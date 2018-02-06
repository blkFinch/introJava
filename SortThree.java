//N.Hutchison
// Sort Three Integers
//
//

import java.util.Scanner;
import java.util.Arrays;

public class SortThree {
	Scanner input = new Scanner(System.in);
	
	int[] userArray = new int[3];
	int num1;
	int num2;
	int num3;

	public int getNum1() {
		System.out.print("Enter first number: ");
		num1 = input.nextInt();
		return num1;
	}

	public int getNum2() {
		System.out.print("Enter second number: ");
		num2 = input.nextInt();
		return num2;
	}

	public int getNum3() {
		System.out.print("Enter third number: ");
		num3 = input.nextInt();
		return num3;
	}

	public void buildArray() {
		userArray[0]= getNum1();
		userArray[1]= getNum2();
		userArray[2]= getNum3();
		Arrays.sort(userArray);
	}
	
	public String toString() {
		return "" + userArray[0] + '\n' + userArray[1] + '\n' + userArray[2]; 
	}
	
	public void printResult() {
		System.out.println(toString());
	}

	public static void main(String[] args) {
		SortThree test = new SortThree();
		test.buildArray();
		test.printResult();	

	}//end of main

}//end of class
