import java.util.Scanner;

public class TTT{
  private int[][] board;
  private int side;
  public TTT(){
    board = new int[3][3];
    cleanBoard();
    side = 1;
  }
  public int[][] getBoard(){
    return board;
  }
  public int getSide(){
    return side;
  }
  public void changeSide(){
    side=side*-1;
  }
  public int getSpaces(){
    int count = 0;
    for(int[] x: board){
      for(int y:x){
        if(y==0)
          count++;
      }
    }
    return count;
  }
  public void printBoard(){
    for (int i = 0;i<board.length;i++){
      for (int j = 0; j<board[0].length; j++){
        if (board[i][j]>0)
          System.out.print(" X ");
        else if (board[i][j]<0)
          System.out.print(" O ");
        else
          System.out.print("   ");
        if(j<2)
          System.out.print("|");
      }
      if (i<2)
        System.out.println("\n-----------");
    }
  }
  public void move(int row, int column){
    board[row][column]=side;
  }
  public void move(int row, int column, int side){
    this.side=side;
    board[row][column] = side;
  }
  public int checkWin(){
    for (int i = 0; i<board.length;i++){
      if (board[i][0]!=0 && board[i][0]==board[i][1] && board[i][0]==board[i][2] || board[0][i]!=0 && board[0][i]==board[1][i] && board[0][i]==board[2][i])
        return side;
    }
    if(board[0][0]!=0 && board[0][0]==board[1][1]&&board[0][0]==board[2][2] || board[0][2]!=0 && board[0][2]==board[1][1] && board[0][2]==board[2][0])
      return side;
    return 0;
  }
  public void cleanBoard(){
    for(int i = 0; i<board.length; i++){
      for(int j=0; j<board[0].length; j++)
        board[i][j] = 0;
    }
  }
  public void playGame(boolean play){
    Scanner k =new Scanner(System.in);
    String Choice; String restart;
    while (play){
      System.out.println("Welcome to Tice-tac-toe. Do you wish to:"+
                         "\n\t1)Compete with another player"+
                         "\n\t2)Dominate a silly bot"+
                         "\n\tAny other key)Do Absolutely nothing");
      Choice = k.next();
      while ((Choice.equals("1") || Choice.equals("2"))&&getSpaces()>0&&checkWin()==0){
        printBoard();
        System.out.println("\n==============================");
        if(Choice.equals("2")&&side<0){
          int row = (int)(3*Math.random());
          int column = (int)(3*Math.random());
          while (board[row][column]!=0){
            row = (int)(3*Math.random());
            column = (int)(3*Math.random());
          }
          move(row,column);
        }
        else{
          String Player;
          Scanner sc = new Scanner(System.in);
          if(side>0)
            Player = "X";
          else
            Player = "O";
          System.out.println("Player "+Player+", it is your turn.\nPlease enter a valid row: ");
          int row = sc.nextInt()-1;
          System.out.println("Please enter a valid column: ");
          int column =sc.nextInt()-1;
          while(row > 2 || row<0 || column>2 || column<0 || board[row][column]!=0){
            System.out.println("The selected position is either taken or invalid, please try another input");
            System.out.println("Please enter a valid row: ");
            row = sc.nextInt()-1;
            System.out.println("Please enter a valid column: ");
            column =sc.nextInt()-1;
          }
          sc.close();
          move(row, column);
        }
        changeSide();
      }
      printBoard();
      System.out.println("\n==============================");
      if (checkWin()<0) 
        System.out.println("The winner is Player X!");
      else if (checkWin()>0){
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
  public static void main(String[] args){
    TTT game = new TTT();
    game.playGame(true);
  }
}