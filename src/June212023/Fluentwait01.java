package June212023;

import java.util.NoSuchElementException;
//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
//import org.openqa.selenium.support.ui.Wait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Fluentwait01 {
	WebDriver driver;

	//public static void main(String[]args)
	@BeforeMethod
	public void setUp()throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		
	    driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://demo.guru99.com/test/guru99home/");
	}
	@Test
	public void test()throws InterruptedException
	{
		//WebDriver driver;
		String ExpectedTitle="Demo Guru99 Page";
		String ActualTitle=" ";
		ActualTitle=driver.getTitle();
		//compare the actual title with the expected title

		if(ActualTitle.contentEquals(ExpectedTitle))
		{
			System.out.println("Test Passed ");
		}
		
		else
		{
			System.out.println("Test Failed");
		}
		FluentWait wait=new FluentWait(driver);
		wait.withTimeout(50,TimeUnit.SECONDS);
		wait.pollingEvery(5,TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(text(),'Insurance Project')]")));
/*
 * This command operates with two primary parameters: timeout value and polling frequency. 
 * The above code defines the time out value as 5 seconds and polling frequency as 0.25 seconds. 
 * It directs WebDriver to wait for no more than 5 seconds to verify a specific condition. 
 * If the condition occurs during those 5 seconds, it will execute the next step in the test script. 
 * If not, it will return “ElementNotVisibleException”.
 */
		
	}

}
