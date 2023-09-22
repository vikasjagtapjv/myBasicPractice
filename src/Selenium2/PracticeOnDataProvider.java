package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class PracticeOnDataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setUp()
	
	{
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		
		
		
	}
	@Test
	public void shop()
	{
		
	}

}
