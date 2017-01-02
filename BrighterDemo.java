import java.awt.Color;
public class BrighterDemo
{
public static void main(String[] args)
{
Color col = new Color(30,20,101);
col = col.brighter();
System.out.println("Red: " + col.getRed());
System.out.println("Green: " +col.getGreen());
System.out.println("Blue: " + col.getBlue());
}
}