package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Double_Click {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.flipkart.com");
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).sendKeys(Keys.ENTER);
		WebElement action=driver.findElement(By.xpath("//div[text()='Mobiles']"));
		Actions actions= new Actions(driver);
		Thread.sleep(3000);
		actions.moveToElement(action).build().perform();
		Thread.sleep(3000);
		actions.doubleClick(action).build().perform();
		
	}

}
