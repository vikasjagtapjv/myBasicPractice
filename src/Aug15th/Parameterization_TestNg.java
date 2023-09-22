package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterization_TestNg {
	WebDriver driver;
	@Parameters("browserName")
	@BeforeTest
	public void setup(String browserName)
	{
		switch (browserName.toLowerCase()) {
		
		case "chrome":
			System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
		 driver=new ChromeDriver();
			
			break;
		
			
		case "firefox":
			System.setProperty("webdriver.gecko.driver","F:\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
			 driver=new FirefoxDriver();
			
			break;

		default:
			System.err.println("Browser is invalid");
			break;
		}
		
		driver.manage().window().maximize();
		
				
	}
	@Parameters("url")
	@Test
	public void launchApp(String url)
	{
		driver.get(url);

	
	
		WebElement element=driver.findElement(By.xpath("//input[@name='username']"));
		element.sendKeys("Admin");
		WebElement element01=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		element01.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@Test
	public void navigateToMyInfo()
	{
		WebElement element=driver.findElement(By.xpath("//span[text()='My Info']"));
		element.click();
	}
	@Test
	public void verifyName()
	{
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
		
		System.out.println(element.isDisplayed());
		String str=element.getText();
		System.out.println(str);
	}

}
