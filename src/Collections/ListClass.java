package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

public class ListClass {

	public static void main(String[] args) {

		List<Integer> list = new LinkedList<Integer>();
		list.add(5);
		list.add(6);
		System.out.println(list.size());
		System.out.println("LinkedList");
		System.out.println("***********");
		
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
		
		List<String> list1 = new ArrayList<String>();
		list1.add("Ambili");
		list1.add("Renjith");
		list1.add("Pooni");
		list1.add("Nandan");
		
		System.out.println("ArrayList");
		System.out.println("***********");
		
		for(int i=0;i<list1.size();i++)
		{	
			System.out.println(list1.get(i));
		}
		
		List<Integer> list2 = new Vector<Integer>();
		list2.add(100);
		list2.add(200);
		list2.add(500);
		
		System.out.println("Vector");
		System.out.println("***********");
		
		for(int i=0;i<list2.size();i++)
		{	
			System.out.println(list2.get(i));
		}

				

	}

}
