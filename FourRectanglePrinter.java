import java.awt.Rectangle;
public class FourRectanglePrinter
{
public static void main(String[] args)
{
Rectangle rect1 = new Rectangle(0,0,20,30);
System.out.println(rect1);
rect1.translate(20,0);
System.out.println(rect1);
rect1.translate(0,30);
System.out.println(rect1);
rect1.translate(-20,0);
System.out.println(rect1);

}
}