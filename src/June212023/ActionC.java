package June212023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionC {
	public static void main (String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).sendKeys(Keys.ENTER);
		
		// Perform Mouse Hover Action on the Web Element
		WebElement ele=driver.findElement(By.xpath("//div[text()='Electronics']"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).build().perform();
		
//		// Perform Double Click Action on the Web Element
//		WebElement doublec=driver.findElement(By.xpath("//div[text()='Mobiles']"));
//		act.doubleClick(doublec).build().perform();
		
		//Click And Hold
		WebElement clickh=driver.findElement(By.xpath("//div[text()='Grocery']"));
		act.clickAndHold(clickh).build().perform();
	}

}
