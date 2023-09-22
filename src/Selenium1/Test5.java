package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test5 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iPhone XR (64GB) - Yellow");
		driver.findElement(By.xpath("//div[text()='iphone xr 64gb - yellow']")).click();
		WebElement se= driver.findElement(By.xpath("Apple iPhone XR (128GB) - (Product) RED"));
		JavascriptExecutor jre= (JavascriptExecutor) driver;
		jre.executeScript("arguments[0].click();",se);
		
	}
}
