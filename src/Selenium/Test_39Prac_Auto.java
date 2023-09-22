package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test_39Prac_Auto {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("shirt");
		
		List<WebElement>auto=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		System.out.println("size of auto:"+auto.size());
		
		Thread.sleep(3000);
		
		
		
		for(int i=0;i<auto.size();i++)
		{
			String ExpectedResult="shirts for women";
			if(auto.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				auto.get(i).click();
			     System.out.println(ExpectedResult +  "clicked"  );

			     break;
			}
			
		}
		
	

		
		
		
	}
}
