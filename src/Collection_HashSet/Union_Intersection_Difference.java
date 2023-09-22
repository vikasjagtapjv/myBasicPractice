package Collection_HashSet;

import java.util.HashSet;

public class Union_Intersection_Difference {
	public static void main(String[] args) {
		HashSet<Integer> set01 =new HashSet<Integer>();
		set01.add(1);
		set01.add(2);
		set01.add(3);
		set01.add(4);
		set01.add(5);
		//System.out.println(set01);
		
		HashSet <Integer> set02=new HashSet<Integer>();
		set02.add(3);
		set02.add(4);
		set02.add(5);
		set02.add(6);
		set02.add(7);
		set02.add(8);
		//System.out.println(set02);
		//Union: It will give only Matching Elements
		//it will give all the elements with not repetitive in nature
//		set02.addAll(set01);
//		System.out.println(set02);
		
		//Intersection:to get common elements from both collection
//		set02.retainAll(set01);
//		System.out.println(set02);
		
		//Difference
		set02.removeAll(set01);
		System.out.println(set02);
		
		//subset
		System.out.println(set02.containsAll(set01));
	
		
		
		
	}
	
	
	

}
