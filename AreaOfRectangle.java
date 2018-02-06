/*
N.hutchison
1/30/18
OOP design calculate the area of rectangle

/ Honor Code: I pledge that this program represents my own
// program code. I received help from (enter the names of
// others that helped with the assignment, write no one if
// you received no help) in designing and debugging my program.

*/
import java.util.Scanner;

public class AreaOfRectangle {

	Scanner input = new Scanner(System.in);

	//variables
	private double width;
	private double height;
	private double area;
	private double perimeter;
	
	public double getWidth(){
		System.out.print("Enter width: ");
		width =input.nextDouble();
		return width;
	}

	public double getHeight(){
		System.out.print("Enter the height: ");
		height = input.nextDouble();
		return height;
	}

	public void setWidth(double width){
		this.width = width;
	}

	public void setHeight(double height){
		this.height = height;
	}

	public double getArea(){
		area = width * height;
		return area;
	}


	public void setArea(double area){
		this.area = area;
	}

	public double getPerimeter(){
		perimeter = (width * 2) + (height * 2);
		return perimeter;
	}

	public void setPerimeter(double perimeter){
		this.perimeter = perimeter;
	}

	//constructor
	public AreaOfRectangle(double width, double height, double area, double perimeter){
		super();//a call to the super class or parent
		this.width =width;
		this.height = height;
		this.area = area;
		this.perimeter = perimeter;
	}

	public String toString(){
		return "Area of rectangle with height " + height + "and width " + width + " is " + area + 
							"with a perimeter of " + perimeter;
	}

	public void buildObject(){
		getWidth();
		getHeight();
		getArea();
		getPerimeter();
	}

	public void printResult(){
		System.out.println(toString());

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle rectangle = new AreaOfRectangle(0,0,0,0);
		rectangle.buildObject();
		rectangle.printResult();
		
	}//end of main

}//end of class
