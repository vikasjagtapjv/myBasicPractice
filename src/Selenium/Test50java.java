package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test50java {
	
		public static void main(String[]args) throws InterruptedException
		{
			System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);//JAVA.UTIL.COCURRANT
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://www.facebook.com/");
			Thread.sleep(3000);
			
			JavascriptExecutor jre=(JavascriptExecutor)driver;
		WebElement dre= driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
			jre.executeScript("arguments[0].click();" ,dre);
			
	}
	

}
