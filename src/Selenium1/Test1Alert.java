package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1Alert {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://demoqa.com/alerts");
		Thread.sleep(3000);
		JavascriptExecutor jre = (JavascriptExecutor) driver;
		
		WebElement btn=driver.findElement(By.xpath("//*[@id='confirmButton']"));
		
		jre.executeScript("arguments[0].click();",btn);
		
		Thread.sleep(3000);
		 
		driver.switchTo().alert().accept();
		//dismiss alert
		
		
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		
		
		Thread.sleep(3000);
		driver.switchTo().alert().dismiss();
		
		
	}

}
