public class Story implements LinkableText{
  private String text;
  private LinkableText next;
  public Story(String input){
    text=input;
    next =null;
  }
  public String getText(){
    return text;
  }
  public void setNext(LinkableText next){
    this.next = next;
  }
  public String toString(){
    if (next==null)
      return text;
    else
      return text+" "+next.getText();
  }
}