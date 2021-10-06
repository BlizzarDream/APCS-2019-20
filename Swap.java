import java.util.Scanner;

public class Swap{
  public static void Swap10with1(int Num){
    int Hundr = Num/100;
    int temp = Num%100;
    int Tens = temp/10;
    int Ones = temp%10;
    int NewNum = Hundr*100 + Ones*10 + Tens;
    System.out.println("The number " +Num+ " is now " + NewNum);
  }
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a positive integer less than 1000");
    int Num = sc.nextInt();
    sc.close();
    Swap10with1(Num);
  }
}