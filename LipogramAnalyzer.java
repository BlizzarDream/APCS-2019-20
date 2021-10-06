public class LipogramAnalyzer{
  private String t;
  public LipogramAnalyzer(String text){
    t=text.toLowerCase();
  }
  public String mark(char letter) {
    return t.replace(letter,'#');
  }
  private int findEnd(char letter, String str, int i) {
    if (str.indexOf(' ',i)==-1)
      return str.length();
    else
      return str.indexOf(' ',i);
  }
  public String allWordsWith(char letter) {
    String str = t;
    String temp;
    String offending="";
    int Start,End;
    for (int i=0; i<str.length(); i++) {
      if (str.charAt(i)==letter) {
        Start = str.lastIndexOf(' ' ,i)+1;
        End = findEnd(letter, str, i);
        temp = str.substring(Start,End);
        offending+=temp+"\n";
        str = str.replace(temp,"");
        i = Start;
      }
    }
    return offending;
  }
}