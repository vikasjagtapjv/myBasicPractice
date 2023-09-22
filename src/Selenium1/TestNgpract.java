package Selenium1;

import org.testng.annotations.Test;

public class TestNgpract {
	@Test
	public void a()
	{
		System.out.println("its method a");
	}
	@Test(priority=1)
	public void b()
	{
		System.out.println("its method b");
	}

}
