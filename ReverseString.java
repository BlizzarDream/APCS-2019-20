import java.util.Scanner;

public class ReverseString{
  public static String reverse(String str) {
    String Final = "";
    for (int i=str.length()-1; i>=0; i--){
      char temp = str.charAt(i);
      Final+=temp;
    }
    return Final;
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter anything.");
    String str = sc.nextLine();
    sc.close();
    System.out.println(reverse(str));
  }
}