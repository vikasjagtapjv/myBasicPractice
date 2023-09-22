package JavaLogicalProblem;

import org.testng.annotations.Test;

public class FindSumOfDigitsInNumber {
	@Test(priority=0)
	public void test0()
	{
		
	
	int  num=123456789;
	int sum=0;
	while (num>0) 
	{
		sum=sum+num%10;
		
		num=num/10;

		
	}
	System.out.println(sum);
	}
	
	@Test(priority=1)
	public void test1()
	{
		int num=1234;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;//4,4+3,7+2,9+1
			num=num/10;//123,12,1,0
		}
		System.out.println(sum);
	}
	@Test(priority=2)
	public void test2() {
		int num=1234;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		
	}
	@Test(priority=3)
	public void test3()
	{
		int num=1234;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
	}
	@Test(priority=4)
	public void test4() {
		int num=12345;
		int sum=0;
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println(sum);
		
	}
	
}
