public class StockTest {
  public static void main(String[] args) {
    Stock stock = new Stock("ORCL","Oracle Corporation",34.5,34.35);
    if (stock.getChangePercent() > 0)
      System.out.println(stock.getName() + "'s price increased by " + Math.abs(stock.getChangePercent()) + "%");
    else
      System.out.println(stock.getName() + "'s price decreased by " + Math.abs(stock.getChangePercent()) + "%");
  }
}