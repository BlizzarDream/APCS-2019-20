import java.util.Scanner;

public class SSN {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a social security number in the form: XXX - XX - XXXX");
    String Input = sc.next();
    sc.close();
    String Output = Input.replace("-","");
    System.out.println(Output);
  }
}