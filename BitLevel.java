//N.hutchison
//Bit Converter
//
//Honor Code: This represents my own program code,
//I recieved help from no one in designing or debugging
//this code


import java.util.Scanner;
public class BitLevel{


  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter integer: ");
    int someNum = input.nextInt();

    String binaryString = Integer.toBinaryString(someNum);
    System.out.println(binaryString);
    
    //loop version
    // for(int i = 15, i >= 0; i--){
    //   int check = someNum >> i;
    //   System.out.print(check);
    // }
    //
  }
}