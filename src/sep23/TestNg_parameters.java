package sep23;

import org.testng.annotations.Test;

public class TestNg_parameters {
	@Test(invocationCount=3)
	public void test1()
	{
		System.out.println("invocationCount run one test case multiple times");
	}
	@Test(enabled=false)
	public void test2()
	{
		System.out.println("dont want to run the test through enabled=false");
	}
	@Test(priority=3)
	public void test4()
	{
		System.out.println("set the executon as per our requirement");
	}
	@Test(groups= {"regression"})
	public void test5()
	{
		System.out.println("for gropuping we use groups");
	}
	@Test(groups= {"Sanity"})
	public void test6()
	{
		System.out.println("for gropuping we use groups2");
	}

}
