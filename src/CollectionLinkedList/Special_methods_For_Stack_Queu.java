package CollectionLinkedList;

import java.util.LinkedList;


public class Special_methods_For_Stack_Queu {
	public static void main(String[] args) 
	{
		LinkedList l=new LinkedList();
		l.add("forg");
		l.add("dog");
		l.add("cat");
		l.add("Monkay");
		l.add("Goat");
		l.add("cow");
		l.add("ship");
		l.add("Hore");
		System.out.println(l);
		l.addFirst("Lion");
		l.addLast("Tiger");
		System.out.println(l);
		l.getFirst();
		System.out.println(l.getFirst());
		System.out.println(l.getLast());
		l.removeFirst();
		l.removeLast();
		System.out.println(l);
		
	}
	
	
	
	

}
