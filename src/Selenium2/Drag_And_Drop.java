package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_And_Drop {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/droppable/");
		//JavascriptExecutor jre= (JavascriptExecutor)driver;
		//Thread.sleep(3000);
		//jre.executeScript("window.scrollBy(0,400");
		WebElement switchto=driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
		driver.switchTo().frame(switchto);
		Actions actions=new Actions(driver);
		Thread.sleep(3000);
		WebElement from=driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement To=driver.findElement(By.xpath("//div[@id='droppable']"));
		Thread.sleep(3000);
		actions.dragAndDrop(from, To).build().perform();
		
	}

}
