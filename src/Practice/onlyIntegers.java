package Practice;

public class onlyIntegers {

	public static void main(String[] args) {
		String str="12345abc";
		char x[] = str.toCharArray();
		
		int size = str.length();
		int i=0;
		int count=0;
		
		while(i!=size)
		{
			if(x[i]>= '0' && x[i]<= '9')
			{
				count++;
	
				
			}
			else
			{
				System.out.println("Contains strings");
				System.exit(0);
			}
			i++;
			
		}
		
		System.out.println("Integercount is"+" "+count);

	}

}
