import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class FrameTester
{
public static void main(String[] args)
{
JFrame frame = new JFrame();
frame.setSize(400,400);
JTextField text = new JTextField("Hello, Megan!");
text.setBackground(new Color(200,255,200));
frame.add(text);
frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.setVisible(true);
}
}