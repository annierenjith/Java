package Practice;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String str1="SILENT";
		String str2 ="LISTEN";
		
		char x[] = str1.toCharArray();
		char y[] = str2.toCharArray();
		
		Arrays.sort(x);
		Arrays.sort(y);
		
		System.out.println(x);
		System.out.println(y);
		
		Boolean result=Arrays.equals(x, y);
		
		if(result==true)
		{
			System.out.println("Anagram");
		}
		else
		{
			System.out.println("Not an anagram");
		}

	}

}
