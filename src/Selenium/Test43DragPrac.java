package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test43DragPrac {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.jqueryui.com/droppable/");
		//switching to frame
		List<WebElement>drag=driver.findElements(By.tagName("iframe"));
		System.out.println("size of iframe:"+drag.size());
		
		Thread.sleep(3000);
		for(int i=0;i<drag.size();i++) {
			driver.switchTo().frame(0);
			if(driver.findElement(By.id("draggable")).isDisplayed() && driver.findElement(By.id("droppable")).isDisplayed())
			{
				Thread.sleep(3000);
				Actions action=new Actions(driver);
				action.dragAndDrop(driver.findElement(By.id("draggable")),driver.findElement(By.id("droppable"))).build().perform();
				
				
			}
				
			
		}
		
		
	}

}
