import java.util.Scanner;
class digit
{
public static void main(String args[])
{
int num,c=0;
Scanner a=new Scanner(System.in);
System.out.println("enter the numbers:");
while(num>0)
{
num=num/10;
c=c+1;
}
System.out.println("calculate the no of digit:"+c);
}
}
