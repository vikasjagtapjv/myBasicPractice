package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class iFrame {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.globalsqa.com/demo-site/draganddrop/");
		 
		Thread.sleep(3000);
		int allIframe=driver.findElements
				(By.xpath("//iframe[contains(@data-src,'../../demoSite/practice/drop')]")).size();
		System.out.println("List of IFrame:"+ allIframe);
		
		
	}

}
