package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test8 {
	public static void main(String[]args) throws Exception
	{
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com./");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		Thread.sleep(3000);
		List<WebElement>radios =driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("total no of Radios :-"+radios.size());
		System.out.println(radios.get(1).isEnabled());
		System.out.println(radios.get(0).isDisplayed());
		System.out.println(radios.get(2).isSelected());
		Thread.sleep(3000);
		radios.get(0).click();
		Thread.sleep(3000);
		System.out.println(radios.get(2).isSelected());
		
		
		// Most of the time we use that
		List<WebElement>radios1=driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		String ExpectedResult = "male";
		int l=radios1.size();
		for(int i=0;i<=l;i++)
		{
			
			if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				radios1.get(i).click();
			System.out.println(ExpectedResult + "clicked....");
			break;
			}	
		}
		
		
	}

}
