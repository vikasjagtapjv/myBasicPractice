package JavaProject;

import org.testng.annotations.Test;

public class swap_Two_numbers {
	@Test(priority=0)
	
	public void demo01()
	{
		int a=10;
		int b=20;
		System.out.println("Before swapping values are "+a+" "+b);
		// 1 logic first Third variable
//		int third=a;
//		a=b;
//		b=third;
		//2 without using third variable
//		a=a+b;
//		b=a-b;
//		a=a-b;
		
		//3 without using third variable (* and /) operator
//		a=a*b;
//		b=a/b;
//		a=a/b;
		//4 bitwise XOR operator(^)
//		a=a^b;
//		b=a^b;
//		a=a^b;
		
		//5 single statement
		b=a+b-(a=b);
		System.out.println("After swapping values are "+a+" "+b);

		
	}
	

}
