package Collection_HashMap;

import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import org.testng.annotations.Test;

public class HashTable_Demo {
	@Test
	public void test() 
	{
		//Hashtable t=new Hashtable();//default size is 11,load factors is 0.75
		//Hashtable tb=new (initial capacity);
		//Hashtable tb=new HashTable(intial capacity,fill ratio/load factor);
		Hashtable<Integer, String> tbl=new Hashtable<Integer,String>();
		//Nulls are not allowed as key and Value
		tbl.put(101, "John");
		tbl.put(102, "Devid");
		tbl.put(103, "Smith");
		tbl.put(104, "Rony");
		tbl.put(105, "Kandy");
		System.out.println(tbl);
		System.out.println(tbl.get(104));
		tbl.remove(104);
		System.out.println(tbl);
		System.out.println(tbl.contains("Smith"));
		System.out.println(tbl.containsKey(102));
		System.out.println(tbl.containsValue("John"));
		System.out.println(tbl.isEmpty());
		System.out.println(tbl.keySet());
		System.out.println(tbl.values());
		for(int K:tbl.keySet())
		{
			System.out.println(K+" "+tbl.get(K));
		}
		
		//Entry specific methods
		for( Map.Entry entry:tbl.entrySet())
		{
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		//Iterator methods
		Set t=tbl.entrySet();
		
		Iterator it=t.iterator();
		
		while(it.hasNext())
		{
			 Map.Entry entry=(Entry) it.next();
			 System.out.println(entry.getKey()+" "+entry.getValue());
		}
		
		
	}

}
