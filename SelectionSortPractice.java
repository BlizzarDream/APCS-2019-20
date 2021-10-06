public class SelectionSortPractice{
  public static void main(String[] args){
    int[] arr = new int[30];
    for(int i = 0;i<arr.length;i++)
      arr[i]=(int)(Math.random()*100);
    sort(arr);
    for(int i:arr)
      System.out.print(i+", ");
  }
  public static void sort(int[] arr){
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
    }
  }
}