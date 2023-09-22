package Selenium1;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TestNg8 {
	@Test
	public void a() {
		System.out.println("A test method");
		
	}
	@Test(invocationCount=2,priority=-1,enabled=false)
	public void b() {
		System.out.println("B test method");
		
	}
	@Test(invocationCount=2)
	public void c()
	{
		System.out.println("C test method");
	}
	@BeforeMethod
	public void e() {
		System.out.println("E test method");
	}

}
