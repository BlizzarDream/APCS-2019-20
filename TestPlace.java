import java.util.Scanner;

public class TestPlace{
    public static boolean sameDistance(Place a, Place b, Place c){
      return (a.distance(b)==a.distance(c));
    }
  public static void main(String[]args){
    Scanner k=new Scanner(System.in);
    System.out.println("Enter the coordinates of the first location");
    Place a = new Point(k.nextInt(),k.nextInt());
    Place b = new Point(k.nextInt(),k.nextInt());
    Place c = new Point(k.nextInt(),k.nextInt());
    if (sameDistance(a,b,c))
      System.out.println("Places b and c are the same distance from place a");
    else
      System.out.println("Places b and c are different distances from palce a");
  }
}