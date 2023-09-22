package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test36 {
	public static void main(String[]args)
	{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.manage().deleteAllCookies();
	driver.get("https://money.rediff.com/gainers");
	
	List<WebElement>lis=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[3]"));
	System.out.println("element"+lis.size());
	
	String ExpectedResult = "S M Gold";
	for(int i= 0;i<lis.size();i++)
	{
		if(lis.get(i).getText().equalsIgnoreCase(ExpectedResult))
		{
			System.out.println("clicked"+lis.get(i).getText());
			lis.get(i).click();
			break;
		
			
		}
	}
	
	
	
	}

}
