package JavaLogicalProblem;

import org.testng.annotations.Test;

public class Largest_Number {
	@Test(priority=0)
	public void test()
	{
		int a=23;
		int b=55;
		String str=(a>b)?"a":"b";
		System.out.println(str);
	}
	@Test(priority=1)
	public void test1()
	{
		int a=23;
		int b=45;
		String s=(a>b)?"a":"b";
		System.out.println(s);
	}
	@Test(priority=2)
	public void test2()
	{
		int a=21;
		int b=43;
		String s=(a<b)?"a":"b";
		System.out.println(s);
		
	}

}
