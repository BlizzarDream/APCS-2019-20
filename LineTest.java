import java.util.Scanner;
public class LineTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter x1,y1,x2,y2,x3,y3,x4, and y4 in the given order");
     double x1 = sc.nextDouble();
     double y1 = sc.nextDouble();
     double x2 = sc.nextDouble();
     double y2 = sc.nextDouble();
     double x3 = sc.nextDouble();
     double y3 = sc.nextDouble();
     double x4 = sc.nextDouble();
     double y4 = sc.nextDouble();
     Point P1 = new Point(x1,y1);
     Point P2 = new Point(x2,y2);
     Point P3 = new Point(x3,y3);
     Point P4 = new Point(x4,y4);
     Line Line1 = new Line(P1,P2);
     Line Line2 = new Line(P3,P4);
     if (Line1.isIntersect(Line2)) {
       Point intersect = Line1.getIntersect(Line2);
       System.out.println("The two lines intersect at " + intersect.printPoint());
     }
     else {
       Line1.getIntersect(Line2);
     }
  }
}