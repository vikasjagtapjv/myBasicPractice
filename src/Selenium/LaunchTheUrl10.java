 package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheUrl10 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
	Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//get current url
		String url = driver.getCurrentUrl();
		System.out.println(url);
		//get current webpage
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//close current browser
		Thread.sleep(3000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		
				
		
		
		
		

	

	
	}

}
