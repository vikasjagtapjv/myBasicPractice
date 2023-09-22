package CollectionLinkedList;

import java.util.Iterator;
import java.util.LinkedList;

public class Read_Data {
	public static void main(String[]args)
	{
		LinkedList l=new LinkedList();
		l.add("A");
		l.add("x");
		l.add("c");
		l.add("z");
		l.add("b");
		l.add(32);
		l.add(23);
		l.add("Hello");
		l.add(true);
		l.add(null);
		l.add(null);
		
		// By using for loop we can read all data from LinkedList
		for (int i=0;i<l.size();i++) 
		{
			System.out.println(l.get(i)+"--------------------");
		}
		
		
		//By using for each loop we can read data from LinkedList
		for(Object e:l) {
			System.out.println("-------------------"+e);
		}
		
		//By using iterator we can read data from LinkedList 
		Iterator it=l.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
