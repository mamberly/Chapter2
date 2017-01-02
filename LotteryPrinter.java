import java.util.Random;

public class LotteryPrinter
{
public static void main(String[] args)
{
Random rand = new Random();
int num1 = rand.nextInt(49);
num1 = num1 + 1;

int num2 = rand.nextInt(49);
num2 = num2 + 1;

int num3 = rand.nextInt(49);
num3 = num3 + 1;

int num4 = rand.nextInt(49);
num4 = num4 + 1;

int num5 = rand.nextInt(49);
num5 = num5 + 1;

int num6 = rand.nextInt(49);
num6 = num6 + 1;

System.out.println("Play this combination " + num1 +", "+ num2 +", "+ num3 +", "+ num4 +", "+ num5 +", "+ num6 +", "+ "it'll make you rich!");

System.exit(0);
}
}