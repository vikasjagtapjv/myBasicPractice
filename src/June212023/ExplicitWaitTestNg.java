package June212023;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTestNg {
	WebDriver driver;
	@BeforeMethod
	public void setUp()throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Vikas\\Downloads\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com/");
	}
	@Test
	public void test()throws InterruptedException
	{
		// saving the GUI element reference into a "element" variable of WebElement type
		WebDriverWait wt=new WebDriverWait(driver,50);
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[contains(@id,'identifierId')]"))).sendKeys("vikasjagtap8999@gmail.com");
		wt.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()='Next']"))).click();
	
	//	driver.findElement(By.xpath("//a[contains(@aria-label,'Try again')]")).click();
		// entering password
		//driver.findElement(By.xpath(""))
		
		
		
		
	}
}
