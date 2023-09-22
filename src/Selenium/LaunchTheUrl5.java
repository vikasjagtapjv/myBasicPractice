package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheUrl5 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver ","E:\\chromedrivr.exe ");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
	}

}
