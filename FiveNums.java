import java.util.Scanner;

public class FiveNums{
  public static void main(String[]args){
    int[] arr = new int[5];
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i<5;i++){
      System.out.println("Enter an integer");
      arr[i] = sc.nextInt();
    }
    int sum = 0;
    for (int i = 0; i<arr.length;i++)
      sum+=arr[i];
    System.out.println(sum);
    int temp;
    for (int i = 0;i<arr.length;i++){
      for (int k = 0;k<arr.length;k++) {
        if (arr[i]<arr[k]) {
          temp = arr[i];
          arr[i] = arr[k];
          arr[k] = temp;
        }
      }
    }
    for (int i =0;i<arr.length;i++)
      System.out.print("["+arr[i]+"]");
  }
}