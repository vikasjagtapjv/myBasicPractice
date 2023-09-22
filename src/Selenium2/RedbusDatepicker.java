package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RedbusDatepicker {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.redbus.in/");
		
	}
	@Test
	public void selectDate()
	{
		driver.findElement(By.xpath("//input[@id='onward_cal']")).click();
		String ExpectedMonth_Year="Jan 2024";
		String ExpectedDay="24";
		while(true)
		{
			String MY=driver.findElement(By.xpath("//td[@class='monthTitle']")).getText();
			if(MY.equals(ExpectedMonth_Year))
			{
				break;
			}
			else
			{
				driver.findElement(By.xpath("//td[@class='next']")).click();
			}
			
		}
		driver.findElement(By.xpath("//td[text()='"+ExpectedDay+"']")).click();
				
	}
	@AfterMethod
	public void tearDown()  {
		driver.quit();
	}

}
