public class RandPhoneNumber {
  
  public static void main(String[] args) {
    String Part1="";
    String Part2="";
    String Part3="";
     for (int i = 1; i<=10; i++) {
       if (i>= 1 && i<= 3) 
         Part1 += "" + ((int)(8*Math.random()));
       else if (i==4)
         Part2 += "" + ((int)(8*Math.random()));
       else if(i==5)
         Part2 += "" + ((int)(5*Math.random()));
       else if (i==6)
         Part2 += "" + ((int)(3*Math.random()));
       else if (i>=7 && i<=10)
         Part3 += "" + ((int)(10*Math.random()));
     }
     System.out.println(Part1+"-"+Part2+"-"+Part3);
     
  }
}