package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test37Practice {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		 
		Thread.sleep(3000);
		
		List<WebElement>rad= driver.findElements(By.xpath("//label[@class='_58mt']"));
		System.out.println("size of radio btn"+rad.size());
		System.out.println(rad.get(1).isEnabled());
		rad.get(1).click();
		Thread.sleep(3000);
		List<WebElement>radio=driver.findElements(By.xpath("//label[@class='_58mt']"));
		
		System.out.println("size:"+radio.size());
		Thread.sleep(3000);

		String ExpectedResult="custom";
		
		for(int i=0;i<radio.size();i++)
	    {
	    	if(radio.get(i).getText().equalsIgnoreCase(ExpectedResult))
             {
	          radio.get(i).click();
	          System.out.println(ExpectedResult  + "Clicked");
	          break;
	
             }
	    }
		
		//Dropdown
		
	WebElement drop=driver.findElement(By.xpath("//select[contains(@id,'month')]"));
	
	
	
	Select sc= new Select(drop);
	sc.selectByIndex(11);
	
	List<WebElement>dropd=sc.getOptions();
	
	System.out.println("size:"+dropd.size());
	Thread.sleep(3000);

	String ExpectedResult1 ="Mar";
	
	for( int i=0;i<=dropd.size();i++)
	{
		String str=dropd.get(i).getText();
		
		if(str.equalsIgnoreCase(ExpectedResult1))
		{
			dropd.get(i).click();
			break;
		}
	}
	
	
	

	
		
		
		
		
		
		
	}

}
