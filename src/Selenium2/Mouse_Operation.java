package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_Operation {
	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.flipkart.in/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
//		Now finding the element for mouse operation
		WebElement n=driver.findElement(By.xpath("//div[text()='Appliances']"));
		
//		Now creating the object of action class & Passing the WebDriver object as argument 
		Actions act=new Actions(driver);
//		For mouse Over we have Actions class method-moveToElement
		act.moveToElement(n).build().perform();
		
	}

}
