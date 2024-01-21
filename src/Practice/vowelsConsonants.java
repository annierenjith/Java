package Practice;

public class vowelsConsonants {

	public static void main(String[] args) {
		String str = "Aradhya's Brilliance Center";
		str=str.toUpperCase();
		
		char x[] = str.toCharArray();
		int size = x.length;
		System.out.println(size);
		int i=0;
		
		int vowcnt=0;
		int conscnt=0;
		int spclcnt=0;
		
		while(i!=size)
		{
			if(x[i]>='A' && x[i]<='Z')
			{
				if(x[i]== 'A'||x[i]=='E'||x[i]=='I'||x[i]=='O'||x[i]=='U')
				{
					vowcnt++;
				}
				else
				{
					conscnt++;
				}
			}	
				
				
				
				if (x[i]==' ') {
					spclcnt++;
				}
				
						
			i++;
		}
		System.out.println("vowels"+ vowcnt);
		System.out.println("consonants"+ conscnt);
		System.out.println("specials"+ spclcnt);

	}

}
