import java.util.Scanner;

public class Year {
  public static boolean isLeapYear(int Year){
    return Year%400==0||(Year%4==0 && Year%100!=0);
  }
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a year");
    int Y = sc.nextInt();
    if (isLeapYear(Y))
      System.out.println("Year " +Y+ " is a leap year");
    else
      System.out.println("Year " +Y+ " is not a leap year");
  }
}