package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test18OnAmazon {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
	/*
	 * 	
	
		List<WebElement>rad =driver.findElements(By.xpath("//*[@class='a-list-item']"));
		System.out.println(rad.size());
		System.out.println(rad.get(55).isEnabled());
		Thread.sleep(3000);
		rad.get(90).click();https://opensource-demo.orangehrmlive.com/
		http://live.demoguru99.com/
		 */
	}

}
 