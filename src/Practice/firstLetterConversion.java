package Practice;

public class firstLetterConversion {

	public static void main(String[] args) {
		
		String str ="i am good";
		char x[] = str.toCharArray();
		
		int size = x.length;
		
		int i=1;
		
		x[0]=(char) (x[0]-32);
		
		while(i!=size)
		{
			if(x[i]==' ')
			{
				x[i+1]= (char) (x[i+1]-32);
				
			}
			
			
				i++;
			
		}
		
		System.out.println(str);
		System.out.println(x);

	}

}
