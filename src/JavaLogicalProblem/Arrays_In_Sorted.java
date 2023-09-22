package JavaLogicalProblem;

import java.util.Arrays;

import org.testng.annotations.Test;

public class Arrays_In_Sorted {
	@Test(priority=0)
	public void test0(){
		int a[]= {45,5,23,1,3,54,65,76,77,3,3,};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}
	@Test(priority=1)
	public void test1() {
		int a[] ={12,34,56,1,2,3,98,5,37,89};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}
	@Test(priority=2)
	public void test2()
	{
		int a[] ={12,34,1,3,5,33,54,32};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
	}
	@Test(priority=3)
	public void test3() {
		int a[]= {45,23,1,3,6,8,2,32};
		Arrays.parallelSort(a);
		System.out.println(Arrays.toString(a));
		
	}
	

}
