package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test26 {

	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.facebook.com/");
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("document.getElementById('email').value='viky'");
		Thread.sleep(3000);
		jre.executeScript("window.scrollBy(0,400)");
		
	}
}
