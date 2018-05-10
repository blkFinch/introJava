/*
N. Hutchison
4/17/16
Lincoln Speech Reader

-This program will count the words in lincoln.txt

Honor Code: I pledge that this program represents my own
program code. I received help from no one in designing 
and debugging my program.
*/
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class LincolnReader{

  private int count;


  public void readFile()
                  // throws FileNotFoundException
  {
    try{
      File file = new File("./lincoln.txt");
      Scanner scanner = new Scanner(file);
      
      while(scanner.hasNext()){
        System.out.print(scanner.next() + " ");
        count ++;
        }
      }
      catch(FileNotFoundException e){
        System.out.println("Please place 'lincoln.txt' in working directory");
      }
  }

  public void printWordCount(){

    System.out.println("");
    System.out.println("");
    System.out.println(count + " words");
    
  }

  public static void main(String[] args)
                        throws FileNotFoundException 
    {

      LincolnReader speech = new LincolnReader();
      speech.readFile();
      speech.printWordCount();

  }//end of main

}//end of class

