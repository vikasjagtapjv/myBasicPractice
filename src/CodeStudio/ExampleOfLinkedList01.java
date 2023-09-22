package CodeStudio;
import java.util.*;
public class ExampleOfLinkedList01 {
	public static void main(String[]args)
	{
		//declare LinkedList
		LinkedList<String>ll=new LinkedList<String>();
		ll.add("vilas");//0 element
		
		ll.add("viraj");//1 element
		ll.add("Vinita");//02 element
		ll.add("ram");//03 element
		System.out.println("after adding elements "+ll);
		
		ll.add(2,"umesh");
		System.out.println("After adding umesh at 2nd "+ll);
		
		LinkedList ll2=new LinkedList();
		
		ll2.add("sita");
		ll2.add("ramesh");
		ll2.add("rohit");
		ll2.add("ganesh");
		ll2.add(23);
		
		//add collection 2 ll2 to end of collection
		ll.addAll(ll2);
		System.out.println("After adding ll2 in collection 01 "+ll);
		
		
		ll.remove("ram");
		System.out.println("after removing ram from ll"+ll);
		
		ll.remove(0);
		System.out.println("after removing index o from ll "+ll);
		
		ll.removeAll(ll2);
		System.out.println("After removing collection 02 from collection 01"+ll);
		
		//get element  of first position 
		System.out.println(ll.getFirst());
		
		//replace the element umesh with rohit
		ll.set(1,"Rohit");
		System.out.println("After replecing umesh by rohit"+ll);
		
		
		
		System.out.println("checking rohit is available in list "+ll.contains("Rohit"));
		
		//remove all the elements from collection 
		ll.clear();
		System.out.println("after removing all elements from collection 01 "+ll);
		
	}

}
