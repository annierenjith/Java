package Practice;

public class palindrome {

	public static void main(String[] args) {
		
		String str ="too hot to hoot";
		 str = str.replaceAll(" ", "");
		
		char x[] = str.toCharArray();
		
		int size = str.length();
		char y[] = new char[size];
		int i=0;
		
		while(i!=size)
		{
			y[i] = x[size-1-i];
			i++;
		}
		
		i=0;
		while(i!=size)
		{
			if(x[i]!=y[i])
			{
				System.out.println("Not a palindrome"); 
				System.exit(0); ;
				
			}
			else
			{
				i++;
				continue;
			}
		}
		
		System.out.println("Palindrome");
		
	}

}
