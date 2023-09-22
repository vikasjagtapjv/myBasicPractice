package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class ScreenshotOnFailedTest {
	Test20Practice t2= new Test20Practice();
	@Test
	public void fblogin() throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		t2.driver=new ChromeDriver();
		t2.driver.manage().window().maximize();
		t2.driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		t2.driver.manage().deleteAllCookies();
		t2.driver.get("https://www.facebook.com/");
		 
		Thread.sleep(3000);
		t2.driver.findElement(By.id("email")).sendKeys("vikas");
		t2.driver.findElement(By.id("pass")).sendKeys("vikas24");
		t2.driver.findElement(By.id("vikas_jagtap")).click();


		
		
	}
	@AfterMethod
	public void TakesScreenshotOnFailure(ITestResult result) throws Exception
	{
		t2.capturescreenshot(result);
	}
}
