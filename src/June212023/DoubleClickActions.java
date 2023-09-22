package June212023;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickActions {
	public static void main(String []args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.tutorialspoint.com/questions/index.php");
		
		WebElement doubleclick=driver.findElement(By.xpath("//a[contains(@class,'btn btn-grey-border mb-0')]"));
		
		Actions act=new Actions(driver);
		act.doubleClick(doubleclick).build().perform();
	}

}
