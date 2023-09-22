package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test25 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		JavascriptExecutor jre= (JavascriptExecutor)driver;
		
	jre.executeScript("document.getElementById('email').value='jagtap'");
	
	jre.executeScript("window.scrollBy(0,400)");
		
	}

	//private static void executeScript(String string) {
		// TODO Auto-generated method stub
		
	}


