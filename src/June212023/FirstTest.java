package June212023;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class FirstTest extends BaseClass {
	@Test(testName="GoogleTest")
	public void testGoogle()
	{
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Mumbai");
//		String Et="Mumbai";
//		String At=driver.getTitle();
//		assertEquals(At,Et,"Title");
		
		
	}
	@Test(testName="Facebook")
	public void testFacebook() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.name("email")).sendKeys("Vikas",Keys.ENTER);
		
		SoftAssert softAssert=new SoftAssert(); 
		String At=driver.getTitle();
		String Et="Log in to Facebook";
		AssertJUnit.assertEquals(At,Et,"Title");
		
//		String actualUrl=driver.getCurrentUrl();
//		String expectedUrl="https://www.facebook.com/";
//		softAssert.assertEquals(actualUrl,expectedUrl);
		
		softAssert.assertAll();
		
		
	}
	@Test(testName="OrangeHRM")
	
		public void testOrangeHRM()
		{
			driver.get("https:opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
			driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
			driver.findElement(By.xpath("//button[@type='submit']")).click();
			AssertJUnit.assertTrue(driver.findElement(By.id("Welcome")).isDisplayed());
		}
	
	

}
