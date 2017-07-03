package sumave1;
import java.util.Scanner;
public class CeltoFahrenheit {

	public static void main(String[] args) {
	int cel,f;
	System.out.println("enter the temp in celsius");
	Scanner a=new Scanner(System.in);
	cel=a.nextInt();
	f=cel*9/5+32;
	System.out.println(f);

	}

}
