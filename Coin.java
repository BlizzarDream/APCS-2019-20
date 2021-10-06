import java.awt.Image;
import java.awt.Graphics;

public class Coin {
  private Image Head;
  private Image Tail;
  private boolean b;
  public Coin(Image h, Image t) {
    Head=h;
    Tail=t;
  }
  public void flip() {
    if (b==true) {
      b=!b;
    }
    else{
      b=!b;
    }
  }
  public void draw(Graphics g, int x, int y) {
    if (b==true){
      g.drawImage(Head,0,0,null);
    }
    else{
      g.drawImage(Tail,0,0,null);
    }
  }
}