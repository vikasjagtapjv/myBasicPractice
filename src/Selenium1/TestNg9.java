package Selenium1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNg9 {
	@Test
	public void assertionCheck()
	{
		String ExpectedResult="google";
		String ActualResult="Gooogle";
		try {
		Assert.assertEquals(ActualResult,ExpectedResult);
		}catch(Exception e) {
			e.printStackTrace();
		}
		System.out.println("successful run");
	}
	    

}
