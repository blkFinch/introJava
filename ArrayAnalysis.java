import java.util.Scanner;
import java.util.Random;
import java.text.DecimalFormat;



public class ArrayAnalysis{

  private int size;
  double[] list;

  private static DecimalFormat df = new DecimalFormat("###.##");//for cleaner output of BMI


  public int getSize(){
    return size;
  }

  public void setSize(int size){
    this.size = size;
  }

  public void createRandomList(){
    Scanner input = new Scanner(System.in); 
    System.out.print("Enter the size of the list: ");
    this.setSize(input.nextInt());

    list = new double[size];

    Random rand = new Random();

    for(int i = 0; i < size; i++){
      list[i] = rand.nextDouble() * 100;
    }
  }

  public void printList(){
    for(int i = 0; i < size; i++){
      System.out.print(df.format(list[i]) + " ");
      if(i % 8 == 0 && i != 0){
        System.out.println();
      }
    }
  }

  public static void main(String[] args) {
    ArrayAnalysis alist = new ArrayAnalysis();
    alist.createRandomList();
    alist.printList();
  }//end of main
}//end of class