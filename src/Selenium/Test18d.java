package Selenium;

import java.time.chrono.Era;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test18d {
	public static void main(String[]args) throws Exception
	{
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		Thread.sleep(3000);
		
		WebElement drp =driver.findElement(By.xpath("//select[@id='day']"));
		
		Select sem =new Select(drp);
		
		List<WebElement>era= sem.getOptions();
		
		System.out.println("size:"+era.size());
		
		for(int i =0;i<era.size();i++)
		{
			String str = era.get(i).getText();
			if(str.equalsIgnoreCase("23"))
			{
				era.get(i).click();
			}
		}
		
		
		
		
	}

}
