public class Diploma{
  private String Name,Degree;
  public Diploma(String n, String d){
    Name=n;
    Degree=d;
  }
  public String toString(){
    return "This certifies that "+Name+"\nhas completed a course in "+Degree;
  }
}