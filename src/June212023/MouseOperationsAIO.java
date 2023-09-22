package June212023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOperationsAIO {
	public static void main (String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement element=driver.findElement(By.xpath("//div[text()='Electronics']"));
		
		Actions act=new Actions(driver);
		//act.moveToElement(element).build().perform();
		
		//act.contextClick(element).build().perform();
		
		
		
	//	act.sendKeys(Keys.ENTER).build().perform();
		//act.release(element).build().perform();
		Thread.sleep(5000);
		
		WebElement enterKey=driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		act.sendKeys(enterKey,Keys.ENTER).build().perform();
		
		
		
		
	}

}
