package Collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Setclass {

	public static void main(String[] args) {
		Set<String> set = new HashSet<String>();
		set.add("Sam");
		set.add("Mat");
		set.add("Nimmy");
		
		System.out.println("Using foreachloop");
		
		for(String s:set)
		{
			System.out.println(s);
		}
		
		System.out.println("Using Iterator");
		
		Iterator<String>it = set.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
