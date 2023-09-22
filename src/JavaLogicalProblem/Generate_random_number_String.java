package JavaLogicalProblem;

import java.util.Random;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.annotations.Test;

public class Generate_random_number_String {
	@Test(priority=0)
	public void test()
	{
		Random ran=new Random();
		//int random=ran.nextInt(100);
		//System.out.println(random);
		double random0=ran.nextDouble();//this will return 0.0 to less than 1.0
		System.out.println(random0);
	}
	@Test(priority=1)
	
	public void test1() {
		System.out.println(Math.random());
	}
	@Test(priority=2)//apache common lang api
	public void test2() {
		String s= RandomStringUtils.randomNumeric(5);
		System.out.println(s);
		String str=RandomStringUtils.randomAlphabetic(5);
		System.out.println(str);
	}
	@Test(priority=3)
	public void test3() {
		String s=RandomStringUtils.randomNumeric(5);
		System.out.println(s);
		String s1=RandomStringUtils.randomAlphabetic(5);
		System.out.println(s1);
	}
	@Test(priority=4)
	public void test4()
	{
		Random rn=new Random();
		double d=rn.nextDouble();
		System.out.println(d);
				
	}

}
