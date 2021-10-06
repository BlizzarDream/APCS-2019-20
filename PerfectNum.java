public class PerfectNum{
  public static boolean isPerfectNum(int Num) {
    int Sum = 0;
    for (int i = 1; i < Num; i++) {
      if (Num%i==0)
        Sum+=i;
    }
    return Sum==Num;
  }
  public static void main(String[]args) {
    int Num = 0;
    for (int x = 1; x<=4; x++) {
      Num++;
      while (!isPerfectNum(Num))
        Num++;
      System.out.println(Num);
    }
  }
}