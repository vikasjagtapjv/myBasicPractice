package CollectionArrayList;
import java.util.ArrayList;
import java.util.Collections;
public class ArrayListDemo02 {
	public static void main(String[]args)
	{
		ArrayList al=new ArrayList();
		al.add("x");
		al.add("y");
		al.add("z");
		al.add("a");
		al.add("b");
		al.add("c");
		
	   
		ArrayList al2=new ArrayList();
		al2.add("r");
		al2.add("T");
		al2.add("U");
		al2.addAll(al);
		System.out.println(al2);
		al2.removeAll(al);
		System.out.println(al2);
		Collections.sort(al);//It give us an sorted order like a b c d e f g
		System.out.println(al);//Time lect:4:50min
		Collections.sort(al,Collections.reverseOrder());
		System.out.println("Elements in ArrayList after reversing order"+al);
		
		//shuffle
		Collections.shuffle(al);
		System.out.println("Elements in arrayList after shuffling"+al);
		
		
		
	}

}
