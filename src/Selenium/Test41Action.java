package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test41Action {
public static void main(String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
	Actions action=new Actions(driver);
	Thread.sleep(3000);
	action.moveToElement(driver.findElement(By.linkText("Electronics"))).build().perform();
	Thread.sleep(3000);
	//driver.findElement(By.linkText("Gaming")).click();
	action.contextClick(driver.findElement(By.linkText("Electronics"))).build().perform();
}
	
}
