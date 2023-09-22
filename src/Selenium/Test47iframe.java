   package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test47iframe {
public static void main(String[]args) throws Exception {
	//setting property of chrome browser &setting path of chromedriver

	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	//launching chrome browser instance 

	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://paytm.com/");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//*[contains(text(),'Sign In')]")).click();
	Thread.sleep(3000);
	//webpage which is embedded in another webpage  OR HTMLdocument embedded inside another 
	//find total number of iframe on webpage

	int allframe=driver.findElements(By.tagName("iframe")).size();
	System.out.println(allframe);
	//Go check inside each frame and web element present on page

	for(int i =0;i<allframe;i++)
	{
		Thread.sleep(3000);
		//perform operation inside frame we need switch to that frame using below method.

		driver.switchTo().frame(i);
		driver.findElement(By.xpath("//*[contains(text(),'Watch ')]")).click();
		Thread.sleep(3000);
		driver.switchTo().parentFrame();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@title,'Close')]")).click();
		
	}

}
	
}
