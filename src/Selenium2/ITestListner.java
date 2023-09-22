package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

public class ITestListner {
	/*
	 * What is listners in testNG?
	 * Ans:Based on result of the test cases if we want take any action that time we used 
	 * TestNg Listners.that is Post action 
	 * it is an interfaace
	 * we have its set of methods 
	 * we have abstract methods
	 * popularly used Itest Listner
	 * in that following are the methods
	 * 1)onTestStart()-It invoked Only  when any test Method get started
	 * 2)onTestSuccess()-It executed on sucess of test method
	 * 3)onTestFailure()-It involed when test method fails.
	 * 4)onTestSkipped()-It run only when test method has been skipped.
	 * 5)onStart()-It executed on start of any method. 
	 * 6)onFinish()-It executed when any test case finish its execution.
	 * 7)onTestFailedButWithinSuccessPercentage()-This method is invoked each time when the 
	 * test method fails but within sucess percentage.
	 * 
	 *  
	 *  Scenario:
	 *  1)Launch the chrome Browser
	 *  2)Open the OrangeHRM url
	 *  3)login appplication by using username & Password
	 *  4)Click on login button.
	 *  5)Then after login verify the title of the webpage
	 *  6)then match the title of the webpage actual with expected 
	 *  7)Then decide the testcase pass fail using ItestListner
	 */
	
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		
		driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Assert.assertEquals(driver.getTitle(),"OrangeHRM");
		
		
	}
	@Test
	public void failTest() {
		System.out.println("Fail test case");
		Assert.assertTrue(false);
	}
	@Test
	public void testSkipped() {
		System.out.println("Test case Skipped");
		throw new SkipException("Skip Exception Throw");
	}
		

}
