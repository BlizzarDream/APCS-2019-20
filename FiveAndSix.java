public class FiveAndSix{
  public static void main(String[] args) {
    int Num = 100;
    String Line="";
    while (Num<=1000){
      if (Line.length()>36){
        System.out.println(Line);
        Line="";
      }
      if (Num%5==0 && Num%6==0)
        Line+=Num+" ";
      Num++;
    }
    System.out.println(Line);
  }
}