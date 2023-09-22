package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test24imp_exp {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.navigate().to("https://www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9527069986");
		//use explicite wait
		WebDriverWait re=new WebDriverWait(driver,30);
		re.until(ExpectedConditions.visibilityOfElementLocated(By.id("password"))).sendKeys("jagtap");
		
	}

}
