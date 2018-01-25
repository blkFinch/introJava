
import java.util.Scanner;

public class AreaOfCircle{

	Scanner input = new Scanner(System.in);

	final double PI = 3.14159;
	double radius;
	double area;

	public void getRadius(){
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
	}

	public void calculateArea(){
		area = Math.pow(radius,2) * PI;
	}

	public void printResult(){
		System.out.println("The area is " + area);
	}


	public static void main(String[] args){

		AreaOfCircle circle = new AreaOfCircle();
		circle.getRadius();
		circle.calculateArea();
		circle.printResult();

	}//end of main
}//end of class