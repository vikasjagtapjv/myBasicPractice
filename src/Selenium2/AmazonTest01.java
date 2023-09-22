package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AmazonTest01 {
	public static WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	@Test
	public void searchDevice()
	{
		driver.get("https://www.amazon.in/");
		
		WebElement txtElement=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		txtElement.sendKeys("iPhone");
		
		driver.findElement(By.cssSelector("#nav-search-submit-button")).sendKeys(Keys.ENTER);
		
		driver.findElement(By.xpath("(//a[contains(@class,'a-link-normal s-underline-text s-underline-link-text s')])[7]")).click();
		
	}
	

}
