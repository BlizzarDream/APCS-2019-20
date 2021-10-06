import java.util.Scanner;

public class Rand2DArray{
  private static int largest,smallest;
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the range for your square array");
    int range = sc.nextInt();
    int[][] arr = generateArray(range);
    System.out.println("Try to guess the largest number and smallest number\nLargest:");
    int inputL=sc.nextInt();
    System.out.println("Smallest:");
    int inputS=sc.nextInt();
    if (inputL!=largest)
      System.out.println("The largest number is actually "+largest);
    else
      System.out.println("You're right! The largest number is "+largest);
    if (inputS!=smallest)
      System.out.println("The smallest number is actually "+smallest);
    else
      System.out.println("You're right! The smallest number is "+smallest);
  }
  public static int[][] generateArray(int range){
    int count=0;
    int[][] arr = new int[range][range];
    for (int i = 0;i<range;i++){
      for (int j = 0;j<range;j++){ 
        arr[i][j]=(int)(20*Math.random()+1);
        if(count<1){
          largest=arr[i][j];
          smallest=arr[i][j];
          count++;
        }
        if(arr[i][j]>largest)
          largest=arr[i][j];
        if(arr[i][j]<smallest)
          smallest=arr[i][j];
      }
    }
    return arr;
  }
}