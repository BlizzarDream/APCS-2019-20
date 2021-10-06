public class Triangle {
  private Point p1,p2,p3;
  public Triangle(double x1,double y1,double x2,double y2,double x3,double y3) {
    p1 = new Point(x1,y1);
    p2 = new Point(x2,y2);
    p3 = new Point(x3,y3);
  }
  public double getPerimeter() {
    return p1.getLength(p2) + p1.getLength(p3) + p2.getLength(p3);
  }
  public double getArea() {
    double s = (p1.getLength(p2) + p1.getLength(p3) + p2.getLength(p3))/2;
    return Math.sqrt(s*(s-p1.getLength(p2))*(s-p1.getLength(p3))*(s-p2.getLength(p3)));
  }
}