package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22Js {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =  new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		
		JavascriptExecutor jre = (JavascriptExecutor)driver;//casting
		//locate web element using js executor
		jre.executeScript("document.getElementById('email').value='jagtapviky@gmail.com'");
		
		jre.executeScript("document.getElementById('pass').value='12345679'");

		jre.executeScript("window.scrollBy(0, 400)");//upscroll
		jre.executeScript("window.scrollBy(0, -400)");//down scroll
		
		
		

}
} 