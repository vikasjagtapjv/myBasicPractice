package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Execute_Script {
	public static void main (String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor jre= (JavascriptExecutor)driver;
		//WebElement ide=driver.findElement(By.xpath("//input[@id='email']"));
		jre.executeScript("document.getElementById('email').value='viky'");
		jre.executeScript("document.getElementById('pass').value='12345'");
		
		WebElement text=driver.findElement(By.xpath("//a[text()='Forgotten password?']"));
		jre.executeScript("arguments[0].click();", text);
		
		
		
		
	}

}
