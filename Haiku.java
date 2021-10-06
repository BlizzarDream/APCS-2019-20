public class Haiku extends Poem{
  public int numLines(){
    return 3;
  }
  public int getSyllables(int k){
    int result;
    switch(k){
      case 0:case 2:
        result = 5;
        break;
      default:
        result = 7;
        break;
    }
    return result;
  }
}