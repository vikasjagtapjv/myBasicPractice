package JavaLogicalProblem;

import org.testng.annotations.Test;

public class ReverseArray {
	@Test
	public void test()
	{
		String s= "India is my country";
		String rev="";
		for(int i=0;i<s.length();i++)
		{
		   char[] c=s.toCharArray();
		   rev=c[i]+rev;
		   
		}
		System.out.println(rev);
		
	}

}
