public class Limerick extends Poem{
  public int numLines(){
    return 5;
  }
  public int getSyllables(int k){
    int result;
    switch(k){
      case 0:case 1:case 4:
        result = 9;
        break;
      default:
        result = 6;
        break;
    }
    return result;
  }
}
        