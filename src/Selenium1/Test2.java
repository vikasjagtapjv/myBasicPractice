  package Selenium1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test2 {
	public static void main (String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://demoqa.com/browser-windows");
		WebElement ja=driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		JavascriptExecutor jre=(JavascriptExecutor) driver;
		
		jre.executeScript("arguments[0].click();",ja);
		
		//to find how many windows are available
		Set<String> str= driver.getWindowHandles();
		
		System.out.println(str);//we get the id of each window
		System.out.println(str.size());//how many windows are available
		
		Thread.sleep(3000);
		
		Iterator<String> str2=str.iterator();// allows us to access elements of a collection.
		
		String window1=str2.next();//i++
		String window2=str2.next();//i++
		
		//print the title of child window
		driver.switchTo().window(window2);
		System.out.println(window2);
		System.out.println(driver.getTitle());
		
		Thread.sleep(3000);
		driver.close();//current window will close
		//print the title of parent window
		driver.switchTo().window(window1);
		
		System.out.println(window1);
		System.out.println(driver.getTitle());
		
		//Thread.sleep(3000);
		
		//driver.quit();//close the current as well as associated window
		
		Thread.sleep(3000);
		JavascriptExecutor jr= (JavascriptExecutor)driver;
		 
		//jr.executeScript("document.getElementByXpath('//*[text()='Alerts']')");
		WebElement we= driver.findElement(By.xpath("//*[text()='Alerts']"));
		
		jr.executeScript("window.scrollBy(0,400)");
		jr.executeScript("arguments[0].click();",we);
		
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		
		Thread.sleep(3000);
		 
		driver.switchTo().alert().accept();
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='confirmButton']")).click();
		driver.switchTo().alert().dismiss();
		JavascriptExecutor jer= (JavascriptExecutor)driver;
		
		
		WebElement wie= driver.findElement(By.xpath("//*[text()='Frames']"));
		jer.executeScript("window.scrollBy(0,200)");
		jer.executeScript("arguments[0].click();",wie);
		//driver.findElement(By.xpath("//*[text()='Frames']")).click();
		
		
		
		
		
		
	}
	
	

}
