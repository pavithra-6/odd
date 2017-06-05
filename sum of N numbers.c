package sum;
import java.util.Scanner;
public class sum{
public static void main(String args[])
{
int i,sum=0;
Scanner n=new Scanner(System.in);
i=n.nextInt();
System.out.println("enter the n numbers:");
for(int j=0;j<i;j++)
{
sum=sum+j;
}
System.out.println("the sum of n numberas are:"+sum);
}
}

