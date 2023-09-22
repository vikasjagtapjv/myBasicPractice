package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.events.WebDriverEventListener;

public class TestCase {

	public static void main(String[] args) throws Exception {
		//WebDriverEventListener.Chromedriver().setup();
		System.setProperty(" webdriver.chrome.driver","E:\\chromedriver.exe ");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		driver.findElement(By.id("user-name")).sendKeys("Vikas");
		driver.findElement(By.id("password")).sendKeys("123456789");
		driver.findElement(By.xpath("//input[@id=\"login-button\"]")).click();
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
