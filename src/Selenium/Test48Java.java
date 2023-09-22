package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test48Java {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//JAVA.UTIL.COCURRANT
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor jre=(JavascriptExecutor) driver;
		
		jre.executeScript("document.getElementByID('email').value='vira';");
		//Thread.sleep(3000);
		jre.executeScript("document.getElementByID('pass').value='1234';");
		//Thread.sleep(3000);
		//jre.executeScript("argument[0].click;",");
		
	}

}

