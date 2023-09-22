package Selenium2;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {
	static WebDriver driver;
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https:/opensource-demo.orangehrmlive.com/");
		
		//String SingleWindowId=driver.getWindowHandle();
		//System.out.println(SingleWindowId);
	//	String s0=driver.getTitle();
		//System.out.println(s0);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
		
		Thread.sleep(3000);
		//driver.close();
		
		//Open Another Browser Window
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		//String s1=driver.getTitle();
		//System.out.println(s1);
		//Open Third Browser window
		Thread.sleep(5000);
		WebElement Ttl=driver.findElement(By.xpath("(//a[@target='_blank'])[1]"));
		Ttl.click();
		//String s=driver.getTitle();
		//System.out.println(s);
		//driver.navigate().to("https://www.facebook.com/OrangeHRM/");
		
	
		
		
		
		
		//It return multiple browser windows
		Set<String>MultipleWindowIds=driver.getWindowHandles();
		//For getting this multiple browser window ids we use the Itrator
		
//		Iterator<String>it=MultipleWindowIds.iterator();
//		String parentWindowId=it.next();
//		String childWindowId0=it.next();
//		String childWindowId1=it.next();
//		System.out.println("Parent window Id:- "+parentWindowId);
//		System.out.println("Child window Id0:- "+childWindowId0);
//		System.out.println("Child window Id1:- "+childWindowId1);
//		
		
		
		//Another Method - By using List & ArrayList
		//First we need to convert set to List
		
		List<String> WindowsIdList=new ArrayList<String>(MultipleWindowIds);
		
	String parentwId=WindowsIdList.get(0);
	String c1wId=WindowsIdList.get(1);
		String c2wId=WindowsIdList.get(2);
		
		System.out.println("Parent window Id  :- "+parentwId);
	System.out.println("Child window Id c1:- "+c1wId);
		System.out.println("Child window Id c2:- "+c2wId);
	
		//Now Switch from one Browser Window to another
	driver.switchTo().window(c1wId);
		System.out.println("c1 Window tilte: "+driver.getTitle());
		Thread.sleep(3000);
		
		driver.switchTo().window(parentwId);
		System.out.println("Parent Window Title : "+driver.getTitle());
		
	Thread.sleep(3000);
		driver.switchTo().window(c2wId);	
		System.out.println("c2 window Title: "+driver.getTitle());
		
		
//		//We are also use the for each loop
//		for(String WindowId:MultipleWindowIds) {
//			String Title=driver.switchTo().window(WindowId).getTitle();
//			System.out.println(Title);
//			if(Title.equals("Sign In | LinkedIn"))
//			{
//				driver.close();
//			}
//		}
		
	}

}
