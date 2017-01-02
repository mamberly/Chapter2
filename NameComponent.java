import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

public class NameComponent extends JComponent
{
public void paintComponent(Graphics g)
{
Graphics2D g2 = (Graphics2D) g;
Rectangle rect = new Rectangle(10,10,250,75);
g2.setColor(Color.BLUE);
g2.fill(rect);
g2.draw(rect);
g2.setColor(Color.RED);
g2.drawString("Megan Johnson", 75,50);
}
}