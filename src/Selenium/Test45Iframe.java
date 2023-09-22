package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test45Iframe {//iframe stands inline frame
	public static void main(String[]args) throws Exception
	{
		//setting property of chrome browser &setting path of chromedriver
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		//launching chrome browser instance 
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.paytm.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[text()='Sign In']")).click();
		//webpage which is embedded in another webpage  OR HTMLdocument embedded inside another 
		Thread.sleep(3000);
		//find total number of iframe on webpage
		
		int allframe=driver.findElements(By.tagName("iframe")).size();
		
		System.out.println(allframe);
		//Go check inside each frame and web element present on page
		for(int i=0;i<allframe;i++) 
		{
			//perform operation inside frame we need switch to that frame using below method.
			driver.switchTo().frame(i);
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'Watch ')]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("//*[contains(text(),'close')]")).click();

		}
		
		
	}

}
