import java.util.Scanner;

public class Quadratic {
  public static void calculateRoots(double a, double b, double c) {
    double temp = Math.sqrt((b*b)-(4*a*c));
    double x1 = (-1*b) + temp;
    double x2 = (-1*b) - temp;
    System.out.print("The roots of the inputted quadratic are " + x1 + " and " +x2);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Assuming standard form (ax^2+bx+c),enter the values of a, b, and c in the given order");
    double a = sc.nextDouble();
    double b = sc.nextDouble();
    double c = sc.nextDouble();
    sc.close();
    calculateRoots(a,b,c);
  }
}