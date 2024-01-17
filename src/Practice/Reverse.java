package Practice;

public class Reverse {

	public static void main(String[] args) {
		
		String x = "Ambili";
		System.out.println(x);
		char y[] =x.toCharArray();
		System.out.println(y);
		int size = y.length;
		char z[] = new char[size];
		
		
		int i=0;
		
		while(i!=size)
		{
		z[i]=y[size-i-1];
				i++;
		}
		
		System.out.println(z);
	}

}
