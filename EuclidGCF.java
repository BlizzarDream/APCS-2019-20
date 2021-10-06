import java.util.Scanner;

public class EuclidGCF{
  public static void main(String[] args){
    Scanner k = new Scanner(System.in);
    System.out.println("Enter a number: ");
    int a = k.nextInt();
    System.out.println("Enter another number: ");
    int b= k.nextInt();
    System.out.println("The GCF of "+a+" and "+b+" is "+EuclidAlgorithm(a,b));
  }
  public static int EuclidAlgorithm(int a, int b){
    if(Math.max(a,b)%Math.min(a,b)==0)
      return Math.min(a,b);
    return EuclidAlgorithm(Math.min(a,b),Math.max(a,b)%Math.min(a,b));
  }
}