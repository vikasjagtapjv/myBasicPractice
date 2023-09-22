package JavaLogicalProblem;

import org.testng.annotations.Test;

public class SubString {
	@Test(priority=0)
	public void test0() {
		String s="Vikas Jagtap";
		//print characters between 2 to 5
		System.out.println(s.substring(2,5));
		
	}
	@Test(priority=1)
	public void test2() {
		String s="Viraj";
		System.out.println(s.substring(2,5));
	}
	@Test(priority=2)
	public void test3() {
		String s="Viraj";
		System.out.println(s.substring(2,4));
		
	}

}
