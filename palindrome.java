package mm;
import java.util.Scanner;
public class palindrome 
{
		public static void main(String args[])
		{
			int p,q,r=0,s;
			System.out.println("enter any number");
			Scanner a=new Scanner(System.in);
			p=a.nextInt();
			a.close();
			while(p>0)
				{
				s=p%10;
				r=r*10+s;
				p=p/10;
		}
			if(r==p)
			{
				System.out.println("the number is palindrome");
			}
			else
			{
				System.out.println("the number is not a palindrome");
			}
	}

}
