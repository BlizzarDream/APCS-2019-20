import java.util.Scanner;

public class DogTest {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("What is the name of your pet?");
    String Name = sc.nextLine();
    System.out.println("What is your pet's age?");
    int Age = sc.nextInt();
    System.out.println("Is your pet a cat or dog?");
    String t = sc.next();
   
    if (t.equals("dog")) {
      Dog d = new Dog(Name,Age);
      System.out.println("Your dog's age is equivalent to " + d.convertToHumanAge() + " years in human age");
    }
    if (t.equals("cat")) {
      Cat c = new Cat(Name,Age);
      System.out.println("Yourcat's age is equivalent to " + c.convertToHumanAge() + " years in human age");
    }
  }
}