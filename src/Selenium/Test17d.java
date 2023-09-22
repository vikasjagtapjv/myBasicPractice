package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test17d {
public static void main(String[]args) throws Exception {
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("https://www.facebook.com/");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	
	Thread.sleep(3000);

	WebElement drp=driver.findElement(By.id("day"));
	Select se = new Select(drp);
	
	List<WebElement>e=se.getOptions();
	
	System.out.println("size:"+e.size());
	
	for(int i =0;i<e.size();i++)
	{
		String se1=e.get(i).getText();
		
		if(se1.equalsIgnoreCase("12"))
		{
			e.get(i).click();
		}
	}
	
} 

}
