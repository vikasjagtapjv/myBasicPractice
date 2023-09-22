package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test28 {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.navigate().to("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		Thread.sleep(2000);
		  JavascriptExecutor js= (JavascriptExecutor) driver;
		  WebElement ele=driver.findElement(By.id("simpleAlert"));
		  js.executeScript("arguments[0].scrollIntoView()",ele );
	}

}
