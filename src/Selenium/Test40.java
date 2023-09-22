package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test40 {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[contains(@class,'_2KpZ6l _2doB4z')]")).click();
		
		Thread.sleep(3000);//31no pro for reference
		//moveToElement(Web Element) :-- Mouse hover on a specific web element.
		 //  moveToElement(Home).build().perform();
		WebElement Electronics= driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Electronics).build().perform();
		Thread.sleep(3000);
		act.contextClick(Electronics).build().perform();//2) contextClick() :-- Right click on web page.
//contextClick(Web Element) :-- Right click on specific web element.
		
		
		
			
		
	}

}
