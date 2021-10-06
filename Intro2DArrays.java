import java.util.Scanner;

public class Intro2DArrays{
  public static void main(String[] args){
    int[][] gradeTable =
    { {99, 42, 74, 83, 100},
      {90, 91, 72, 88, 95},
      {88, 61, 74, 89, 96},
      {61, 89, 82, 98, 93},
      {93, 73, 75, 78, 99},
      {50, 65, 92, 87, 94}};
    Scanner sc = new Scanner(System.in);
    System.out.println("You can do the following:"+
                       "\n\t1)Identify one of the grades"+
                       "\n\t2)Print all the grades and the sum"+
                       "\n\t3)Identify the lowest and highest grade");
    int choice = sc.nextInt();
    switch(choice){
      case 1:
        findGrade(gradeTable);
        break;
      case 2:
        printAll(gradeTable);
        break;
      case 3:
        rangeValues(gradeTable);
        break;
      default:
        System.out.println("You didn't pick any of the three choices");
    }
    sc.close();
  }
  public static void findGrade(int[][] gradeTable){
    Scanner k = new Scanner(System.in);
    System.out.println("Enter a number from 0 to "+(gradeTable.length-1));
    int row = k.nextInt();
    System.out.println("Enter a number from 0 to "+(gradeTable[0].length-1));
    int column = k.nextInt();
    k.close();
    System.out.println("The score at row "+row+" and column "+column+" is "+gradeTable[row][column]);
  }
  public static void printAll(int[][] gradeTable){
    int sum = 0;
    for (int i = 0; i<gradeTable.length;i++){
      for (int j = 0; j<gradeTable[0].length;j++){
        sum+= gradeTable[i][j];
        System.out.print(gradeTable[i][j]+" ");
      }
      System.out.println();
    }
    System.out.print("Sum = "+sum);
  }
  public static void rangeValues(int[][] gradeTable){
    int smallest = gradeTable[0][0];
    int largest = smallest;
    for (int i = 0; i<gradeTable.length;i++){
      for (int j = 0; j<gradeTable[0].length;j++){
        if(gradeTable[i][j]>largest)
          largest = gradeTable[i][j];
        if (gradeTable[i][j]<smallest)
          smallest = gradeTable[i][j];
      }
    }
    System.out.println("Largest: "+largest+"\nSmallest: "+smallest);
  }
}