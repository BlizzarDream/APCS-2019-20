import java.util.Scanner;

public class CylinderTest {
  public static void main(String[] args) {
    Scanner kb = new Scanner(System.in);
    System.out.print("Enter the radius: ");
    double r = kb.nextDouble();
    System.out.print("Enter the height: ");
    double h = kb.nextDouble();
    Cylinder cylinder = new Cylinder(r,h);
    double Volume = cylinder.getVolume();
    System.out.println("radius = " + r + " height = " + h + " volume = " + Volume);
    kb.close();
  }
}
  