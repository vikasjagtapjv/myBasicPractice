package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test33 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://jqueryui.com/draggable/");
		List<WebElement>frames=driver.findElements(By.tagName("iframe"));
		System.out.println("size"+frames.size());
		driver.switchTo().frame(0);
		WebElement DragableElement = driver.findElement(By.id("draggable"));
		Thread.sleep(3000);
		
		Actions act = new Actions(driver);
		act.dragAndDropBy(DragableElement,30,40).build().perform();
		Thread.sleep(3000);
		act.clickAndHold(DragableElement).dragAndDropBy(DragableElement,30,50).build().perform();

		
	}

}
