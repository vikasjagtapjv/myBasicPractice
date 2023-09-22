package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test11 {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		Thread.sleep(3000);
		List<WebElement>radios=driver.findElements(By.xpath("//input[contains(@name,'radioButton')]"));
		System.out.println("Number of Raadios button:-"+radios.size());
		System.out.println(radios.get(0).isDisplayed());
		System.out.println(radios.get(2).isEnabled());
		System.out.println(radios.get(1).isSelected());
		Thread.sleep(3000);
		radios.get(0).click();
		Thread.sleep(3000);
		System.out.println(radios.get(0).isSelected());
		
		/*Thread.sleep(3000);
		List<WebElement>radios1=driver.findElements(By.xpath("//input[contains(@class,'radioButton')]"));
		String ExpectedResult = "Radio2";
		int l = radios1.size();
		for(int i=0;i<=l;i++)
		{
			if(radios1.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				radios1.get(i).click();
				System.out.println(ExpectedResult + " Clicked");
				break;
			}
		}*/
		
		
		
	}

}
