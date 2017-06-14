package hhh;
import java.util.Scanner;
public class bgj {
	public static void main(String args[])
	{
		int nu,num=0,remainder,n;
		Scanner a=new Scanner(System.in);
		n=a.nextInt();
		System.out.println("enter the any positive number:");
		nu=n;
		while(nu!=0)
		{
		remainder=nu%10;
		num=num+remainder*remainder*remainder;
		nu=nu/10;
		}
		if(num==n)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("not an amstrong number");
		}
		a.close();
	}
}
