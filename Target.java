
import java.awt.Graphics;
import java.awt.Color;
import java.awt.Container;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *  This program displays a target logo on a white
 *  background.
 */

public class Target extends JPanel
{
  public void paintComponent(Graphics g)
  {
    super.paintComponent(g);  // Call JPanel's paintComponent method
                              //   to paint the background
    int xCenter = getWidth() / 2;
    int yCenter = getHeight() / 2;
    g.setColor(Color.RED);
    g.fillOval(92,192,120,120);
    g.setColor(Color.WHITE);
    g.fillOval(112,212,80,80);
    g.setColor(Color.RED);
    g.fillOval(127,227,50,50);
  }
    public static void main(String[] args)
  {
    JFrame window = new JFrame("Target");
    window.setBounds(600, 600, 400, 400);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Target panel = new Target();
    panel.setBackground(Color.WHITE);
    Container c = window.getContentPane();
    c.add(panel);
    window.setVisible(true);
  }
}
