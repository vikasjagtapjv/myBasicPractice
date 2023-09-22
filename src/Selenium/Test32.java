package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test32 {
	public static void main(String[]aargs) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://jqueryui.com/droppable/");
		//stiching frame
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("size of frame:"+frames.size());
		for(int i =0;i<frames.size();i++)
		{
			driver.switchTo().frame(i);
			if(driver.findElement(By.id("draggable")).isDisplayed()&& driver.findElement(By.id("droppable")).isDisplayed())
			{
			Thread.sleep(3000);
			Actions act = new Actions(driver);
			act.dragAndDrop(driver.findElement(By.id("draggable")), driver.findElement(By.id("droppable"))).build().perform();
			System.out.println("element found" +(i+1)+  "frames");
			}
		}
		
		
		
	}

}
