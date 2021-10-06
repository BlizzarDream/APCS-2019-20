import java.util.ArrayList;

public class IndexEntry{
  private String word;
  private ArrayList<Integer> numsList;
  public IndexEntry(String str){
    word = str.toUpperCase();
    numsList = new ArrayList<Integer>();
  }
  public void add(int num){
    if (!numsList.contains(num))
      numsList.add(num);
  }
  public String getWord(){
    return word;
  }
  public  String toString(){
    String result = word+" ";
    for (int i : numsList)
      result+=i+", ";
    result = result.substring(0,result.length()-2);
    return result;
  }
}