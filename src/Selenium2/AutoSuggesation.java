package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggesation {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java tutorial");
		//driver.close();
		Thread.sleep(3000);
		
		List<WebElement> auto=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		
		System.out.println("List of Elements: "+auto.size());
	//	String ExpectedResult="java tutorial pdf";
		for (WebElement listitem:auto)
		{
			Thread.sleep(3000);
			
			if(listitem.getText().contains("java tutorial pdf"))
			{
				Thread.sleep(3000);

				listitem.click();
				
				//System.out.println("pass");
				break;
			}
		} 

	}

}
