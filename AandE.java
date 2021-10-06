import java.util.Scanner;

public class AandE {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Write anything");
    String Input = sc.next();
    sc.close();
    Input = Input.toLowerCase();
    int NumA = Input.length() - (Input.replace("a","")).length();
    int NumE = Input.length() - (Input.replace("e","")).length();
    System.out.println("a: "+NumA+"\ne: "+NumE);
  }
}