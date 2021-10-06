public class InsertionSortPractice{
  public static void main(String[] args){
    int[] test = {9,8,7,6,5,4,3};
    insertionSort(test,test.length-1);
    for(int i: test)
      System.out.print(i+", ");
  }
  public static void insert(int[] a, int n, int x){
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
}