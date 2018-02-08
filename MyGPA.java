//N.Hutchison
//My GPA Proj
//Intro to Comp Sci

import java.util.Scanner;

class MyGPA{
  
  double userGPA;
  int userAge;

  Scanner input = new Scanner(System.in);

  public double getGPA(){
    System.out.print("Please enter your GPA: ");
    userGPA = input.nextDouble();
    return userGPA;
  }

  public int getAge(){
    System.out.print("Please enter your Age: ");
    userAge = input.nextInt();
    return userAge;
  }

  public MyGPA(){
    super();
    this.userGPA = getGPA();
    this.userAge = getAge();
  }

  public void printResults(){
    System.out.println("Your age is: " + userAge);
    System.out.println("Your GPA: " + userGPA);
  }

  public static void main(String[] args) {
    MyGPA user = new MyGPA();
    user.printResults();
  }
}