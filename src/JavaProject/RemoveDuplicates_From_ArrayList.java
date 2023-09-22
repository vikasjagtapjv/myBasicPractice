package JavaProject;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/*
 * deleting an element from an array in java,
program to delete an element in an array,
remove a specific element from an array in java,
can we remove element from array in java,
how remove element from array in java,
java delete an element from an array,
javascript delete an element from an array,
delete element from array java by index,
how to remove a element from array in java,
delete an element from array java,
can we delete an element from an array in java,
remove duplicate element from an array in java

 */

public class RemoveDuplicates_From_ArrayList {
	public static void main(String[]args)
	
	{
		ArrayList al=new ArrayList();
		al.add("one");
		al.add("two");
		al.add("Three");
		al.add("Three");
		al.add("four");
		al.add("four");
		System.out.println(al);
	//	HashSet hs=new HashSet(al);
		//System.out.println(hs);
		Set<String> lhs=new HashSet<>(al);
		//System.out.println(lhs);
		//ArrayList al1=new ArrayList<>(lhs);
		//System.out.println(al1);
		List<String> s=new ArrayList<>(lhs);
		System.out.println(s);
		
	}

}
