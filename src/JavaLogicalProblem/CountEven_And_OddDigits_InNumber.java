package JavaLogicalProblem;

import org.testng.annotations.Test;

public class CountEven_And_OddDigits_InNumber {
	@Test(priority=1)
	public void test0()
	{
		int num=145678;
		int Evencount=0;
		int OddCount=0;
		while(num>0)
		{
			int reminder=num%10;
			
			
			if(reminder%2==0)
			{
				Evencount++;
				
			}
			else 
			{
				OddCount++;
				//
			}
			num=num/10;
		}
		
		System.out.println(" Number of Even numbers in number :"+Evencount);
		System.out.println("Number of Odd numbers in a number :"+OddCount);
	}
	@Test(priority=1)
	public void test1() {
		int num=13456782;
	int	evenNum=0,oddNum=0;
	while(num>0)
	{
		int reminder=num%10;//
		if(reminder%2==0)
		{
			evenNum++;
		}
		else
		{
			oddNum++;
		}
		num=num/10;
	}
	System.out.println("count of even "+evenNum);
	System.out.println("count of odd "+oddNum);
	}
	@Test(priority=2)
	public void test2()
	{
		int num=1234567;
		int evenNum=0;
		int oddNum=0;
		int reminder;
		while(num>0)
		{
			reminder=num%10;
			if(reminder%2==0)
			{
				evenNum++;
			}
			else
			{
				oddNum++;
			}
			num=num/10;
		}
		System.out.println(evenNum);
		System.out.println(oddNum);
	}
	@Test(priority=3)
	public void test3() {
		int num=1234567;
		int reminder;
		int evenName=0;
		int oddNumber=0;
		while(num>0)
		{
			reminder=num%10;
			if(reminder%2==0)
			{
				evenName++;
			}
			else
			{
				oddNumber++;
			}
			num=num/10;
			
		}
		System.out.println(evenName);
		System.out.println(oddNumber);
	}
	
	
	

}
