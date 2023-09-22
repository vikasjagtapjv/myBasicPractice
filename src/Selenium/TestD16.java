package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestD16 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.opencart.com/index.php?route=account/register");
		
		WebElement drpCountry=driver.findElement(By.id("input-country"));
		
		Select re =new Select(drpCountry);
		
		re.selectByVisibleText("Canada");
		
		re.selectByIndex(7);
		
		re.selectByValue("23");
		
		Thread.sleep(3000);
		
		List<WebElement>dr=re.getOptions();
		
		System.out.println("size:"+dr.size());
		
		for(int i=0;i<dr.size();i++)
		{
			String ew=dr.get(i).getText();
			if(ew.equalsIgnoreCase("austria"))
		{
				dr.get(i).click();
		}
		}
		
		
		
	}
	

}
