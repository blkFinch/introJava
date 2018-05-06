
import java.util.Scanner;

public class DogWeight{

  int numberOfDogs;
  float totalWeight;
  private int dogNo;//just for readability for user

  Scanner scanner = new Scanner(System.in);

  public void howManyDogs(){
    System.out.println("How many dogs do you have? ");
    this.numberOfDogs = scanner.nextInt();
  }

  public void dogsWeight(){
    dogNo = 1;
    for(int i = numberOfDogs; i>0; i--){
      System.out.println("How much does dog number " + dogNo + " weigh in pounds?");
      this.totalWeight += scanner.nextInt();
      dogNo++;
    }
  }

  public void printTotal(){
    System.out.println("All your dogs together weigh " + totalWeight + " pounds! Wow!");
  }

  public static void main(String[] args) {
    DogWeight newDogs = new DogWeight();
    newDogs.howManyDogs();
    newDogs.dogsWeight();
    newDogs.printTotal();
  }
}