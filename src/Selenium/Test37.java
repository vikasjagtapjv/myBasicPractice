package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test37 {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		Thread.sleep(3000);
		/*List<WebElement>radio=driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
		System.out.println("Size of radio btn:"+radio.size());
		System.out.println(radio.get(0).isDisplayed());
	    System.out.println(radio.get(2).isEnabled());
	    System.out.println(radio.get(1).isSelected());
	    radio.get(2).click();
	    Thread.sleep(3000);
	    List<WebElement>rad=driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));
	    //System.out.println("Size of rad btn"+rad.size());
	    String ExpectedResult="female";
	    
	    for(int i=0;i<rad.size();i++)
	    {
	    	if(rad.get(i).getText().equalsIgnoreCase(ExpectedResult))
             {
	          rad.get(i).click();
	          System.out.println(ExpectedResult  + "Clicked");
	          break;
	
             }
	    }
		WebElement drp=driver.findElement(By.xpath("//select[contains(@id,'day')]"));
		//System.out.println("Size of dropdown:"+drp.size());
		Select sc= new Select(drp);
		sc.selectByVisibleText("2");
		Thread.sleep(3000);
		sc.selectByIndex(4);
		Thread.sleep(3000);
		sc.selectByValue("15");
		
		Thread.sleep(3000);
		List<WebElement>drop=sc.getOptions();
		System.out.println("Size of Dropdown:"+drop.size());
		for(int i=0;i<drop.size();i++)
		{
			if(drop.get(i).getText().equalsIgnoreCase("25"))
			{
				drop.get(i).click();
				System.out.println("Clicked on ......");
			}
		}*/
		
		
		 //To  handle auto suggestion
		
		Thread.sleep(3000);
	
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().refresh();
		driver.findElement(By.xpath("//input[contains(@name,'q')]")).sendKeys("how stuff work");
		
		Thread.sleep(3000);
		List<WebElement>Auto=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
	
		System.out.println("Size of auto:"+Auto.size());
		Thread.sleep(3000);
		
		String ExpectedResult="how stuff works podcast";
		
		for(int i=0;i<Auto.size();i++)
		{
			if(Auto.get(i).getText().equalsIgnoreCase(ExpectedResult))
				
				Auto.get(i).click();
			
			System.out.println(ExpectedResult + "clicked");
			break;
		}
		

		
	}

}
