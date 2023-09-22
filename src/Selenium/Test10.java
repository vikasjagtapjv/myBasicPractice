package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test10 {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.singaporeair.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[contains(@class,'tab-title-content router-link-exact-active router-link-active')]")).click();
		Thread.sleep(3000);
		List<WebElement>radios=driver.findElements(By.xpath("//input[contains(@id,'bookFlights')]"));
		String ExpectedResult = "Book flights";
		int l= radios.size();
		for(int i = 0;i>l;i++)
		{
			if(radios.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				radios.get(i).click();
				System.out.println(ExpectedResult + "clicked");
				break;
				
			}
		}
		
		
	}

}
