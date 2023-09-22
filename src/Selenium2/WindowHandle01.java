package Selenium2;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WindowHandle01 {
	WebDriver driver;
	@BeforeMethod 
	public void setup() {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	
	
	@Test
	public void window01() {
		driver.get("https://demoqa.com/browser-windows");
		driver.findElement(By.xpath("//button[text()='New Tab']")).click();
		driver.findElement(By.xpath("//button[text()='New Window']")).click();
		driver.findElement(By.xpath("//button[text()='New Window Message']")).click();
		Set<String>WindowId=driver.getWindowHandles();
		Iterator<String>it= WindowId.iterator();
		String parentId=it.next();
		String child0Id=it.next();
		String child01Id=it.next();
		System.out.println("Parent Window id is: "+parentId);
		System.out.println("child0 Window id is: "+child0Id);
		System.out.println("child01 Window id is: "+child01Id);
		
		driver.switchTo().window(parentId);
		System.out.println("Parent Window Title:"+driver.getTitle());
		
		driver.switchTo().window(child0Id);
		System.out.println("Child0 Window Title: "+driver.getTitle());
		
		driver.switchTo().window(child01Id);
		System.out.println("Child01 Window Title: "+driver.getTitle());

		
		
		
	}
	@Test
	public void window02() {
		driver.get("https:/opensource-demo.orangehrmlive.com/");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		driver.findElement(By.xpath("(//a[@target='_blank'])[1]")).click();
		
		Set<String>MultipleWindowIds=driver.getWindowHandles();
		Iterator<String>it=MultipleWindowIds.iterator();
		String parentWindowId=it.next();
		String childWindowId0=it.next();
		String childWindowId1=it.next();
		System.out.println("Parent window Id:- "+parentWindowId);
		System.out.println("Child window Id0:- "+childWindowId0);
		System.out.println("Child window Id1:- "+childWindowId1);
		driver.switchTo().window(parentWindowId);
		System.out.println("Parent Window Title:"+driver.getTitle());
		
		driver.switchTo().window(childWindowId0);
		System.out.println("Child0 Window Title: "+driver.getTitle());
		
		driver.switchTo().window(childWindowId1);
		System.out.println("Child01 Window Title: "+driver.getTitle());
	}

}
