import java.util.Scanner;

public class TriangleTest {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter x1: ");
    double x1 = kb.nextDouble();
    System.out.print("Enter y1: ");
    double y1 = kb.nextDouble();
    System.out.print("Enter x2: ");
    double x2 = kb.nextDouble();
    System.out.print("Enter y2: ");
    double y2 = kb.nextDouble();
    System.out.print("Enter x3: ");
    double x3 = kb.nextDouble();
    System.out.print("Enter y3: ");
    double y3 = kb.nextDouble();
    Triangle triangle = new Triangle(x1,y1,x2,y2,x3,y3);
    double Area = triangle.getArea();
    double Perimeter= triangle.getPerimeter();
    System.out.print("The area of the triangle is " + Area + "and the perimeter is " + Perimeter);
  }
}