package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class TestNg_Intro {
	/*
	 * TestNg is the testing framework which can be inspired from jUnit &NUnit but it introducing 
	 * some new functionalities that make it more powerful& easier to use.
	 * TestNg is the testing framework which can be used for unit testing ,integration,end-to-end testing
	 * and functional testing.
	 * 
	 * Following are the advantages of The TestNg
	 * 1)Providing the more advantages than junit which make more easier life of tester.
	 * 2)we can run each test in parallel mode eg. suppose we have 10 test we can run all test in parallel 
	 * manner.
	 * 3)It supports Data driven testing(@DataProvider)
	 * 4)Generates automatic test reports
	 * 5)test case can grouped and priotized more easily.
	 * 6)Support parallel Execution
	 * 7)we can parametrize our selenium test using testNg
	 * 8)We can run only fail test cases using TestNg.xml file,no need to run full test script 
	 * in case of test case fail.
	 * 9)
	 */
	@Test(priority=0)
	public void testGoogle() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("HYR TUTORIALS",Keys.ENTER);
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(5000);
		driver.close();
	}
	@Test
public void testFacebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.navigate().to("https://www.Facebook.com/"); 
		driver.findElement(By.name("email")).sendKeys("HYR TUTORIALS",Keys.ENTER);
		String s=driver.getTitle();
		System.out.println(s);
		Thread.sleep(5000);
		driver.close();
	}
	
}
