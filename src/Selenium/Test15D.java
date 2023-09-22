  package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test15D {
public static void main(String[]args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.get("https://www.opencart.com/index.php?route=account/register");
	driver.manage().window().maximize();
	//driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form -button')]")).click();
	
	//List<WebElement>month=driver.findElements(By.xpath("//select[@id='month']/option"));
	//System.out.println("size of month:"+month.size());
	//System.out.println(month.get);
	//1
	WebElement drpCountry=driver.findElement(By.id("input-country"));
	 
	 Select drp = new Select(drpCountry);
	 
	 drp.selectByVisibleText("Aruba");
	 
	 drp.selectByValue("5");
	 
	 drp.selectByIndex(23);
	 System.out.println(drp.getFirstSelectedOption().getText());
	 
	//2
	 Thread.sleep(3000);
	 
	 List<WebElement>rp=drp.getOptions();
	 
	 System.out.println("sise:"+ rp.size());
	 
	 for(int i=0;i<rp.size();i++)
	 {
		String e=rp.get(i).getText();
		if(e.equalsIgnoreCase("austria"))
		{
			rp.get(i).click();
		}
			
	 }
	
	
	
	
}
}
