import java.util.Scanner;
public class java
{
public static void main(String args[])
{
char ch;
Scanner n=new Scanner(System.in);
ch=n.next().charAt(0);
System.out.println("enter the characters:");
if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
{
System.out.println("this is vowels");
}
else
{
System.out.println("this is not a vowels");
}
}
}
