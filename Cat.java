public class Cat {
  private Animal Name;
  private int Age;
  public Cat(String N, int A) {
    Age = A;
    Name = new Animal(N);
  }
  public int convertToHumanAge() {
    if (Age==1)
      return 15;
    if (Age==2)
      return 25;
    else
      return 25+((Age-2)*4);
  }
}