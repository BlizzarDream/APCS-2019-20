public class Line {
  private Point a,b;
  public Line(Point A, Point B) {
    a=A;
    b=B;
  }
  public double getSlope() {
    return a.getSlope(b);
  }
  public boolean isIntersect(Line Other) {
    if (getSlope() != Other.getSlope())
      return true;
    else
      return false;
  }
  public Point getIntersect(Line Other) {
    double Intercept1 = a.getY() - getSlope() * a.getX();
    double Intercept2 = Other.a.getY() - Other.getSlope() * Other.a.getX();
    if (isIntersect(Other)) {
      double X = (Intercept2 - Intercept1)/(getSlope()-Other.getSlope());
      double Y = getSlope() * X + Intercept1;
      return new Point(X,Y);
    }
    else{
      if (Intercept1 == Intercept2){
        System.out.println("The two lines have infinite intersections");
      }
      else{
        System.out.println("The two lines don't intersect");
      }
      return null;
    }
  }
}