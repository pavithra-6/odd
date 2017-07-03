package sumave1;

public class Allascii {

	public static void main(String[] args) {
		String ch;
        int i;
        for(i=1; i<=255; i++)
        {
            ch = new Character((char)i).toString();
            System.out.println(i+ " -> " + ch + "\t");
        }
	}

}
