package JavaProject;

import org.testng.annotations.Test;

public class Convert_UpperCase_toLower {
	@Test(priority=0)
	public void test0(){
		String s1="";
		String s="No 26 Sound";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				s1=s1+Character.toLowerCase(c);
			}
			else
			{
				s1=s1+Character.toUpperCase(c);
			}
		}
		System.out.print(s1);
	}
	@Test(priority=1)
	public void test1() {
		String s="Hell Java";
		String emp="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				emp=emp+Character.toLowerCase(c);
			}
			else
			{
				emp=emp+Character.toUpperCase(c);
			}
			
		}
		System.out.println(" "+emp);
	}

}
