  import java.util.Scanner;
  
  public class RPS{
    public static int getWin(int Comp, int Player) {
      if (Player==Comp)
        return 0;
      else{
        if (Player==1&&Comp==3){
          System.out.println("Rock vs Scissors");
          return 1;
        }
        else if (Player==3&&Comp==2) {
          System.out.println("Scissors vs Paper");
          return 1;
        }
        else if (Player==2&&Comp==1) {
          System.out.println("Paper vs Rock");
          return 1;
        }
        else if (Player==1&&Comp==2) {
          System.out.println("Rock vs Paper");
          return 2;
        }
        else if (Player==2&&Comp==3) {
          System.out.println("Paper vs Scissors");
          return 2;
        }
        else if (Player==3&&Comp==1) {
          System.out.println("Scissors vs Rock");
          return 2;
        }
        else {
          System.out.print("You broke it so I guess you win");
          return 1;
        }
      }
    }
    public static void main(String[]args) {
      
      Scanner sc = new Scanner(System.in);
      System.out.print("Choose Rock, Paper, or Scissors");
      String Input = sc.next();
      int Player;
      while (!(Input.equals("Rock") || Input.equals("Paper") || Input.equals("Scissors"))){
        System.out.println("You can only choose Rock, Paper, or Scissors");
        Input = sc.next();
      }
      sc.close();
      if (Input.equals("Rock"))
        Player=1;
      else if (Input.equals("Paper"))
        Player=2;
      else
        Player=3;
      int Comp = (int)(3*Math.random())+1;
      switch(getWin(Comp,Player)) {
        case 0:
          System.out.println(Input+" vs "+Input+"\nYou tied!");
          break;
        case 1:
          System.out.println("You won!");
          break;
        case 2:
          System.out.println("You lost!");
          break;
        default:
          System.out.println("Good job you broke it!");
      }
    }
  }