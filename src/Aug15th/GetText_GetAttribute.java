package Aug15th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GetText_GetAttribute {
@Test
public void test()
{
	System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://admin-demo.nopcommerce.com/login/");
	WebElement element=driver.findElement(By.xpath("//input[@id='Email']"));
	System.out.println( element.getAttribute("value"));
	element.clear();
	element.sendKeys("admin@yourstore.com");
	WebElement element1=driver.findElement(By.xpath("//input[@id='Password']"));
	element1.clear();
	element1.sendKeys("admin");
	WebElement elw=driver.findElement(By.xpath("//button[@class='button-1 login-button']"));
	String s=elw.getText();
	System.out.println(s);
	elw.click();
	
}
}