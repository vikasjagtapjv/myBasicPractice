package JavaLogicalProblem;

import org.testng.annotations.Test;

public class CountNumberOfDigitsInNumber {
	
	@Test(priority=1)
	public void test0()
	{
		int a=12345;
		int count=0;
	 
		while(a>0)
		{
			a= a/10;
			count++;
			 
		}
		System.out.println("number of digits : "+count);
		
	}
	@Test(priority=2)
	public void test1()
	{
		int num=12345679;
		int count=0;
		while(num>0)
		{
			num=num/10;//12345678,1234567,123456,
			count++;//1+1+1
		}
		System.out.println("count of digits "+count);
	}
	@Test(priority=3)
	public void test3()
	{
		int num=12345;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
	@Test(priority=4)
	public void test4()
	{
		int num=1234567;
		int count=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println(count);
	}
	
	
}
