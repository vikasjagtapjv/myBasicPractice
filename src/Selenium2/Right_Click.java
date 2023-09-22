package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Right_Click {
	 static WebDriver driver;
	public static void main(String[]args) throws Exception {
//		Launch browser
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/buttons");
		WebElement n=driver.findElement(By.xpath("//button[text()='Right Click Me']"));
		
//		now creating the object of actions class& passing WebDriver Object
		Actions act=new Actions(driver);
//		Now we are performing Right click action by-contextClick()
		act.contextClick(n).build().perform();
		Thread.sleep(3000);
//		now performing the double click action _doubleClick();
		WebElement n1=driver.findElement(By.xpath("//button[text()='Double Click Me']"));
		act.doubleClick(n1).perform();
		driver.close();
	}

}
