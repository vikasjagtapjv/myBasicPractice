package CodeStudio;

import java.util.ArrayList;

public class ExampleOfArrayList {
	/*
	 * Heterogeneous Homogeneous type data can be stored
	 * Duplicate value allow
	 * Insertion order is preserved
	 * Resizable
	 * 
	 * ArrayList a=new ArrayList();
	 * 
	 */
	public static void main(String[]args) {
		//Declare ArrayList
		ArrayList al= new ArrayList();//we can store here all types of data
		//when we want to store only specific type of data 
		//ArrayList<String>als=new ArrayList<String>();//Homogeneous data
		
		//Methods in ArrayList
		
		al.add("vikas");
		al.add(0,"Viraj");
		al.add("Jagtap");
		al.add(3);
		al.add("");
		al.add("vikas");  
		al.add("vinita");
		al.add('H');
		al.add(true);
		al.add(12.4);
		al.get(0);
		al.size();
	//	al.remove(0);
		al.contains("Viraj");
		al.isEmpty();
		//al.clear();
		System.out.println("Size of array List "+al.size());
		
		//System.out.println(al.remove(5));
		System.out.println(al.get(7));
		System.out.println(al.set(7, "raj"));
		
		System.out.println(al.contains("Viraj"));//search the elements in the collection
		System.out.println(al.isEmpty());//checking the elements are present in the collection
		
		System.out.println(al);
		al.clear();
		System.out.println(al.size());
	
	}

}
