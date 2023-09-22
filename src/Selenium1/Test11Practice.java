 package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test11Practice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.get("https://www.amazon.in/");	
			
			WebElement sc= driver.findElement(By.xpath("//input[@type='text']"));
			
			sc.sendKeys("shirt");
			
			Thread.sleep(3000);
			
			Actions act =new Actions(driver);
			Thread.sleep(3000);
			
			act.sendKeys(Keys.ENTER).build().perform();
			

}
}
