public class DiplomaWithHonors extends Diploma{
  //private String Name,Degree;
  public DiplomaWithHonors(String n,String d){
    super(n,d);
  }
  public String toString(){
    return super.toString()+"\n*** with honors ***";
  }
}