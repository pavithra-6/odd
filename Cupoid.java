package sumave1;

import java.util.Scanner;

public class Cupoid {

	public static void main(String[] args) {
		int l,w,h;
		int surface,volume;
		Scanner n=new Scanner(System.in);
		l=n.nextInt();
		w=n.nextInt();
		h=n.nextInt();
		surface=l*w*h;
		System.out.println(surface);
		volume=(2*l*h)+(2*w*h)+(2*l*w);
		System.out.println(volume);
	}

}
