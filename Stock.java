public class Stock {
  private String SSymbol,SName;
  private double previousClosingPrice, currentPrice;
  public Stock(String Symbol, String Name, double clPrice, double cuPrice) {
    SSymbol = Symbol;
    SName = Name;
    previousClosingPrice = clPrice;
    currentPrice = cuPrice;
  }
  public double getChangePercent() {
    return (currentPrice-previousClosingPrice)/previousClosingPrice;
  }
  public String getSymbol() {
    return SSymbol;
  }
  public String getName() {
    return SName;
  }
  public double getPreviousClosingPrice(){
    return previousClosingPrice;
  }
  public double getCurrentPrice() {
    return currentPrice;
  }
}