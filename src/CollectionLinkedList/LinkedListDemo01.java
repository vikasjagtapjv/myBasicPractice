package CollectionLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedListDemo01 {
	public static void main(String[]args)
	{
		LinkedList l=new LinkedList();
		l.add("A");
		l.add(23);
		l.add("hello");
		l.add(2);
		l.add("B");
		l.add("c");
		l.add(true);
		l.add(null);
		System.out.println(l);
		l.add(0,"Viraj");
		l.set(0,"raj");
		System.out.println(l);
		System.out.println(l.size());
		l.remove(0);
		System.out.println(l);
		l.remove("A");
		System.out.println(l);
	     // Collections.sort(l);
	      l.set(3,"Rohan");
	      System.out.println(l);
	      System.out.println(l.contains("hello"));
	      System.out.println(l.contains("HI")); 
	      System.out.println(l.isEmpty());
	      
	      
	      
		
	}

}
