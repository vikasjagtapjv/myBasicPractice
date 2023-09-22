package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test49script {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		JavascriptExecutor jre=(JavascriptExecutor) driver;
		
		jre.executeScript("document.getElementById('email').value='Raj'");
		
		jre.executeScript("document.getElementById('pass').value='Raj'");
		
		
		 WebElement vikas = driver.findElement(By.xpath("//*[@data-testid='open-registration-form-button']"));
		 
		jre.executeScript("arguments[0].click();",vikas);
		
	}
	

}
  