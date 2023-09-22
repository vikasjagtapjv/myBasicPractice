package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test29 {
	public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		Thread.sleep(3000);
		JavascriptExecutor jre= (JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.id("icp-touch-link-language"));
		jre.executeScript("arguments[0].scrollIntoView()",wb);
		
		
		
	}

}
