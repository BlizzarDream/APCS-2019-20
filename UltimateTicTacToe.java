import java.util.Scanner;

public class UltimateTicTacToe extends TTT{
  private TTT[][] largeBoard;
  private int nextRow, nextColumn;
  public UltimateTicTacToe(){
    nextRow = -1;
    nextColumn = -1;
    largeBoard = new TTT[3][3];
    cleanLargeBoard();
  }
  public void cleanLargeBoard(){
    for(int i = 0; i<largeBoard.length; i++){
      for(int j = 0; j<largeBoard[0].length; j++)
        largeBoard[i][j] = new TTT();
      }
  }
  public void printBoard(){
    System.out.println("Simplified Board:");
    super.printBoard();
    System.out.println("\n==============================");
    for(int i = 0; i< 9; i++){
      for(int j = 0; j< 9;j++){
        if(largeBoard[i/3][j/3].getBoard()[i%3][j%3]>0)
          System.out.print(" X ");
        else if(largeBoard[i/3][j/3].getBoard()[i%3][j%3]<0)
          System.out.print(" 0 ");
        else
          System.out.print("   ");
        if(j<8)
          System.out.print("|");
      }
      if(i<8&&i%3==2)
        System.out.println("\n-----------|-----------|-----------");
      else if(i<8)
        System.out.println("\n---|---|---|---|---|---|---|---|---");
    }
  }
  public int checkWin(){
    for (int i = 0; i<super.getBoard().length;i++){
      if (super.getBoard()[i][0]!=0 && super.getBoard()[i][0]==super.getBoard()[i][1] && super.getBoard()[i][0]==super.getBoard()[i][2] ||
          super.getBoard()[0][i]!=0 && super.getBoard()[0][i]==super.getBoard()[1][i] && super.getBoard()[0][i]==super.getBoard()[2][i])
        return super.getSide();
    }
    if(super.getBoard()[0][0]!=0 && super.getBoard()[0][0]==super.getBoard()[1][1]&&super.getBoard()[0][0]==super.getBoard()[2][2] || 
       super.getBoard()[0][2]!=0 && super.getBoard()[0][2]==super.getBoard()[1][1] && super.getBoard()[0][2]==super.getBoard()[2][0])
      return super.getSide();
    return 0;
  }
  public void updateSmallBoard(){
    for(int i = 0; i < largeBoard.length; i++){
      for(int j = 0; j<largeBoard[0].length; j++)
        super.getBoard()[i][j] = largeBoard[i][j].checkWin();
    }
  }
  public void move(int row, int column){
    largeBoard[nextRow][nextColumn].move(row,column,super.getSide());
  }
  public void setNextCoords(int row, int column){
    this.nextRow = row;
    this.nextColumn = column;
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
      while ((Choice.equals("1") || Choice.equals("2"))&&super.getSpaces()>0&&checkWin()==0){
        printBoard();
        System.out.println("\n==============================");
        if(Choice.equals("2")&&super.getSide()<0){
          while(nextRow<0 || largeBoard[nextRow][nextColumn].getSpaces()<1 || largeBoard[nextRow][nextColumn].checkWin()!=0)
            setNextCoords((int)(3*Math.random()),(int)(3*Math.random()));
          int row = (int)(3*Math.random());
          int column = (int)(3*Math.random());
          while (largeBoard[nextRow][nextColumn].getBoard()[row][column]!=0){
            row = (int)(3*Math.random());
            column = (int)(3*Math.random());
          }
          move(row,column);
          setNextCoords(row,column);
        }
        else{
          String Player;
          if(super.getSide()>0)
            Player = "X";
          else
            Player = "O";
          System.out.println("Player "+Player+", it is your turn.");
          while(nextRow<0 || largeBoard[nextRow][nextColumn].getSpaces()<1 || largeBoard[nextRow][nextColumn].checkWin()!=0){
            System.out.print("The game has either just begun or no moves can't be made on the next board.");
            System.out.println("\nPlease enter a valid row: ");
            int nextR = k.nextInt()-1;
            System.out.println("Please enter a valid column: ");
            int nextC =k.nextInt()-1;
            setNextCoords(nextR,nextC);
          }
          System.out.println("Selected Tic Tac Toe Board at Row "+(nextRow+1)+" and Column "+(nextColumn+1));
          largeBoard[nextRow][nextColumn].printBoard();
          System.out.println("\n==============================");
          System.out.println("\nPlease enter a valid row: ");
          int row = k.nextInt()-1;
          System.out.println("Please enter a valid column: ");
          int column =k.nextInt()-1;
          while(row > 2 || row<0 || column>2 || column<0 ||largeBoard[nextRow][nextColumn].getBoard()[row][column]!=0){
            System.out.println("The selected position is either taken or invalid, please try another input");
            System.out.println("Please enter a valid row: ");
            row = k.nextInt()-1;
            System.out.println("Please enter a valid column: ");
            column =k.nextInt()-1;
          }
          move(row, column);
          setNextCoords(row,column);
        }
        super.changeSide();
        updateSmallBoard();
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
    UltimateTicTacToe x = new UltimateTicTacToe();
    x.playGame(true);
  }
}