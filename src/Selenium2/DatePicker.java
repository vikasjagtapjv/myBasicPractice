package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class DatePicker {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/datepicker/");
	}
	@Test
	public void selectDate()
	
	{
		
		driver.switchTo().frame(0);
		WebElement month=driver.findElement(By.xpath("//input[@id='datepicker']"));
		month.click();
		String Month_Year="February 2024";
		String ExpectedDay="17";
		while(true)
		{
			String month_year=driver.findElement(By.xpath("//div[@class='ui-datepicker-title']")).getText();
			//Assert.assertEquals(month_year,Month_Year);
			if(month_year.equals(Month_Year)) 
			{
				break;
			}
			else {
				driver.findElement(By.xpath("//span[text()='Next']")).click();
			}
		}
		driver.findElement(By.xpath("//a[text()='"+ExpectedDay+"']")).click();
		System.out.println(month.getText());
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
