package Selenium1;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

//import javax.swing.text.html.HTMLDocument.Iterator;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_1 {
	public static void main (String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/browser-windows");
		Thread.sleep(3000);
	WebElement java=driver.findElement(By.xpath("//*[@id='windowButton']"));
	JavascriptExecutor jre= (JavascriptExecutor) driver;
	jre.executeScript("arguments[0].click();",java);
	Thread.sleep(3000);
	//To find out how many windows available
	Set<String> popupId=driver.getWindowHandles();
	System.out.println(popupId);// from here we get id's of windows in Alphanumeric format
	
	System.out.println(popupId.size());//Find from here how many windows are available
	 
	Iterator<String>str=popupId.iterator();
	
	String window1=str.next();//i++
	String window2=str.next();//i++
	
	//print the title of popup of window2 (child window)
	driver.switchTo().window(window2);//method chaining
	System.out.println(window2);
	System.out.println(driver.getTitle());
	
	Thread.sleep(3000);
	
	driver.close();//current window will close
	
	//print the title of parent window
	 
	Thread.sleep(3000);
	driver.switchTo().window(window1);
	System.out.println(window2);
	System.out.println(driver.getTitle())
	;
	
	Thread.sleep(3000);
	 
	driver.quit();//close current as well as  all associated windows
	
	
	
	
	
	
	
		
	}
	

}
