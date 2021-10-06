import java.util.Scanner;

public class RectangleTest
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the length: ");
    double l = sc.nextDouble();
    System.out.print("Enter the width: ");
    double w = sc.nextDouble();
    Rectangle rect = new Rectangle(l,w);
    double area = rect.getArea();
    System.out.println("length = " + l + "width = " + w + "area = " + area);
    sc.close();
  }
}