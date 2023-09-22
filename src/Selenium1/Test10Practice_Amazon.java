package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test10Practice_Amazon {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.in/");
		
		WebElement drp=driver.findElement(By.xpath("//input[@type='text']"));
		drp.sendKeys("mobile");
		Thread.sleep(3000);
		List<WebElement>auto=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']/div"));
		System.out.println("size of auto:"+auto.size());
		String ExpectedResult ="mobile phone";
		for(int i=0;i<auto.size();i++)
		{
			if(auto.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				auto.get(i).click();
				
			}
		}
		
	}

}
