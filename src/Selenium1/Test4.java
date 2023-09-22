package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test4 {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
		List<WebElement> list=driver.findElements(By.xpath("//input[@type='text']"));
		System.out.println(list.size());
		System.out.println(list.get(2).isSelected());
		list.get(2).sendKeys("vikas");
	}

}
