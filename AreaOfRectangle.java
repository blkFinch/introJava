/*
N.hutchison
1/30/18
OOP design calculate the area of rectangle

Honor code: this is my code on mmy honor

*/
import java.util.Scanner;

public class AreaOfRectangle {

	Scanner input = new Scanner(System.in);

	//variables
	double width;
	double height;
	double area;
	
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

	//constructor
	public AreaOfRectangle(double width, double height, double area){
		super();//a call to the super class or parent
		this.width =width;
		this.height = height;
		this.area = area;
	}

	public String toString(){
		return "Area of rectangle with height " + height + "and width " + width + " is " + area;
	}

	public void buildObject(){
		getWidth();
		getHeight();
		getArea();
	}

	public void printResult(){
		System.out.println(toString());

	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle rectangle = new AreaOfRectangle(0,0,0);
		rectangle.buildObject();
		rectangle.printResult();
		
	}

}
