package sumave1;
import java.util.Scanner;
public class Multiplicationtable {

	public static void main(String[] args) {
		int num,table;
		System.out.println("enter the number");
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
		for(int i=1;i<=10;i++){
			table=num*i;
			System.out.println(num+"*"+i+"="+table);
		}
	
		
		

	}

}
