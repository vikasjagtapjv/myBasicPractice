package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test44Drag {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		WebElement Fashion=driver.findElement(By.linkText("Fashion"));
		Actions action=new Actions(driver);
		action.moveToElement(Fashion).build().perform();
		Thread.sleep(3000);
		action.contextClick(Fashion).build().perform();
		Thread.sleep(3000);
		action.sendKeys(Fashion,Keys.ENTER).build().perform();
		Thread.sleep(3000);
		action.release(Fashion).build().perform();
		
		Thread.sleep(3000);
		//release control webelement
		//Thread.sleep(3000);
		driver.navigate().refresh();
		action.sendKeys(driver.findElement(By.linkText("Grocery")),Keys.ENTER).build().perform();
		System.out.println("clicked on grocery");
		
	}

}
