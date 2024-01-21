package Practice;

public class lowercase {

	public static void main(String[] args) {
		String str = "AMBILI";
		char x[]= str.toCharArray();
		
		int size = x.length;
		int i=0;
		
		while(i!=size)
		{
			x[i]=(char) (x[i]+32);
			i++;
		}
		System.out.println(str);
		System.out.println(x);
	}

}
