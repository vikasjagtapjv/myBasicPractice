package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown01 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
		WebElement web=driver.findElement(By.xpath("//select[@id='day']"));
		
		Select sec=new Select(web);
		sec.selectByIndex(4);
		sec.selectByValue("8");
		sec.selectByVisibleText("23");
	}

}
