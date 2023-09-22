package CollectionLinkedList;

import java.util.Collections;
import java.util.LinkedList;

public class DataSorting {
	public static void main(String[]args)
	{
		LinkedList l=new LinkedList();
		l.add("v");
		l.add("b");
		l.add("e");
		l.add("a");
		l.add("f");
		l.add("g");
		
		
		System.out.println(l);
	Collections.sort(l);
	System.out.println(l);
	Collections.sort(l,Collections.reverseOrder());
	System.out.println(l);
	Collections.shuffle(l);
	System.out.println(l);
		
	}

}
