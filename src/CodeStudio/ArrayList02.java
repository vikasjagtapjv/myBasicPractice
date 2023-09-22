package CodeStudio;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
public class ArrayList02 {
	public static void main(String[]args) {
		
		ArrayList<String>als=new ArrayList<String>();
		als.add("S");
		als.add("V");
		als.add("b");
		als.add("N");
		als.add("R");
		als.add("w");
		als.add("x");
		als.add("y");
		als.add("z");
		als.add("n");
		ArrayList<String>als1=new ArrayList<String>();
		System.out.println("als1 Printed "+als1);
		als1.addAll(als);
		System.out.println(als1);
		
		//Loop through Elements of ArrayList
//		for(int i=0;i<als.size();i++) {
//			System.out.println(als.get(i));
//		}
		for(String i:als) {
			System.out.println("_________________________"+i);
		}
		Iterator it=als.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
		
		//Sort ArrayLIst
		Collections.sort(als);
		System.out.println(als);
		Collections.sort(als,Collections.reverseOrder());
		System.out.println(als);
		Collections.shuffle(als);
		System.out.println(als);
		
		//create arrayList
		String[] car= {"bom","ahm","nheo"};
		//Converting array to array list
		ArrayList al=new ArrayList(Arrays.asList(car));
		System.out.println(al);
	}

}
