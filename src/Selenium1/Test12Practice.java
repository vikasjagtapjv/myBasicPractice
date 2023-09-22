package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test12Practice {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("document.getElementById('twotabsearchtextbox').value='shirt'");
		WebElement ne= driver.findElement(By.xpath("//input[@id='nav-search-submit-button']"));
		jre.executeScript("arguments[0].click();",ne);
		
		
		
		
	}

}
