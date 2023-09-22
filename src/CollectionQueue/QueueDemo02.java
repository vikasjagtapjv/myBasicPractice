package CollectionQueue;

import java.util.LinkedList;

public class QueueDemo02 {
	public static void main(String[] args) {
		LinkedList q=new LinkedList();
		q.add("s");
		q.add("t");
		q.add("u");
		q.offer("u");
		q.offer(100);
//		
		//here duplicate elements are allowed
		//hetrogenous data can be allowed
		
		//RETRIVE THE HEADER ELEMENTS
		//System.out.println(q.element());
		//it will return the header element
		//if q is empty it will return the NoSuchElementException
		//System.out.println(q.peek());
		//it will also return the header elements
		// if q is empty it will return the Null
		
		//REMOVE AND RETURN THE ELEMENT
		
//		System.out.println(q.remove());//if q is empty it will return NoSuchElementException
//		System.out.println(q);
		
		System.out.println(q.poll()); //if q is empty it will return Null
		System.out.println(q);
		
		
		
	}

}
