package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.*;
import org.testng.annotations.Test;

public class Parallel_Test {
	WebDriver driver;
	
	@Test
	public void verifyTitle() {
//		Launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		String actual="Swag Labs";
		String title=driver.getTitle();
		Assert.assertEquals(title,actual);
		//System.out.println(title);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
		
	}
	
	@Test
	public void verifyLogo() {
//		Launch the browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.saucedemo.com/");
		WebElement logo=driver.findElement(By.xpath("//div[@class='login_logo']"));
		Assert.assertTrue(logo.isDisplayed());
//		String actual="Swag Labs";
//		String title=driver.getTitle();
//		Assert.assertEquals(title,actual);
		//System.out.println(title);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		driver.quit();
		
	}

}
