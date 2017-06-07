package ggg;
public class prime {
public static void main(String args[])
{
	int j,m=0,flag=0;
	int n=17;
	for(j=2;j<=m;j++)
	{
		if(n%j==0)
		{
			System.out.println("the no is not prime");
			flag=1;
			break;
		}
	}
	if(flag==0)
		System.out.println("the no is a prime");
}
}

