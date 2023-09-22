package JavaProject;

import org.testng.annotations.Test;

public class MultiProblem {
	@Test(priority=1)
	public void reverseString() {
		String s="vinita";
		String rev=" ";
		int len=s.length();
		for (int i=len-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
			
		}
		System.out.println(rev);
		
	}
	@Test(priority=2)
	public void primeNumber()
	{
		/*
		 * prime Number is nothing but its only divisible 1 & itself number
		 * if it is divisible by any other number then its not prime number 
		 */
		int n=13;
		boolean prime=true;
		for(int i=2;i<n;i++)
		{
			if(n%i==0) {
				prime=false;
				break;
			}
		}
		System.out.println(prime);
			
		
	}
	@Test(priority=3)
	public void fibonacciSeries()
	{
		/*
		 * first declare the i value
		 * check the condition
		 * if condition is true then  its comes inside for loop body
		 * then assign the a & b value in the c
		 * Then we print the c value
		 * After that we replace the value of a with b & b in place of c
		 * Once it over 
		 * then comes to the increament operator
		 * i value is increased by 1
		 * then check the condition 
		 * it will continue till the condition false
		 * concentraton is loosen
		 * focus of loop comes outside the body
		 */
		int a=0;
		int b=1;
		int c;
		int n=8;
		System.out.print(a+" "+b);
		for(int i=0;i<=n;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
	}
	

}
