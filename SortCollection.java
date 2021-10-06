import java.util.Scanner;

public class SortCollection{
  public static void main(String[] args){
    int[] arr = new int[10];
    for(int i = 0; i<arr.length;i++)
      arr[i]=(int)(50*Math.random());
    for(int i:arr)
      System.out.print(i+", ");
    System.out.println();
    Scanner k = new Scanner(System.in);
    System.out.println("Select one of the following sort methods:"+
                       "\n1) Selection Sort"+
                       "\n2) Insertion Sort"+
                       "\n3) Merge Sort"+
                       "\n4) Quick Sort");
    int choice=k.nextInt();
    switch(choice){
      case 1:
        selectionSort(arr);
        break;
      case 2:
        insertionSort(arr, arr.length-1);
        break;
      case 3:
        mergeSort(arr,0,arr.length-1);
        break;
      case 4:
        quickSort(arr,0,arr.length-1);
        break;
      default:
        System.out.println("No choice of switch picked");
        break;
    }
    System.out.print("Result: ");
    for(int i:arr)
      System.out.print(i+", ");
  }
  public static void quickSort(int[] arr, int start, int end){
    if(start<end){
      int split = quickSplit(arr, start, end);
      quickSort(arr, start, split-1);
      quickSort(arr,split+1,end);
    }
  }
  private static int quickSplit(int[] arr, int start, int end){
    int temp, left=start+1, right=end;
    while(right>=left){
      if(arr[left]>=arr[start]&&arr[right]<arr[start]){
        temp=arr[left];
        arr[left]=arr[right];
        arr[right]=temp;
      }
      if(arr[left]<arr[start])
        left++;
      else if(arr[right]>=arr[start])
        right--;
    }
    temp=arr[right];
    arr[right]=arr[start];
    arr[start]=temp;
    for(int i:arr)
      System.out.print(i+", ");
    System.out.println();
    return right;
  }
  public static int[] mergeSort(int[] arr, int startInd, int endInd){
    if(endInd==startInd)
      return new int[]{arr[startInd]};
    else{
      int mid = (startInd+endInd)/2;
      int[] arrA=mergeSort(arr,startInd,mid);
      int[] arrB=mergeSort(arr,mid+1,endInd);
      return merge(arrA,arrB);
    }
  }
  private static int[] merge(int[] arrA, int[] arrB){
    int[] arrResult = new int[arrA.length+arrB.length];
    int indA=0,indB=0;
    for(int i=0; i<arrResult.length;i++){
      if(indB>=arrB.length){
        arrResult[i]=arrA[indA];
        indA++;
      }
      else if (indA>=arrA.length){
        arrResult[i]=arrB[indB];
        indB++;
      }
      else if(arrA[indA]<arrB[indB]){
        arrResult[i]=arrA[indA];
        indA++;
      }
      else{
        arrResult[i]=arrB[indB];
        indB++;
      }
    }
    for(int i:arrResult)
      System.out.print(i+", ");
    System.out.println();
    return arrResult;
  }
  private static void insert(int[] a, int n, int x){
    for(int i=n; i>0;i--){
      if(x<a[i-1]){
        a[i]=a[i-1];
        a[i-1]=x;
      }
    }
    for(int i: a)
      System.out.print(i+", ");
    System.out.println();
  }
  public static void insertionSort(int[] a, int index){
    if(index == 1)
      insert(a, index, a[index]);
    else if(index<1)
      throw new IllegalArgumentException();
    else{
      insertionSort(a,index-1);
      insert(a,index,a[index]);
    }
  }
  public static void selectionSort(int[] arr){
    int lowestIndex,temp;
    for(int i =0; i<arr.length;i++){
      lowestIndex=i;
      for(int j=i+1;j<arr.length;j++){
        if(arr[lowestIndex]>=arr[j])
          lowestIndex=j;
      }
      temp=arr[i];
      arr[i]=arr[lowestIndex];
      arr[lowestIndex]=temp;
      for(int j:arr)
        System.out.print(j+", ");
      System.out.println();
    }
  }
}
