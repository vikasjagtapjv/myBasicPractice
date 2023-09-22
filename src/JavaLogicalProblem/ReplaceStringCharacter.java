package JavaLogicalProblem;

import org.testng.annotations.Test;

public class ReplaceStringCharacter {
	@Test(priority=0)
	public void test0()
	{
		String s="Hi vikas";
		System.out.println(s.replace("H", "t"));
	}
	@Test(priority=1)
	public void test1()
	{
		String s="Vikas";
        System.out.println(s.replace("k", "r"));
	}
	@Test(priority=2)
	public void test2()
	{
		String s="Viraj";
		System.out.println(s.replace("r", "k"));
	}

}
