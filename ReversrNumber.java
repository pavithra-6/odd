package sumave1;
import java.util.Scanner;
public class ReversrNumber {

	public static void main(String[] args) {
	int n,revnum=0;
	System.out.println("enter the number");
	Scanner s=new Scanner(System.in);
	n=s.nextInt();
	while(n!=0){
	revnum=revnum*10;
	revnum=revnum+n%10;
	n=n/10;
	}
	System.out.println("the reverse number is:"+revnum);
	
	
	
	
	}

}
