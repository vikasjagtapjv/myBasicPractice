package Selenium1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestJavaScript {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
		
		WebElement java=driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		JavascriptExecutor jre= (JavascriptExecutor)driver;
		
		jre.executeScript("arguments[0].click();",java);
		
		// To find out how many windows are available 
		
		Set<String>str=driver.getWindowHandles();
		
		//now get the Id of each window
		System.out.println("Id of each window"+str);
		
		//Find out the number of windows
		System.out.println("number of"+str.size());
		
		//Now we are going to use the iterator allow us to access Elements of Collection
		/*
		 * How to handle multiple windows?
		 * If there are multiple windows are open & then we need to perform operation from 
		 * one window to another window then we need to switch to that another window.
		 * The switch between multiple browser windows first we need to get browser window ids
		 * its very much requird
		 * 
		 */
		Thread.sleep(3000);
		
		Iterator<String> itr= str.iterator();
		
		String Window1 = itr.next();//i++
		String Window2=itr.next();//i++
		
		//print the title of child window
		
		Thread.sleep(3000);
		
		driver.switchTo().window(Window2);
		
		System.out.println(Window2);
		System.out.println(driver.getTitle());
		
		//to close the current child window
		
		Thread.sleep(2000);
		driver.close();
		
		//print the title of parent window
		
		driver.switchTo().window(Window1);
		
		System.out.println(Window1);
		System.out.println(driver.getTitle());
		
		jre.executeScript("window.scrollBy(0,400)");
		
		WebElement we=driver.findElement(By.xpath("//span[text()='Alerts']"));
		
		//click on alerts by JavascriptExecutor
		  
		jre.executeScript("arguments[0].click();",we);
		jre.executeScript("window.scrollBy(0,300)",we);
		
		driver.findElement(By.xpath("//button[@id='timerAlertButton']")).sendKeys(Keys.ENTER);
		
		//We need to accept the alert
		 Thread.sleep(2000);
		 driver.switchTo().alert().accept();
		
		
		
	
	}

}
