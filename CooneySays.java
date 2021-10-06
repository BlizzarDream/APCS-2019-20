import java.util.Scanner;

public class CooneySays{
  public static boolean checkCondition(String str) {
    int temp = 0;
    for (int i = 0; i<str.length(); i++){
      if (i+1!=str.length() && str.charAt(i) == str.charAt(i+1))
            temp++;
    }
    return temp>0;
  }
  public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int WinCounter=0;
    String str;
    System.out.println("Try to guess what words Cooney like: "+
                       "\nCooney likes SUMMER but not WINTER"+
                       "\nCooney likes MOON but not SUN"+
                       "\nCooney likes QUEEN but not KING");
    while (WinCounter < 5) {
      str = sc.next().toUpperCase();
      if (checkCondition(str)) {
        System.out.println("Cooney likes "+str);
        WinCounter++;
      }
      else
        System.out.println("Cooney doesn't like "+str);
    }
    System.out.println("I think you know which words Cooney likes now");
  }
}