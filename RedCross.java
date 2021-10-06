// Lesson 7, RedCross Bug Hunt, Sept 19, 2015
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  This program displays a red cross on a white
 *  background.
 */

public class RedCross extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
         int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillRect(xCenter, yCenter, 10, 50);
    g.fillRect(xCenter, yCenter, 50, 10);
    g.fillRect(xCenter,yCenter, 10,-40);
    g.fillRect(xCenter,yCenter,-40,10);
  }

  public static void main(String[] args)
  {
    JFrame window = new JFrame("Red Cross");
    window.setBounds(600, 600, 400, 400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    RedCross panel = new RedCross();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}
