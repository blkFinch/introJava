public class WelcomeJava5{

  public static void WelcomeXTimes(){
    String welcome = new String(new char[5]).replace("\0","Welcome to java \n");
    System.out.print(welcome);
  }//end of WelcomeXTimes

  public static void main(String[] args){
    WelcomeJava5 newuser = new WelcomeJava5();
    newuser.WelcomeXTimes();
  }//end of main
}//end of class