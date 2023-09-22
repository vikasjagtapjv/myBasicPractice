package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Alert_Popups {
	/*
	 * Alert-Small message box which appears on screen to some information 
	 * Types-
	 * Simple-simple information 
	 * confirm alert-for take confirmation from user
	 * prompt take input from user
	 * 
	 */
	WebDriver driver;
//	public Object[][] searchData(){
//		Object[][] popups=new Object[3][2];
//		
//	}
	@Test
	public void simpleAlert() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	driver.get("http://uitestpractice.com/Students/Switchto");
//		driver.findElement(By.xpath("//button[text()='Alert']")).sendKeys(Keys.ENTER);
		// Need to switch to alert window & accept the alert
		//driver.switchTo().alert().accept();//ok button clicked
		//driver.findElement(By.xpath("//button[text()='Confirm']")).sendKeys(Keys.ENTER);
		//driver.switchTo().alert().accept()
driver.findElement(By.xpath("//button[text()='prompt']")).sendKeys("vikas");
driver.switchTo().alert().accept();
	}

}
