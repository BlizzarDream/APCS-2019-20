public class Binary {
  private String Bi;
  public Binary(String B) {
    Bi = B;
  }
  public String getBi() {
    return Bi;
  }
  public Decimal convertToDecimal() {
    String B1 = Bi;
    int sum = 0;
    for (int i=0; i<=B1.length()-1; i++) {
      char temp = B1.charAt(i);
      int Digit = Character.getNumericValue(temp);
      sum += Digit*Math.pow(2,i);
    }
    Decimal D = new Decimal(sum);
    return D;
  }
  public Hexadecimal convertToHexadecimal() {
    Decimal Dec = convertToDecimal();
    Hexadecimal Hexa = Dec.convertToHexa();
    return Hexa;
  }
  public String toString(){
    return Bi;
  }
}