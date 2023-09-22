package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testimpli {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		driver.get("https://www.amazon.com/");
		
		WebElement drp = driver.findElement(By.xpath("//*[@id='searchDropdownBox']"));
		 
		Select se =new Select(drp);
		se.selectByVisibleText("Books");
	}

}
