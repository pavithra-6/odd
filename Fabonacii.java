package sumave1;

public class Fabonacii {

	public static void main(String[] args) {
		int n=10;
		int a=0,b=1,c=0;
		for(int i=0;i<10;i++){
			a=b;
			b=c;
			c=a+b;
			System.out.println(c);
		}

	}

}
