package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A_ctions {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		//create web element reference
		WebElement elec= driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions act =new Actions(driver);
		act.moveToElement(elec).build().perform();
		Thread.sleep(3000);

		//right click
		act.contextClick(elec).build().perform();
		//release control webelement
		Thread.sleep(3000);

		act.release(elec).build().perform();
		Thread.sleep(3000);

		act.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(3000);

		WebElement home= driver.findElement(By.xpath("//*[text()='Home & Furniture']"));
		Thread.sleep(3000);
		act.sendKeys(home   ,Keys.ENTER).build().perform();
		
		System.out.println("home & furniture manu clicked");
		
		 
		
		
	}

}
