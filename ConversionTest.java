import java.util.Scanner;

public class ConversionTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Please define the value that you wish to convert by entering one of three numbers:\n\t1)Binary\n\t2)Decimal\n\t3)Hexadecimal");
    int Choice = sc.nextInt();
    while (Choice>3 || Choice <1) {
      System.out.println("That is not one of the avaiable choices. Please try again.\n\t1)Binary\n\t2)Decimal\n\t3)Hexadecimal");
      Choice = sc.nextInt();
    }
    if (Choice == 1)  {
      System.out.println("Please enter a Binary Number");
      String Val = sc.next();
      Binary B = new Binary(Val);
      Decimal Dec = B.convertToDecimal();
      Hexadecimal Hexa = B.convertToHexadecimal();
      System.out.println("Decimal: " + Dec.getDec());
      System.out.println("Hexadecimal:  " + Hexa.getHexa());
    }
    if (Choice == 2){
      System.out.println("Please enter an Integer");
      int Val = sc.nextInt();
      Decimal D = new Decimal(Val);
      Hexadecimal Hexa = D.convertToHexa();
      Binary Bi = D.convertToBinary();
      System.out.println("Binary: " + Bi.getBi());
      System.out.println("Hexadecimal: "+ Hexa.getHexa());
    }
    if (Choice == 3) {
      System.out.println("Please enter a Hexadecimal");
      String Val = sc.next();
      Hexadecimal H = new Hexadecimal(Val);
      Decimal Dec = H.convertToDecimal();
      Binary Bi = H.convertToBinary();
      System.out.println("Binary: " + Bi.getBi());
      System.out.println("Decimal: " + Dec.getDec());
    }
    sc.close();
  }
}