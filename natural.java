import java.util.Scanner;
class natural
{
public staatic void main()
{
int a,i=1;
int sum=0;
Scanner s=new Scanner(System.in);
a=s.nextInt();
System.out.println("enter the numbers");
while(i<=a)
{
sum=sum+i;
i++;
}
System.out.println("enter the natural number is:"+sum);
}
}
