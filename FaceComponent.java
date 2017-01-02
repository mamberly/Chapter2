import javax.swing.JComponent;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
public class FaceComponent extends JComponent
{
public void paintComponent(Graphics g)
{
Graphics2D g2 = (Graphics2D) g;
Ellipse2D.Double circle = new Ellipse2D.Double(105,100,100,100);
Ellipse2D.Double smcirc = new Ellipse2D.Double(130, 130,15,15);
Ellipse2D.Double smcirc2 = new Ellipse2D.Double(170, 130,15,15);
Line2D.Double line = new Line2D.Double(130,170,180,170);

g2.setColor(new Color(200,0,255));
g2.draw(circle);
g2.draw(smcirc);
g2.draw(smcirc2);
g2.draw(line);
}
}