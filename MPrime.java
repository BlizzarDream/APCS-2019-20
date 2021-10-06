public class MPrime{
  public static boolean isPrime(int Num) {
    int Counter = 0;
    for (int i=2;i<Num;i++) {
      if (Num%i==0)
        Counter++;
    }
    return Counter==0;
  }
  public static void main(String[] args){
    int Pow = 0;
    for (int x = 1; x<=6;x++) {
      Pow++;
      while (!isPrime((int)Math.pow(2,Pow)-1))
        Pow++;
      System.out.println((int)Math.pow(2,Pow)-1);
    }
  }
}