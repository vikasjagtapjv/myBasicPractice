package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test35 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		
		List<WebElement>siz=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[1]/a"));
		System.out.println("size"+siz.size());
		
		List<WebElement>per=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td[5]"));
		System.out.println("percentage"+per.size());
		
		String ExpectedResult ="Yug Decor";
		for(int i=0;i<=siz.size();i++)
			
			if(siz.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				System.out.println(siz.get(i).getText()+"========"+per.get(i).getText());
				siz.get(i).click();
				break;
			}
		
	}

}
