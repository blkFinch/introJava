
public class AreaOfRectangle {

	//variables
	double width = 4.5;
	double height = 7.9;
	double area;
	
	public void calculateArea() {
		area = width * height;
		
		System.out.println("The area is " + area);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AreaOfRectangle rectangle = new AreaOfRectangle();
		rectangle.calculateArea();
	}

}
