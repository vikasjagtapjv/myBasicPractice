package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Test38Pract {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver .get("https://www.google.co.in/");
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("How stuff work");
		Thread.sleep(3000);
		List<WebElement>auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		System.out.println("size"+ auto.size());
		Thread.sleep(3000);

		//
		//Thread.sleep(3000);

		for(int i=0;i<auto.size();i++)
		{
			String ExpectedResult ="how stuff works videos";
			if(auto.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{   auto.get(i).click();
				System.out.println(ExpectedResult +  "clicked"  );
				break;
				
			}
		}
		
		 
	
		
	}

}
