package JavaLogicalProblem;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Array_to_String {
	@Test(priority=0)
	public void test0()
	{
		int a[]= {12,34,34,45,65,889};
		System.out.println(Arrays.toString(a));
	}
	@Test(priority=1)
	public void test1()
	{
		int a[]= {12,45,1,34,59};
		System.out.println(Arrays.toString(a));
		
	}
	@Test(priority=2)
	public void test2()
	{
		int a[]= {12,32,43,2,3,4,5,86,1};
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	
		
	}
	@Test(priority=3)
	public void test3() {
		int a[]= {11,32,9,99,32,3,5,2,1,4};
		System.out.println(Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
	}

}
