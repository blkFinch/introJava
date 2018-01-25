
import java.util.Scanner;

public class AreaOfCircle{

	Scanner input = new Scanner(System.in);

	private final double PI = 3.14159;
	private double radius;
	private double area;


	public double getRadius(){
		System.out.print("Enter the radius: ");
		radius = input.nextDouble();
		return radius;
	}

	public void setRadius(double radius){
		this.radius = radius;

	}

	public double getArea(){
		area = Math.pow(radius,2) * PI;
		return area;
	}

	public void setArea(double area){
		this.area = area;
	}

	public void printResult(){
		System.out.println("The area is " + area);
	}

	public AreaOfCircle(double radius, double area){
		super();
		this.radius = radius;
		this.area = area;
	}

	@Override
	public String toString(){
		return "The area is " + area; 
	}

	public void loop(){
		getRadius();
		getArea();
		System.out.println(toString());
	}

	public static void main(String[] args){

		AreaOfCircle circle = new AreaOfCircle(0,0);
		circle.loop();

	}//end of main
}//end of class