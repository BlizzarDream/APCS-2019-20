public class LinkableTest{
  public static void main(String []args){
    LinkableText First = new Story("First Story");
    LinkableText Second = new Story("Second Story");
    First.setNext(Second);
    System.out.println(First+" "+Second);
  }
}