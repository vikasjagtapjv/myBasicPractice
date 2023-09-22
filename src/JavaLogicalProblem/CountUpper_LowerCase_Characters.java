package JavaLogicalProblem;

import org.testng.annotations.Test;

public class CountUpper_LowerCase_Characters {
	@Test
	public void test() {
	String s="Welcome All In Testing Hub";
	int Upper=0;
    int Lower=0;
    for(int i=0;i<s.length();i++) 
    {
    	char c=s.charAt(i);
    	if(Character.isUpperCase(c))
    	{
    		Upper++;
    	}
    	else if(Character.isLowerCase(c))
    	{
    		Lower++;
    	}
    }
    System.out.println(Upper);
    System.out.println(Lower);
}
	@Test(priority=1)
	public void test1()
	{
		String s="Hi Hello Everyone";
		int Upper=0;
		int Lower=0;
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isUpperCase(c))
			{
				Upper++;
				//System.out.println(c);
			}
			else if(Character.isLowerCase(c))
			{
				Lower++;
			}
				
		}
		System.out.println(Upper);
		System.out.println(Lower);
		
	}
	@Test(priority=2)
	public void test2()
	{
		String s="Hi all how are you";
		int Upper=0;
		int Lower=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(Character.isLowerCase(c))
			{
				Lower++;
			}
			else if(Character.isUpperCase(c))
			{
				Upper++;
			}
		}
		System.out.println(Lower);
		System.out.println(Upper);
	}

}
