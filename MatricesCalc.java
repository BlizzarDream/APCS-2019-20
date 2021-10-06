import java.util.Scanner;

public class MatricesCalc{
  private static int[][] a,b,Final;
  public static void main(String[]args){
    int aR,aC,bR,bC;
    Scanner sc = new Scanner(System.in);
    System.out.println("Select one of three choices:"+
                       "\n\t1)Add the matrices"+
                       "\n\t2)Subtract the matrices"+
                       "\n\t3)Mulriply the matrices");
    int choice = sc.nextInt();
    System.out.println("You will be asked to enter two matrices."
                         +"Please make sure the number of columns in the first matrix "
                         +"equal the number of rows in the second matrix and that the matrices have the same dimensions if adding or subtracting.");
    System.out.println("Enter the number of rows in the first matrix");
    aR = sc.nextInt();
    System.out.println("Enter the number of column in the first matrix");
    aC = sc.nextInt();
    System.out.println("Enter the number of rows in the second matrix");
    bR = sc.nextInt();
    System.out.println("Enter the number of columns in the second matrix");
    bC = sc.nextInt();
    while (choice==3 && aC!=bR){
      System.out.println("Please confirm your values for the first matrix's columns and the second matrix's rows.");
      System.out.println("# Columns in 1st matrix: ");
      aC = sc.nextInt();
      System.out.println("# Rows in 2nd matrix: ");
      bR = sc.nextInt();
    }
    while (choice<2&&choice>0 &&aR!=bR&&aC!=bC){
      System.out.println("Please confirm that both matrices have the same number of rows and columns");
      System.out.println("# Rows in 1st matrix: ");
      aR = sc.nextInt();
      System.out.println("# Columns in 1st matrix: ");
      aC = sc.nextInt();
      System.out.println("# Rows in 2nd matrix: ");
      bR = sc.nextInt();
      System.out.println("# Columns in 2nd matrix: ");
      bC = sc.nextInt();
    }
    a = new int[aR][aC];
    b = new int[bR][bC];
    for (int i = 0; i<aR; i++){
      for (int j = 0; j<aC;j++){
        System.out.println("Please enter the value at row "+(i+1)+" and column "+(j+1)+" of the first matrix");
        a[i][j] = sc.nextInt();
      }
    }
    for (int i = 0; i<bR; i++){
      for (int j = 0; j<bC;j++){
        System.out.println("Please enter the value at row "+(i+1)+" and column "+(j+1)+" of the first matrix");
        b[i][j] = sc.nextInt();
      }
    }
    sc.close();
    switch (choice){
      case 1:
        add(a,b);
        break;
      case 2:
        subtract(a,b);
        break;
      case 3:
        multiply(a,b);
        break;
      default:
        System.out.println("Guess you don't want to do anything then...");
    }
    for (int i = 0; i<Final.length;i++){
      for (int j = 0; j<Final[0].length;j++)
        System.out.print(Final[i][j]+" ");
      System.out.println();
    }
  }
  public static void add(int[][] a, int[][] b){
    Final = new int[a.length][b[0].length];
    for (int i = 0; i<Final.length; i++){
      for (int j = 0; j<Final[0].length; j++)
        Final[i][j] = a[i][j]+b[i][j];
    }
  }
  public static void subtract(int[][] a, int[][] b){
    Final = new int[a.length][b[0].length];
    for (int i = 0; i<Final.length; i++){
      for (int j = 0; j<Final[0].length; j++)
        Final[i][j] = a[i][j]-b[i][j];
    }
  }
  public static void multiply(int[][] a, int[][] b){
    int counter = 0;
    int temp = 0;
    Final = new int[a.length][b[0].length];
    for (int i = 0; i<Final.length; i++){
      for (int j = 0; j<Final[0].length; j++){
        for (int k = 0; k<a[0].length;k++){
          Final[i][j]+=a[i][k]*b[k][j];
        }
      }
    }
  }
}