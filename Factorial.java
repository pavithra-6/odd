package sumave1;
import java.util.Scanner;
public class Factorial {
	public static void main(String[] args) {
		int n,fact=1;
    	System.out.println("enterr the all element");
		Scanner d=new Scanner(System.in);
		n=d.nextInt();
		for(int i=1;i<=5;i++){
			fact=fact*i;
		}
		System.out.println(fact);
	}
}
