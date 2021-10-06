import java.util.Scanner;

public class SequentialSearchPractice{
  public static void main(String[] args){
    int random;
    int[] arr = new int[100];
    for(int i = 0; i<arr.length; i++){
      random = (int)(200*Math.random()+1);
      while(contains(random,arr))
        random=(int)(200*Math.random()+1);
      arr[i]=random;
    }
    Scanner k = new Scanner(System.in);
    System.out.println("Enter a number");
    int x = k.nextInt();
    if(search(x,arr)<0)
      System.out.println("Number not found");
    else
      System.out.println("Number found after "+search(x,arr)+" searches");
  }
  public static int search(int n, int[] arr){
    int count=0;
    for(int i:arr){
      count++;
      if(i==n)
        return count;
    }
    return -1;
  }
  public static boolean contains(int n, int[]arr){
    for(int i=0;i<arr.length;i++){
      if(n==arr[i])
        return true;
    }
    return false;
  }
}