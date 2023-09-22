package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("jvgtapviky");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12456789  ");
		
		
		

	}

}
