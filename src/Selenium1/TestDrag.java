package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class TestDrag {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		Thread.sleep(3000);
		
		Actions act =new Actions(driver);
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

		WebElement from=driver.findElement(By.xpath("//div[contains(@id,'draggable')]"));
		WebElement To=driver.findElement(By.xpath("//div[contains(@id,'droppable')]"));
		
		act.dragAndDrop(from,To).build().perform();
	}

}
