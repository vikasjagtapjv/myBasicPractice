package CollectionArrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo01 {
	public static void main(String[]args) {
		//Declare ArrayList
		//Restrict ArrayList with Homogenious data 
//		ArrayList <String> al=new ArrayList<String>();
//		ArrayList<Integer>al=new ArrayList<Integer>();
		//List al=new ArrayList();
		
		ArrayList al=new ArrayList();
		//Add new Elements in ArrayLIst
		al.add(10);
		al.add("Welcome");
		al.add(15.5);
		al.add('A');
		al.add(true);
		System.out.println(al);
		//Remove
		
		al.remove(1);
		System.out.println(al);
		al.add("Welcome");
		System.out.println(al);
		al.add(1,"We are added");
		System.out.println(al);
		//Retrive specific Object/value
		al.get(3);
		System.out.println(al.get(3));//=A
		
		//Change some value with new value
		al.set(3, "Viraj");
		System.out.println(al);
		//verify particular object present in ArrayList or not
		System.out.println(al.contains("We are ad"));
		//verify ArrayList is empty or not
		System.out.println(al.isEmpty());
		//Read all elelments from arrayLIst
		//for ,for each ,iterator method
		
		//Using for loop we can read the data
		
//		for(int i=0;i<al.size();i++)
//		{
//			//String st=al.get(i);
//			System.out.println(al.get(i));
//		}
		
		//By using for each loop we read the data
		for( Object e:al) {
			System.out.println(e);
			
		}
		
		//By using iterator we can read data
		Iterator it=al.iterator();
		while(it.hasNext())
		//it will return true Or False If its true then its go inside the for loop
		{
			System.out.println(it.next());//Print the element & move to next
		}
		
	}

}
