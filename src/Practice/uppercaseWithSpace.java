package Practice;

public class uppercaseWithSpace {

	public static void main(String[] args) {
		String str = "i am good";
	//	str = str.replace(" ", "");
		
		char x[] = str.toCharArray();
		int size =x.length;
		int i=0;
		
		while(i!=size)
		{	
			if(x[i]!= ' ')
			{
			x[i]=(char) (x[i]-32);
			}
			i++;
		}
		
		System.out.println(str);
		System.out.println(x);
	}

}
