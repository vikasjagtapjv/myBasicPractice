package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class TestDrop {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		
		WebElement dro=driver.findElement(By.xpath("//select[@id='year']"));
		
		Select sc=new Select(dro);
		sc.selectByValue("2005");
		
	}

}
