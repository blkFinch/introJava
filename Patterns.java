//N.Hutchison
//
//
//


public class Patterns{
  
  public void patternA(){

    System.out.println();
    System.out.println("Pattern A");

    int[] row = {0,1,2,3,4,5,6};

    int iterations = 1;

    for(int i = 1; i <=6; i++){

      for(int columns = 6; columns <=6; columns++){

        for(int h = 1; h <= iterations; h++){
        System.out.print(row[h]);
        }

        iterations++;
      }

      System.out.println();
    }
  }

  public void patternB(){

    System.out.println();
    System.out.println("Pattern B");

    int[] row = {0,1,2,3,4,5,6};

    int iterations = 6;

    for(int i = 1; i <=6; i++){

      for(int columns = 6; columns <=6; columns++){

        for(int h = 1; h <= iterations; h++){
        System.out.print(row[h]);
        }

        iterations--;
      }

      System.out.println();
    }

  }

  public void patternC(){

    System.out.println();
    System.out.println("Pattern C");

    int[] row = {0,1,2,3,4,5,6};

    int iterations = 1;
    int spaces = 5;

    for(int i = 1; i <=6; i++){
      
      for(int s = 1; s <=spaces; s++){
        System.out.print(" ");
      }

      for(int columns = 6; columns <=6; columns++){

        for(int h = 1; h <= iterations; h++){
          System.out.print(row[h]);
        }

        iterations++;
        spaces--;
      }

      System.out.println();
    }

  }

  public void patternD(){

    System.out.println();
    System.out.println("Pattern D");

    int[] row = {0,1,2,3,4,5,6};

    int iterations = 6;
    int spaces = 1;

    for(int i = 1; i <=6; i++){
      
      for(int s = 1; s <=spaces; s++){
        System.out.print(" ");
      }

      for(int columns = 6; columns <=6; columns++){

        for(int h = 1; h <= iterations; h++){
          System.out.print(row[h]);
        }

        iterations--;
        spaces++;
      }

      System.out.println();
    }

  }


  public static void main(String[] args) {
    Patterns pattern = new Patterns();
    pattern.patternA();
    pattern.patternB();
    pattern.patternC();
    pattern.patternD();
    
  }//end of main
}//end of class