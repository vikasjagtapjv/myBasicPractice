package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test19 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		Thread.sleep(3000);
		
		
		List<WebElement>radios =driver.findElements(By.xpath("//input[@type='radio']"));
		System.out.println("size of radios:"+radios.size());
		System.out.println(radios.get(0).isSelected());
		System.out.println(radios.get(2).isDisplayed());
		System.out.println(radios.get(1).isEnabled());
		
		Thread.sleep(3000);
		radios.get(2).click();
		
		Thread.sleep(3000);
		List<WebElement>radios1=driver.findElements(By.xpath("//label[contains(@class,'mt')]"));
		
		//System.out.println("size:"+radios1.size());
		
		String ExpectedResult ="female";
		for(int i=0;i<=radios1.size();i++)
		{
			if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				radios1.get(i).click();
				System.out.println( ExpectedResult+ "clicked ");
				break;
			}
			
		}
		Thread.sleep(3000);

		WebElement drp = driver.findElement(By.xpath("//select[@id='month']"));
		
		Select se=new Select(drp);
		
		se.selectByVisibleText("Mar");
		Thread.sleep(3000);
		se.selectByValue("7");
		Thread.sleep(3000);
		se.selectByIndex(11);
		Thread.sleep(3000);
		
		List<WebElement>eb=se.getOptions();
		System.out.println("size:"+eb.size());
		for(int i =0;i<=eb.size();i++)
		{
			String re=eb.get(i).getText();
			if(re.equalsIgnoreCase("Mar"))
			
			{
				eb.get(i).click();
			}
			
			
		}
		
	}
		
		
		
		

		
		
	}


