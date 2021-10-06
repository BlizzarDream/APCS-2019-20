public class Trio implements MenuItem{
  private Sandwich sandwich;
  private Salad salad;
  private Drink drink;
  public Trio(Sandwich sandwich, Salad salad, Drink drink){
    this.sandwich=sandwich;
    this.salad=salad;
    this.drink=drink;
  }
  public String getName(){
    return this.sandwich.getName()+"/"+this.salad.getName()+"/"+this.drink.getName()+ " Trio";
  }
  public double getPrice(){
    return sandwich.getPrice()+salad.getPrice()+drink.getPrice()-Math.min(sandwich.getPrice(),Math.min(salad.getPrice(),drink.getPrice()));
  }
}