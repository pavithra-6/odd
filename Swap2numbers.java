package sumave1;
import java.util.Scanner;
public class Swap2numbers {
	public static void main(String args[]){
int a,b;
System.out.println("enter the two numbers");
Scanner s=new Scanner(System.in);
a=s.nextInt();
b=s.nextInt();
System.out.println("before swapping:"+a);
System.out.println("before swapping:"+b);
a=a+b;
b=a-b;
a=a-b;
System.out.println("after swapping"+a);
System.out.println("after swapping:"+b);



}}