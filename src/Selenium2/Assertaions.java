package Selenium2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Assertaions {
	//public static void main(String[]args) {
		/*By using TestNg to validate the test methods 
		& verify Expected Result & Actual result matched Or not
		 types of assertion Hard assert & Soft assert
		"Hard Assert":Hard assertion is an assertion that immediately throws the
		Assert Exception When the test case is failed.
		Hard Contains the following:
		AssertEquals-Assert.assertEquals(actual,Expected,Message)
		assertNOtEquals-Assert.assertNotEquals(actual,Expected,Message)
		assertTrue-Assert.assertTrue(Condition)
		assertFalse-Assert.assertFalse(condition)
		___________________________________________________
		"Soft Assert": soft assert does not throw an exception immediately when the
		assertion fails,collect them and carries out with next validation. this accumulates
		the error in each @TestExecution.
		To use testng soft assertion ,we have to use "testng softAssert class"
		____________________________________________________
		Test Scenario for Assertion
		1)Launch Chrome browser
		2)Open url-"https://testautomationpractice.blogspot.com/"
		3)Verify Title of webpage
		4)Verify the presence of the Wikipedia Icon on webpage
		5)Verify the presence of Wikipedia search button webpage
		
		
		 * 
		 */
	@Test
	public void testMethod() {
		// launch the Chrome browser
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vikas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		//open the url
		driver.navigate().to("https://testautomationpractice.blogspot.com/");
		System.out.println("verify the title .......");
		String expectedTitle="Automation Testing Practice";
		String actualTitle=driver.getTitle();
		System.out.println("Title :"+actualTitle);
		Assert.assertEquals(expectedTitle, actualTitle,"Title verified");
		
		System.out.println("Verifying the presence of Wikipedia icon");
		WebElement icon=driver.findElement(By.xpath("//img[contains(@class,'wikipedia')]"));
		Assert.assertTrue(icon.isDisplayed());
		
		System.out.println("Verifying the presence of Search icon");
		WebElement Search=driver.findElement(By.xpath("//input[@class='wikipedia-search-button']"));
		Assert.assertTrue(Search.isDisplayed());
		
		driver.close();
		
	}
	
	

}
