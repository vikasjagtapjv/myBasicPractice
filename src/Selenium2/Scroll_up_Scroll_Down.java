package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_up_Scroll_Down {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https:www.amazon.com");
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		//Now we are going to locate the element by using JavascriptExecutor interface&
		//its method executeScript
		Thread.sleep(3000);
		jre.executeScript("document.getElementById('twotabsearchtextbox').value=('Shirts')");
		Thread.sleep(3000); 
		//jre.executeScript("document.getElementById('nav-search-submit-text').click()");
		 driver.findElement(By.id("nav-search-submit-text")).click();
		
		//WebElement click=driver.findElement(By.xpath("//div[@class='nav-search-submit nav-sprite']"));
		
		//jre.executeScript("arguments[0].click",click);
		 Thread.sleep(3000); 
		jre.executeScript("window.scrollBy(0,800 )");
	}

}
