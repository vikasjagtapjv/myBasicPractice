package Selenium2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class To_Handle_Window {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		//Created webdriver instance
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://demoqa.com/browser-windows");
		
		Thread.sleep(3000);
		WebElement we=driver.findElement(By.xpath("//button[text()='New Window']"));
		//For the purpose of click we can use the JavascriptExecutor
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("arguments[0].click();",we);
		
		//Now we are going to find out how many windows are available on webpage
		/*
		 * How to handle multiple windows?
		 * If there are multiple windows are open & then we need to perform operation from 
		 * one window to another window then we need to switch to that another window.
		 * The switch between multiple browser windows first we need to get browser window ids
		 * its very much requird
		 * 
		 */
		Set<String>str=driver.getWindowHandles();
		/*
		 * How we are capture the browser window id?
		 * getWindowHandle()&getWindowHandles can be accessing by using driver instance
		 * If we have one browser window then we want to get window id .
		 * We can use "getWindowHandle()"method which will return "Alphanumeric String".
		 * Everytime id will change
		 * At runtime dynamically window id will change
		 * For multiple window we get window id by using "getWindowHandles"method which will 
		 * returns"Set of String".
		 * 
		 */
		//Now we get the id of each browser window
		System.out.println("Id of each window "+str);
		/*
		 * Capture the ids from vaariable
		 * By using"Iterator interface"
		 * Using "Iterator" method it 
		 * will return Iterator object of String 
		 * 
		 */
		Iterator<String> it=str.iterator();
		String PId=it.next();
		String CId=it.next();
		System.out.println("Parent Window id is"+PId);
		System.out.println("Child window id is "+CId);
		/*
		 * What is the need of window id?
		 * Need of window id is to switch from one window to Another window
		 * 
		 */
		driver.switchTo().window(CId);
		/*
		 * get the Title of child window 
		 */
		System.out.println("Child window Title :"+driver.getTitle());
		
		
		
	}

}
