import java.util.ArrayList;

public class WeightTracker{
  public ArrayList<Double> getWeightChanges(ArrayList<Double> weights){
    ArrayList<Double> changes = new ArrayList<Double>();
    for (int i = 0; i <weights.size()-1; i++)
      changes.add(weights.get(i+1)-weights.get(i));
    return changes;
  }
  public ArrayList<Double> getWeights(double initial, ArrayList<Double> changes){
    ArrayList<Double> weights = new ArrayList<Double>();
    double temp = initial;
    weights.add(temp);
    for (double i :changes){
      temp+=i;
      weights.add(temp);
    }
    return weights;
  }
  public ArrayList<Double> getWeightRuns(ArrayList<Double> weights){
    double difference = 0,temp=weights.get(0);
    ArrayList<Double> weightRuns = new ArrayList<Double>();
    for (int i = 0; i<weights.size(); i++){
      if(Math.abs(weights.get(i)-temp)>=difference)
        difference=weights.get(i)-temp;
      else{
        temp=weights.get(i);
        weightRuns.add(difference);
        difference=0;
      }
    }
    return weightRuns;
  }
}