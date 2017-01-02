import java.util.Random;
public class DieSimulator
{
public static void main(String[] args)
{
Random rand = new Random();
int num = rand.nextInt(6)+1;
//num = num+1;
System.out.println(num);
}
}