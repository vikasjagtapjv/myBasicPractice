package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testd17 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='year']"));
		
		Thread.sleep(3000);

		Select se = new Select(drp);
		
		se.selectByVisibleText("2020");
		
		Thread.sleep(3000);
		
		se.selectByValue("2009");
		
		Thread.sleep(3000);
		
		se.selectByIndex(5);
		
		
		System.out.println(se.getFirstSelectedOption().getText());
		
	}

}
