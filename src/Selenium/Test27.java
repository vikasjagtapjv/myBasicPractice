package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test27 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jre.executeScript("window.scrollBy(0,1000)");
		Thread.sleep(3000);
		jre.executeScript("window.scrollBy(0,-400)");
		
	}

}
