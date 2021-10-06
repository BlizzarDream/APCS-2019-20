import java.util.Scanner;
import java.util.Arrays;

public class BinarySearch{
  public static void main(String[] args){
    int[] arr = new int[100];
    int random;
    for(int i = 0; i<arr.length; i++){
      random = (int)(200*Math.random()+1);
      while(contains(random,arr))
        random=(int)(200*Math.random()+1);
      arr[i]=random;
    }
    Arrays.sort(arr,0,arr.length);
    Scanner k =new Scanner(System.in);
    System.out.println("Enter a number");
    int x = k.nextInt();
    if(search(x,0,0,arr.length,arr)<0)
      System.out.println("Number not found");
    else
      System.out.println("Number found after "+search(x,0,0,arr.length,arr)+" searches");
  }
  public static int search(int n, int count, int start, int end, int[] arr){
    int index = (start+end+1)/2;
    count++;
    if(arr[index]==n||arr[0]==n)
      return count;
    else if(n<arr[0]||n>arr[arr.length-1]||n<arr[index+1]&&n>arr[index-1])
      return -1;
    else{
      if(n>arr[index])
        return search(n,count,index,end,arr);
      else
        return search(n,count,start,index,arr);
    }
  }
  public static boolean contains(int n, int[]arr){
    for(int i=0;i<arr.length;i++){
      if(n==arr[i])
        return true;
    }
    return false;
  }
}