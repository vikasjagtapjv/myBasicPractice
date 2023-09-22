package Aug15th;

import org.testng.annotations.Test;

public class GroupBy {
	@Test(groups= {"SmokeTest"})
	public void test0() {
		System.out.println("This is my zero Test");
	}
	@Test()
	public void test1() {
		System.out.println("this is my first test");
		
	}
	@Test
	public void test2() {
		System.out.println("This is my second test");
	}
	

}

