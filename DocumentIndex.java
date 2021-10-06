import java.util.ArrayList;

public class DocumentIndex extends ArrayList<IndexEntry>{
  public DocumentIndex(){
    super();
  }
  public DocumentIndex(int input){
    super(input);
  }
  public void addWord(String word, int num){
    boolean wordExists=false;
    IndexEntry temp = new IndexEntry(word);
    temp.add(num);
    for (int i = 0; i<this.size();i++){
      if(this.get(i).getWord().equals(word.toUpperCase())){
        this.get(i).add(num);
        wordExists = true;
      }
    }
    if(!wordExists){
      if(this.isEmpty())
        this.add(temp);
      else if(word.toUpperCase().compareTo(this.get(0).getWord())<0)
        this.add(0,temp);
      else if(word.toUpperCase().compareTo(this.get(this.size()-1).getWord())>0)
        this.add(this.size(),temp);
      else{
        for (int i = 0; i<this.size()-1;i++){
          if(word.toUpperCase().compareTo(this.get(i).getWord())>0&&word.toUpperCase().compareTo(this.get(i+1).getWord())<0){
            this.add(i+1,temp);
            break;
          }
        }
      }
    }
  }
  public void addAllWords(String str, int num){
    String[] arr = str.split("\\W+");
    for (String s:arr){
      if(str.length()>0)
        this.addWord(s,num);
    }   
  }
}