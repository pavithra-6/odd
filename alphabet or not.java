import java.util.Scanner;
public class alphaet
{
public static void main(String args[])
{
char ch;
Scanner n=new Scanner(System.in);
ch=n.next().charAt(0);
System.out.println("enter the characters:");
if((ch>="a")||(char<="z"))
{
System.out.println("this is alphabet");
}
else
{
System.out.println("this is not an alphabet");
}
}
}
