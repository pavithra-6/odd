package sumave1;
import java.util.Scanner;
public class Rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String rev="";
		System.out.println("enter the string s1");
		Scanner c=new Scanner(System.in);
		String s1=c.nextLine();
		int l=s1.length();
for(int i=s1.length()-1;i>=0;i--)
{
	rev=rev+s1.charAt(i);
}
System.out.println("reverse string is:"+rev);
	}
}
