package JavaLogicalProblem;

import java.util.HashSet;

public class Count_Duplicate_Characters {
	public static void main(String[] args) {
		String s="iihhi";
		int count=0;
		char[]c=s.toCharArray();
		HashSet hs=new HashSet();
		for(char c1:c)
		{
			if(hs.add(c1))
             {
	
                  }
          else {
	           //System.out.println(c);
	           count++;
                         }
		}
		System.out.println(count);
		
	}
	
	
	
	

}
