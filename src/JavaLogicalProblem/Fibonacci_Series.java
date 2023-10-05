package JavaLogicalProblem;

import org.testng.annotations.Test;

public class Fibonacci_Series {
	@Test(priority=0)
	public void test()
	
	{
		//each number is a sum of two preceding number
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1+" "+n2);
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);//first print the sum of n1&n2;
			//now we are interchanging  the values
			n1=n2;
			n2=sum;
		}
		
	}
	@Test(priority=1)
	public void test1()
	{
		int n1=1;
		int n2=2;
		int sum=0;
		System.out.println(n1+ " "+n2);
		for(int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
			
		}
	}
	@Test(priority=2)
	public void test2()
	{
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1+" "+n2);
		for (int i=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	}
	@Test(priority=3)
	public void test3() {
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1+" "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	}
	
	@Test(priority=4)
	public void test4() {
		int n1=0;
		int n2=1;
		int sum;
		System.out.println(n1+" "+n2);
		for(int i=2;i<=10;i++)
		{
			sum=n1+n2;
		   System.out.println(" " +sum);
		   n1=n2;
		   n2=sum;
		}
	}
	@Test(priority=5)
	public void test5()
	{
		int n1=0;
		int n2=1;
		int sum;
		System.out.println(n1+" "+n2);
		for (int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	}
	@Test(priority=6)
	public void test6() {
		int n1=0;
		int n2=1;
		int sum=0;
		System.out.println(n1+" "+n2);
		for (int i=2;i<=10;i++)
		{
			sum=n1+n2;
			System.out.println(" "+sum);
			n1=n2;
			n2=sum;
		}
	}

}
