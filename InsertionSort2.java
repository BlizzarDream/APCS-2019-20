import java.util.List;
import java.util.ArrayList;
import java.util.ListIterator;

public class InsertionSort2{
    public static void insertionSort(List<Integer> a, int index){
    if(index == 1)
      insert(a, index);
    else if(index<1)
      throw new IllegalArgumentException();
    else{
      insertionSort(a,index-1);
      insert(a,index);
    }
  }
    public static void insert(List<Integer> a, int index){
      ListIterator<Integer> currentValue = a.listIterator(index);
      ListIterator<Integer> prevValue = a.listIterator(index);
      int num = currentValue.next();
      while(prevValue.hasPrevious()){
        int temp = prevValue.previous();
        if(temp>currentValue.previous()){
          currentValue.set(temp);
          prevValue.set(num);
        }
      }
      for(int temp: a)
        System.out.print(temp+", ");
      System.out.println();
    }
    public static List<Integer> getRandomList(){
      List<Integer> list = new ArrayList<Integer>();
      for(int i = 0; i<100; i++)
        list.add((int)(100*Math.random()));
      return list;
    }
    public static void main(String[] args){
      List<Integer> test = getRandomList();
      insertionSort(test,test.size()-1);
      for(int i: test)
        System.out.print(i+", ");
  }      
}