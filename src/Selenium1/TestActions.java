package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class TestActions {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).sendKeys(Keys.ENTER);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//div[text()='Furniture']"))).build().perform();
		act.doubleClick(driver.findElement(By.xpath("//div[text()='Furniture']"))).build().perform();
		Thread.sleep(3000);
		act.doubleClick(driver.findElement(By.xpath("//div[text()='Sofa Beds']"))).build().perform();
		
		
	}

}
