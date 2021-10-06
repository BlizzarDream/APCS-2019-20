import java.util.Scanner;

public class TimetoSeconds {
  public static void convertToSeconds(int Hours,int Minutes,int Seconds) {
    System.out.print(Hours+" hours, "+Minutes+" minutes, and "+Seconds+" seconds sre equivalent to "+
                       ((Hours*3600)+(Minutes*60)+Seconds)+" seconds.");
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter the hours, minutes, and seconds in the order given");
    int Hours = sc.nextInt();
    int Minutes = sc.nextInt();
    int Seconds = sc.nextInt();
    sc.close();
    convertToSeconds(Hours,Minutes,Seconds);
  }
}