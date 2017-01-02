import java.awt.Rectangle;

public class AreaTester
{
public static void main(String[] args)
{
Rectangle box = new Rectangle(40,50,30,40);
double area = (box.getWidth() * box.getHeight());

System.out.println(area);
}
}