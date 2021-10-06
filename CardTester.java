/**
 * This is a class that tests the Card class.
 */
public class CardTester {

 /**
  * The main method in this class checks the Card operations for consistency.
  * @param args is not used.
  */
 public static void main(String[] args) {
  Card a = new Card("Ace","Clubs",1);
  Card b = new Card("Nine","Hearts",9);
  Card c = new Card("Jack","Spades",11);
  System.out.println(a+"\n"+b+"\n"+c);
  System.out.println(a.matches(a));
  System.out.println(a.matches(b));
  System.out.println(a.matches(c));
 }
}
