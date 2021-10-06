public class Point implements Place{
  private int x,y;
  public Point(int a, int b){
    x=a;
    y=b;
  }
  public int getX(){
    return x;
  }
  public int getY(){
    return y;
  }
  public double distance(Place other){
    return Math.sqrt(Math.pow(other.getX()-x,2)+Math.pow(other.getY()-y,2));
  }
}