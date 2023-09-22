package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test6 {
public static void main(String[]args) throws Exception
{
	System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@value='1']")).click();
	driver.findElement(By.xpath("//input[@value='2']")).click();
	driver.findElement(By.xpath("//input[@value='-1']")).click();
	
	Thread.sleep(3000);
	List<WebElement>radios=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("Total no of Radio buttons:-"+radios.size());
	System.out.println(radios.get(1).isEnabled());
	System.out.println(radios.get(0).isDisplayed());
	System.out.println(radios.get(2).isSelected());
	Thread.sleep(3000);
	radios.get(1).click();
	Thread.sleep(3000);
	System.out.println(radios.get(2).isSelected());
	
	
	
	List<WebElement>radios1=driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
	String ExpectedResult =  "Female";
	for(int i=0;i<radios1.size();i++)
	{
		if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{radios1.get(i).click();
	System.out.println(ExpectedResult + "clicked..");
	break;
	}

	}
	
}
}
