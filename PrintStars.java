import java.util.Scanner;

public class PrintStars{
  public static void LeftTriangle(int Lines) {
    for (int i=1; i<=Lines; i++) {
      for (int j=1; j<=i; j++) 
        System.out.print("*");
      System.out.println();
    }
  }
  public static void RightTriangle(int Lines) {
    for (int i=1; i<=Lines;i++) {
      for (int j=1; j<=Lines-i;j++)
        System.out.print(" ");
      for (int j=1; j<=i; j++)
        System.out.print("*");
      System.out.println();
    }
  }
  public static void CenterTriangle(int Lines) {
    for (int i=1; i<=Lines;i++) {
      for (int j=1; j<=Lines-i;j++)
        System.out.print(" ");
      for (int j=1; j<=2*i-1; j++)
        /*I can't find another way to center the triangle without 
       * incrementing the asterisks in each row by two*/
        System.out.print("*");
      System.out.println();
    }
  }
  public static void main(String[]args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("First, select the size of the triangle with an integer.");
    int Lines = sc.nextInt();
    System.out.println("Now, please select your choice of triangle:\n\t1)Left-Centered\n\t2)Right-Centered\n\t3)Middle-Centered");
    int Choice = sc.nextInt();
    switch(Choice){
      case 1:
        LeftTriangle(Lines);
        break;
      case 2:
        RightTriangle(Lines);
        break;
      case 3:
        CenterTriangle(Lines);
    }
  }
}