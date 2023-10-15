 package CollectionQueue;

import java.util.Iterator;
import java.util.PriorityQueue;

public class QueueDemo {
	public static void main(String[]args)
	{
		PriorityQueue q=new PriorityQueue();
		q.add("a");
		q.add("b");
		q.add("c");
		//q.offer(100);//Hetrogenious not allowed in the priorityqueue
		//System.out.println(q);
		//insertation order is preserved & duplicates are allowed
		
		
		//to get header Elements
		System.out.println(q.element());//Showing NoSuchElementException when q is empty
		//System.out.println(q.peek());//return Null when q is empty
		
		
		//RETURN AND REMOVE ELEMENT FROM QUEUE
     	System.out.println(q.remove());//if q is empty it will return NoSuchElementException
//		System.out.println(q);
//		System.out.println(q.poll());//if q is empty it will return Null
//		System.out.println(q);
		
		
		//TO READ ALL THE METHODS FROM THE QUEUE
//		Iterator itr=q.iterator();
//		while(itr.hasNext())
//		{
//			System.out.println(itr.next());
//		}
		for (Object ele:q)
		{
			System.out.println(ele);
		}
	}

}
