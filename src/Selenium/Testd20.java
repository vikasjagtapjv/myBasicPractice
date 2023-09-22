package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Testd20 {
	public static void main(String[]args) throws Exception {
		
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//a[contains(@id,'nav-link-accountList')]")).click();
	//	Thread.sleep(3000);
		//driver.findElement(By.xpath("//select[@id='searchDropdownBox')]")).click();
		
		//Thread.sleep(3000);
		//List<WebElement>drp=driver.findElements(By.xpath("//select[@id='searchDropdownBox']/option"));
		//System.out.println("size:"+drp.size());
		//drp.get(8).click();
		
		WebElement drp = driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		Select se = new Select(drp);
		
	
		/*	List<WebElement> drop=se.getOptions();
	 
		
		System.out.println("size"+ drop.size());
		
		for(int i =0;i<=drop.size();i++)
		{
			String str = drop.get(i).getText();
			if(str.equalsIgnoreCase("Books"))
			{
				drop.get(i).click();
			}
			
		
		}
		*/
	 	se.selectByVisibleText("Books");
	 	
	}
}


