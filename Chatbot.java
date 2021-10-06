import java.util.Scanner;

public class Chatbot{
  private static int chat=0;
  private static String Input;
  public static void main(String[]args){
    Scanner Chat = new Scanner(System.in);
    System.out.println("Good Day! I am Chatbot Dingo! Ask me something!");
    Boolean talk = true;
    int rand,counter=0;
    while (talk){
      Input = " "+Chat.nextLine().replace("?","")+" ";
      while(chat==0&&counter<20){
        rand = (int)(Math.random()*4);
        switch(rand){
          case 0:
            numberTalk(Input);
            break;
          case 1:
            schoolTalk(Input);
            break;
          case 2:
            boroughTalk(Input);
          case 3:
            siblingTalk(Input);
            break;
          default:
            System.out.println("ok");
            break;
        }
        counter++;
      }
      if(chat==0)
        System.out.println("None of chat my sensors were triggered, that's rare");
      chat=0;
      counter=0;
    }
  }
  public static void numberTalk(String Input){
    String temp="";
    boolean isInt=true,isBinary=true,isHexa=true;
    for (int i = 0; i<Input.length()-1;i++){
      if (Input.charAt(i)==' ')
        temp = Input.substring(i+1,Input.indexOf(" ",i+1));
    }
    for (int j = 0;j<temp.length();j++){
      char temp1 = temp.charAt(j);
      if(temp1!='1' && temp1!='0'){
        isBinary=false;
        if (!Character.isDigit(temp1)){
          isInt=false;
          if(!Character.isLetter(temp1) && !Character.isDigit(temp1) || !temp.toUpperCase().equals(temp)){
            isHexa=false;
          }
        }
      }
    }
    if(isBinary){
      Binary Bi=new Binary(temp);
      System.out.println("I think you entered a binary numer, so I'll convert it for you.\n"+
                         temp+" is "+Bi.convertToDecimal()+" in to decimal form and \n"+
                         Bi.convertToHexadecimal()+" in hexadecimal.");
      chat++;
    }
    else if(isInt){
      Decimal Dec = new Decimal(Integer.parseInt(temp));
      System.out.println("I think you entered an integer, so I'll convert it for you.\n"+
                         temp+" is "+Dec.convertToBinary()+" in binary and "+Dec.convertToHexa()+
                         "\n in hexadecimal.");
      chat++;
    }
    else if(isHexa){
      Hexadecimal Hexa = new Hexadecimal(temp);
      System.out.println("I think you entered a hexadecimal, so I'll convert it for you.\n"+
                         temp+" is "+Hexa.convertToBinary()+" in binary and "+Hexa.convertToDecimal()+
                         "\n in decimal form.");
      chat++;
    }
  }
  public static void schoolTalk(String Input){
    for(int i =0; i<Input.length()-5;i++){
      if (Input.toLowerCase().substring(i,i+6).equals("school"))
        System.out.println("So you want to talk about school? I go to Digital School 164."+
                           "It's weird though becasue I wasn't made with the ability to learn.");
      chat++;
    }
  }
  public static void siblingTalk(String Input){
    String keyword="";
    for (int i = 0; i<Input.length()-1; i++){
      if(Input.charAt(i)==' '){
        keyword=Input.substring(i+1,Input.indexOf(" ",i+1)).toLowerCase();
        i=Input.indexOf(" ",i+1);
      }
      if (keyword.equals("brother")||keyword.equals("sister")||keyword.equals("sibling")||keyword.equals("siblings")||keyword.equals("borthers")||keyword.equals("sisters")){
        System.out.println("Siblings huh? I probably have some, but I've never met any of them."+
                           "Maybe they're doing great things!");
        chat++;
        i=Input.length();
      }
    }
  }
  public static void boroughTalk(String Input){
    String keyword="";
    for (int i = 0; i<Input.length()-1; i++){
      if(Input.charAt(i)==' '){
        keyword=Input.substring(i+1,Input.indexOf(" ",i+1)).toLowerCase();
        i=Input.indexOf(" ",i+1);
      }
      if (keyword.equals("manhattan")||keyword.equals("queens")||keyword.equals("brooklyn")||keyword.equals("bronx")){
        if (keyword.equals("manhattan"))
          System.out.println("Manhattan's a cool place. I would love to go there!. If only I had the ability to walk.");
        else if(keyword.equals("queens"))
          System.out.println("Arguably the better place to hang out with friends because it's Manhattan but not as crowded.");
        else if(keyword.equals("bronx"))
          System.out.println("You mean that burough where a school is overcrowded with students mostly from Queens?");
        else
          System.out.println("Wait, is Brooklyn even that special?");
        i=Input.length();
        chat++;
      }
    }
  }
}
