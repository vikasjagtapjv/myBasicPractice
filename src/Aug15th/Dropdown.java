package Aug15th;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver",
			"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
	
//		System.setProperty("webdriver.gecko.driver"
//				,"F:\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
//		 WebDriver driver=new FirefoxDriver();
		/*
		 * We create an instance of the WebDriver interface and cast it to different 
           browser class using the reference variable ‘driver’. Then we can use different 
           methods of the web driver interface like get(), getTitle(), close(), etc…to write 
           automation code
		 */
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
	
		/*
		 * driver.get() is used to navigate particular URL(website) and wait till page load.
         driver.navigate() is used to navigate to particular URL and does not wait to 
         page load. It maintains browser history or cookies to navigate back or 
             forward
		 */
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration')]")).click();
		
//		WebElement element=driver.findElement(By.xpath("//select[@id='day']"));
//		
//		Select se=new Select(element);
//		
//		//se.selectByVisibleText("7");
//		//driver.wait(5);
//		se.selectByValue("3");
//		//driver.wait(5);
//		se.selectByIndex(9);
		WebElement element=driver.findElement(By.xpath("//select[@id='day']"));
		Select se=new Select(element);
		
		List<WebElement>elements=se.getOptions();
		System.out.println(elements.size());
		for( int i=0;i<=elements.size();i++)
		{
			if(elements.get(i).getText().equalsIgnoreCase("12"))
			{
				elements.get(i).click();
				System.out.println("Clicked on expected result");
				break;
			}
		}
		
	}

}
