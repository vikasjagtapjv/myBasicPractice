package June212023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
//		driver.findElement(By.xpath("//span[contains(@id,'nav-link-acc')]")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'Create your')] ")).click();
//		driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Vikas Jagtap");
//		WebDriverWait wt=new WebDriverWait(driver,30);
//		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@id='ap_email']"))).sendKeys("vikasjagtap8999@gmail.com");
	}

}
