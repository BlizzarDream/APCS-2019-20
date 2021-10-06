import java.util.Scanner;

public class Reverse{
  public static String reverseWords(String str){
    String Final="";
    int start = 0;
    for (int i = 0;i<str.length();i++){
      if (str.charAt(i)==' ' || i==str.length()-1){
        if(i==str.length()-1)
          i=str.length();
        Final=str.substring(start,i)+" "+Final;
        start=i+1;
      }
    }
    return Final;
  }
  public static String reverseLetters(String str){
    String Final="";
    for (int i=0; i<str.length(); i++)
      Final+=""+str.charAt(str.length()-1-i);
    return Final;
  }
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Write a sentence");
    String str = sc.nextLine();
    System.out.println("Reverse the sentence by:\n\t1)Word\n\t2)Letter");
    int Choice = sc.nextInt();
    if (Choice==1)
      System.out.println(reverseWords(str));
    else
      System.out.println(reverseLetters(str));
  }
}