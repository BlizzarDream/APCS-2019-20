//int x = Integer.parseInt("x") [String -> Number]
public class Decimal {
  private int Dec;
  public Decimal(int Num) {
    Dec = Num;
  }
  public Binary convertToBinary() {
    int N=Dec;
    int pow = 0;
    String Bin = "";
    while (N-Math.pow(2,pow)>=Math.pow(2,pow))//This checks the maximum power of base 2 required for the given int
      pow++;
    for (int i = pow; i>=0; i--){//This determines the order of 1s and 0s
      if (N>=Math.pow(2,i)) {
        N-=Math.pow(2,i);
        Bin+="1";
      }
      else
        Bin+="0";
    }
    Binary Bi = new Binary(Bin);
    return Bi;
  }
  public Hexadecimal convertToHexa() {
    int N=Dec;
    int pow = 0;
    String Hexa = "";
    while (N-(15*Math.pow(16,pow))>=Math.pow(16,pow))//Checks maximum power of base 16
      pow++;
    for (int i = pow; i>=0; i--) {//Puts together the hexadecimal
      for (int a = 15; a>=1; a--) {
        if (N>=(a*Math.pow(16,i))) {
          N-=(a*Math.pow(16,i));
          if (a<=9) 
            Hexa += a+"";
          else {
            if (a==10)
              Hexa += "A";
            else if(a==11)
              Hexa += "B";
            else if (a==12)
              Hexa += "C";
            else if (a==13)
              Hexa += "D";
            else if (a==14)
              Hexa += "E";
            else if (a==15)
              Hexa += "F";
          }
        }
      }
    }
    Hexadecimal Hex = new Hexadecimal(Hexa);
    return Hex;
  }
  public int getDec() {
    return Dec;
  }
  public String toString(){
    return ""+Dec;
  }
}