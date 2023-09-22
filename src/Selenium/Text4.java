package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Text4 {

	public static void main (String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new  ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		//driver.navigate().forward();
		String Url=driver.getCurrentUrl();
		System.out.println(Url);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("vira");
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345678");
		//driver.findElement(By.xpath("//[text()\"Facebook helps you connect and share with the people in your life.]\"")).click();
//[text()"Facebook helps you connect and share with the people in your life.]"
		Thread.sleep(3000);
		driver.close();
		driver.quit();
		
	
		
	}
}
