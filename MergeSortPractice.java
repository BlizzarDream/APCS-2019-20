public class MergeSortPractice{
  public static void main(String[] args){
    int[] testArr = {3,6,8,4,5,9,0,1,2,7};
    testArr = mergeSort(testArr, 0, testArr.length-1);
    for(int i: testArr)
      System.out.print(i+", ");
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
    return arrResult;
  }
}