import java.util.Scanner;

public class TicTacToe{
  private static int[][]board={{0,0,0},{0,0,0},{0,0,0}};
  private static int side = 1;
  private static int spaces;
  public static void main(String[] args){
    Scanner k =new Scanner(System.in);
    boolean play  = true;
    String Choice; String restart;
    while (play){
      System.out.println("Welcome to Tice-tac-toe. Do you wish to:"+
                         "\n\t1)Compete with another player"+
                         "\n\t2)Dominate a silly bot"+
                         "\n\tAny other key)Do Absolutely nothing");
      spaces = 9;
      Choice = k.next();
      while ((Choice.equals("1") || Choice.equals("2"))&&spaces>0&&!checkWin()){
        printBoard();
        if(Choice.equals("2")&&side<0){
          randMove();
          side*=-1;
        }
        else{
          playerMove();
          side*=-1;
        }
        spaces--;
      }
      printBoard();
      if (checkWin() && side<0) 
        System.out.println("The winner is Player X!");
      else if (checkWin() && side>0){
        if (Choice.equals("1"))
          System.out.println("The winner is Player O!");
        else 
          System.out.println("The computer won!");
      }
      else
        System.out.println("Nobody won");
      cleanBoard();
      System.out.println("Would you like to play again?"+
                         "\n\t1)Yes!\n\tAny other key)No? bye...");
      restart = k.next();
      if (restart.equals("1"))
        play = true;
      else
        play = false;
    }
    k.close();
  }
  public static void playerMove(){
    String Player;
    Scanner sc = new Scanner(System.in);
    if(side>0)
      Player = "X";
    else
      Player = "O";
    System.out.println("Player "+Player+", it is your turn.\nPlease enter a valid row: ");
    int row = sc.nextInt();
    System.out.println("Please enter a valid column: ");
    int column =sc.nextInt();
    while(row > 3 || row<1 || column>3 || column<1 || board[row-1][column-1]!=0){
      System.out.println("The selected position is either taken or invalid, please try another input");
      System.out.println("Please enter a valid row: ");
      row = sc.nextInt();
      System.out.println("Please enter a valid column: ");
      column =sc.nextInt();
    }
    sc.close();
    board[row-1][column-1]=side;
  }
  public static void randMove(){
    int row = (int)(3*Math.random());
    int column = (int)(3*Math.random());
    while (board[row][column]!=0){
      row = (int)(3*Math.random());
      column = (int)(3*Math.random());
    }
    board[row][column] = side;
  }
  public static void printBoard(){
    for (int i = 0;i<board.length;i++){
      for (int j = 0; j<board[0].length; j++){
        if (board[i][j]>0)
          System.out.print(" X ");
        else if (board[i][j]<0)
          System.out.print(" O ");
        else
          System.out.print("   ");
        if (j<3)
          System.out.print("|");
      }
      if (i<2)
        System.out.println("\n--------------");
    }
    System.out.println("\n==============================");
  }
  public static boolean checkWin(){
    for (int i = 0; i<board.length;i++){
      if (board[i][0]!=0 && board[i][0]==board[i][1] && board[i][0]==board[i][2] || board[0][i]!=0 && board[0][i]==board[1][i] && board[0][i]==board[2][i])
        return true;
    }
    if(board[0][0]!=0 && board[0][0]==board[1][1]&&board[0][0]==board[2][2] || board[0][2]!=0 && board[0][2]==board[1][1] && board[0][2]==board[2][0])
      return true;
    return false;
  }
  public static void cleanBoard(){
    for (int i =0; i<board.length;i++){
      for (int j = 0; j<board[0].length;j++)
        board[i][j]=0;
    }
  }
}