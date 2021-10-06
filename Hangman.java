import java.util.Scanner;

public class Hangman {
  public static void main(String[] args) {
    System.out.println("Welcome to Hangman! There will be a hidden word picked out for you."+
                       "\nYou may only guess one letter at a time. If you guess correctly,\n"+
                       "the same letters will appear. If you don't guess correctly, you don't\n"+
                       "have to worry because you start with three chances. You can enter the\n"+
                       "same correct letter over and over, but you'd wasting your time, not mine.\n"+
                       "Good Luck!\n");
    boolean Restart = play();
    while (Restart)
      Restart = play();
  }
  public static boolean play() {
    int count = 3;
    String Answer = pickAnswer();
    String Final = createFinal(Answer);
    String Picked = new String();
    Scanner sc = new Scanner(System.in);
    while (Final.replace("-","").length() != Answer.length() && count>0){
      System.out.print("Enter a letter. If you enter more than one character, only the first will count.");
      String Input = sc.next().toUpperCase();
      char Choice = Input.charAt(0);
      while (!Character.isLetter(Choice)) {
        System.out.print("Please enter a single letter only. Multiple letters will result in only the first one being counted");
        Input = sc.next().toUpperCase();
        Choice = Input.charAt(0);
      }
      if (check(Answer,Choice)) {
        System.out.println("You guessed correclty!");
        Final = replace(Answer,Final,Choice);
      }
      else {
        count--;
        System.out.println("Your guess was incorrect. You have "+count+" chances left.");
      }
    }
    if (count>0) 
      System.out.println("You have won a round of Hangman! Congrats!");
    else
      System.out.println("You lost! Bummer!");
    System.out.println("Do you wish to play again? Enter \"1\" to do so.\nOtherwise, enter anything.");
    String Restart = sc.next();
    sc.close();
    if (Restart.equals("1"))
      return true;
    else
      return false;
  }
  public static String createFinal(String Answer){
  String Final = "";
  for (int i = 0; i<Answer.length();i++)
    Final += "-";
  System.out.println(Final);
  return Final;
  }
  public static String pickAnswer() {
    String Answer = new String();
    int rand = (int)(5*Math.random());
    switch(rand) {
      case 0:
        Answer = "DUO";
        System.out.println("You have been given a three-letter word.");
        break;
      case 1:
        Answer = "RIPE";
        System.out.println("You have been given a four-letter word.");
        break;
      case 2:
        Answer = "DRIVE";
        System.out.println("You have been given a five-letter word.");
        break;
      case 3:
        Answer = "SWITCH";
        System.out.println("You have been given a six-letter word.");
        break;
      case 4:
        Answer = "STAPLER";
        System.out.println("You have been given a seven-letter word.");
        break;
      default:
        System.out.println("Error in switch.");
    }
    return Answer;
  }
    public static boolean check(String Answer, char Choice){
    int counter = 0;
    for (int i=0; i<Answer.length(); i++){
      if (Answer.charAt(i) == Choice)
        counter++;
    }
    return counter>0;
}
        
  public static String replace(String Answer, String Final, char Choice){
    int counter = 0;
    for (int i=0; i<Answer.length(); i++){
      if (Answer.charAt(i) == Choice){
        counter++;
        Final=Final.substring(0,i)+Choice+Final.substring(i+1,Final.length());
      }
    }
    System.out.println("There are "+counter+" letter(s) in the word!");
    System.out.println(Final);
    return Final;
  }
}