package JavaLogicalProblem;

import org.testng.annotations.Test;

public class PrimeNumber {
	@Test(priority=0)
	public void test0()
	{
		int num=9;
		int temp=0;
		for (int i=2;i<num-1;i++)
		{
			if(num%i==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Its not a prime number");
		}
		else
		{
			System.out.println("prime Number");
		}
		
	}
	@Test(priority=1)
	public void test1()
	{
		int num=7;
		int temp=0;
		for(int i=2;i<num-1;i++)
		{
			if(num%2==0)
			{
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println("Not a prime number");
		}
		else
		{
			System.out.println("Its prime NUmber");
		}
	}

}
