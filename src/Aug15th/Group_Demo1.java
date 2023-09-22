package Aug15th;

import org.testng.annotations.Test;

public class Group_Demo1 {
	@Test(groups= {"SmokeTest"})
	public void test5()
	{
		System.out.println("this test from Group_Demo1");
	}
	@Test
	public void test6()
	{
		System.out.println("this is test six");
	}

}
