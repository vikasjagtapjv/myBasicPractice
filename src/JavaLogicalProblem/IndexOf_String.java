package JavaLogicalProblem;

import org.testng.annotations.Test;

public class IndexOf_String {
	@Test(priority=0)
	public void test0() {
		String s="abcdefg";
		System.out.println(s.indexOf("d"));
	}
	@Test(priority=1)
	public void test1()
	{
		String s="abcdefghijklmnopqrstuvwxyz";
		System.out.println(s.indexOf("j"));
	}

}
