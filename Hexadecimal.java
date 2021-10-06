public class Hexadecimal{
  private String Hexa;
  public Hexadecimal(String H) {
    Hexa = H;
  }
  public int convertHexDigitInt(char c) {//Returns the integer value of Hexadecmal letters
    if (c=='A')
      return 10;
    else if (c=='B')
      return 11;
    else if (c=='C')
      return 12;
    else if (c=='D')
      return 13;
    else if (c=='E')
      return 14;
    else if (c=='F')
      return 15;
    else
      return 0;
  }
  public Decimal convertToDecimal() {
    String H1 = Hexa;
    int sum = 0;
    for (int i=0; i<=H1.length()-1; i++) {//i is both the place value and power value of the hexadecimal digit
      char temp = H1.charAt(i);
      if (Character.isDigit(temp))
        sum += Character.getNumericValue(temp);
      else
        sum += convertHexDigitInt(temp)*Math.pow(16,i);
    }
    Decimal D = new Decimal(sum);
    return D;
  }
  public Binary convertToBinary() {
    String Bi = "";
    String H1 = Hexa;
    for (int i=H1.length()-1; i>=0; i--) {
      char temp = H1.charAt(i);
      int temp2 = convertHexDigitInt(temp);
      for (int a = 3; a >= 0; a--) {//Tseparates one hexadecimal digit into four digits of binary
        if (temp2>=Math.pow(2,a)) {
          temp2-=Math.pow(2,a);
          Bi +="1";
        }
        else
          Bi +="0";
      }
    }
    Binary B = new Binary(Bi);
    return B;
  }
  public String getHexa() {
    return Hexa;
  }
  public String toString(){
    return Hexa;
  }
}