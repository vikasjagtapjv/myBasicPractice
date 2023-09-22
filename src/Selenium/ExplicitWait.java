package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.automationtestinginsider.com/2019/08/textarea-textarea-element-defines-multi.html");
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Viraj");
		 
		WebDriverWait re= new WebDriverWait(driver,30);
		re.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@name='name']"))).sendKeys("vikas");
	}

}
