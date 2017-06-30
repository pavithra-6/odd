package sumave1;
import java.util.Scanner;
public class PowerofNumber {

	public static void main(String[] args) {
		int c1,c2;
		double c3=0;
		Scanner s=new Scanner(System.in);
		System.out.println("enter the number");
		c1=s.nextInt();
		System.out.println("enter the power of the number");
		c2=s.nextInt();
		c3=Math.pow(c1,c2);
		System.out.println(c3);
	}

}
