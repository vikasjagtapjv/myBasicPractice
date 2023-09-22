package Collection_HashSet;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class HashSet_Demo_01 {
	public static void main(String args[])
	{
		HashSet hs=new HashSet();
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
		hs.add("Sumant");
		hs.add("Krushna");
		hs.add("7757839229");
		hs.add("9767086571");
		hs.add("Hari");
	//	System.out.println(hs);
		HashSet hs1=new HashSet(100);
		hs1.add("b");
		hs1.add("v");
		hs1.add("B");
		hs1.add("G");
		hs1.add("QW");
		hs1.add("R");
		hs1.add("L");
		hs1.add("E");
		hs1.add("Q");
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
		hs1.add("DS");
		hs1.add("MK");
		hs1.add("Mk");
		//System.out.println(hs1);
		//hs1.remove("TRE");
		System.out.println(hs1);
		ArrayList al=new ArrayList(hs1);
		Collections.shuffle(al);
		System.out.println(al);
		//System.out.println(hs1.isEmpty());
		
		
		
	}

}
