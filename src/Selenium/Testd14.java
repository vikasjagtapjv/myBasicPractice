package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testd14 {
	public static void main(String[]args) throws Exception
	{
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		Thread.sleep(3000);
		List<WebElement>radios=driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("size of radio button:"+radios.size());
		System.out.println(radios.get(0).isDisplayed());
		System.out.println(radios.get(2).isSelected());
		System.out.println(radios.get(1).isEnabled());
		
		Thread.sleep(3000);
		radios.get(2).click();
		
		System.out.println(radios.get(1).isEnabled());
		Thread.sleep(3000);
		List<WebElement>radi=driver.findElements(By.xpath("//input[@class='_8esa']"));
		String ExpectedResult="female";
		int l=radi.size();
		for(int i=0;i<=l;i++)
		{
			if(radi.get(i).getText().equalsIgnoreCase(ExpectedResult));
			{
				radi.get(i).click();
				System.out.println(ExpectedResult+ " ");
				break;
			}
			
		}
		//1
		Thread.sleep(3000);
		List<WebElement>drop=driver.findElements(By.xpath("//select[@id='month']/option"));
		System.out.println("size of month:"+ drop.size());
		Thread.sleep(3000);
		drop.get(3).click();
		
		//2
		Thread.sleep(3000);
		WebElement dp = driver.findElement(By.xpath("//select[@id='month']"));
		Select mon = new Select(dp);
		
		mon.selectByVisibleText("Mar");
		
		mon.selectByValue("5");
		
		mon.selectByIndex(11);
		
		System.out.println(mon.getFirstSelectedOption().getText());
		
		//3
		Thread.sleep(3000);
		
		List<WebElement>month=mon.getOptions();
		System.out.println("Total month values:"+month.size());
		
		
		for(int i=0;i<month.size();i++)
		{
			String dr=month.get(i).getText();
			if(dr.equalsIgnoreCase("Aug"))
			{
				month.get(i).click();
			}
		}
		
		
		
		 
		
		
		
		
		
		
		
		
	}

}
