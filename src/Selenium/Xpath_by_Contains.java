package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_by_Contains {
	public static void main(String[]args) throws Exception
	
	{
		    
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://automationpractice.com/index.php");
		Thread.sleep(3000);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		String Url =driver.getCurrentUrl();
		System.out.println(Url);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//div//div//div//div//div//div//a[contains(@title,'You are looking for a dress for every day? Take a look at')]"+ "[normalize-space()='Casual Dresses']"));
		driver.close();
		driver.quit();
		
	}

}
