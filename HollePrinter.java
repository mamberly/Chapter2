public class HollePrinter
{
public static void main(String[] args)
{
String hello = "Hello World!";
hello = hello.replace("o", "i");
hello = hello.replace("e", "j");
hello = hello.replace("i", "e");
hello = hello.replace("j", "o");
System.out.println(hello);
System.exit(0);
}
}