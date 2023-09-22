package Collection_HashSet;

import java.util.HashSet;
import java.util.Iterator;

public class Read_Elements_From_HashSet {
	public static void main(String[]args)
	{
		HashSet hs=new HashSet();
		hs.add("Hello");
		hs.add("Vikas");
		hs.add("Vinita");
		hs.add("Viraj");
		hs.add("Jagtap");
		hs.add("8999596498");
		hs.add("Beed");
		hs.add("Jay");
		hs.add("Prem");
		hs.add("vignesh");
		hs.add("Ganesh");
		hs.add("Rushi");
		
		//Read Elements By Using For each  Loop
		
		for(Object e:hs)
		{
			System.out.println(e);
		}
		
		
		//By Using Iterator
		HashSet hs1=new HashSet();
		hs1.add("T");
		hs1.add("U");
		hs1.add("OP");
		hs1.add("YU");
		hs1.add("MN");
		hs1.add("N");
		hs1.add("M");
		hs1.add("T");
		hs1.add("OL");
		hs1.add("LP");
		hs1.add("DS");
		hs1.add("NG");
		hs1.add("MK");
		
		
		Iterator it=hs1.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}

	}

}
