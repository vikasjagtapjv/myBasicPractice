package June212023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IframeByRediff {
	public static void main(String[]args) throws Throwable
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("http://www.rediff.com/");
		Thread.sleep(3000);
		driver.switchTo().frame("moneyiframe");
		
		String element=driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
		
		System.out.println("Clicked on WebElement :"+element);
		driver.quit();
	}

}
