package JavaLogicalProblem;

import org.testng.annotations.Test;

public class PrimaeNumber {
	@Test(priority=0)
	public void test()
	{
		//By Smart Programming
		int num=7;
		int count=0;
		for (int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
			
		}
		if(count>0)
		{
			System.out.println(" Its not a prime number");
		}
		else
		{
			System.out.println(" Its Prime Number");
		}
	}
	@Test(priority=1)
	public void test1()
	{
		int num=9;
		int count=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			System.out.println("its not a prime number");
		}
		else
		{
			System.out.println( " Its prime number");
		}
	}
	@Test(priority=2)
	public void test2()
	{
		int num=7;
		int count=0;
		for(int i=2;i<=num-1;i++)
		{
			if(num%i==0)//1,1,3,2,1
			{
				count=count+1;
			}
		}
		if(count>0)
		{
			System.out.println("its not a prime number");
		}
		else
		{
			System.out.println("Its not a prime number");
		}
	}
	

}
