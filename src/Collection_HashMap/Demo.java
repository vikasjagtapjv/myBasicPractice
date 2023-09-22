 package Collection_HashMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Demo {
	public static void main(String []args)
	{
		//HashMap hm=new HashMap();
		HashMap<Integer ,String> hm=new HashMap<Integer,String>();
		hm.put(102,"harry");
		hm.put(101,"katy");
		hm.put(103,"rony");
		hm.put(104,"rony");
		hm.put(105,"tody");
		hm.put(106,"hony");
		hm.put(101, "hi");
		System.out.println(hm);
		hm.get(103);
		System.out.println(hm.get(105));
		System.out.println(hm.remove(106));
		System.out.println(hm);
		System.out.println(hm.containsKey(103));
		System.out.println(hm.containsKey(106));
		System.out.println(hm.containsValue("mon"));
		System.out.println(hm.containsValue("hi"));
		System.out.println(hm.isEmpty());
		System.out.println(hm.keySet());
		for(Object i:hm.keySet())
		{
			System.out.println(i);
		}
		for (Object j:hm.values())
		{
			System.out.println(j);
		}
		
//		for (Object i:hm.keySet())
//		{
//			System.out.println(i+" "+hm.get(i));
//		}
//		
		
		//___________________________________________
		//Entry Methods
		
//		for(Map.Entry entry:hm.entrySet())
//		{
//			System.out.println(entry.getKey()+" "+entry.getValue());
//		}
//		
		
		
//		System.out.println(hm.values());
//		System.out.println(hm.entrySet());
//		System.out.println(hm.size());
		Set s=hm.entrySet();
		Iterator it=s.iterator();
		while(it.hasNext())
		{
			Map.Entry entry=(Entry) it.next();
			
			System.out.println(entry.getKey()+" "+entry.getValue());
		}
	}

}
