package Aug15th;

import java.util.List;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RadioButton001 {
	public static void main (String[]args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver",
//				"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
//		
		System.setProperty("webdriver.gecko.driver"
				,"F:\\Drivers\\geckodriver-v0.33.0-win64\\geckodriver.exe");
		 WebDriver driver=new FirefoxDriver();
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
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		
//		List <WebElement> elements=driver.findElements(By.xpath("//input[@type='radio']"));
//		System.out.println(elements.size());
//		System.out.println(elements.get(0).isEnabled());
//		System.out.println(elements.get(1).isDisplayed());
//		System.out.println(elements.get(2).isSelected());
//		elements.get(2).click();
		Thread.sleep(3000);
		List<WebElement>elements1=driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"));


		String ExpectedResult="male";
		for(int i=0;i<=elements1.size();i++)
		{
			
			if(elements1.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				elements1.get(i).click();
				System.out.println( ExpectedResult+ " clicked");
				break;
			}
		}
		
	}

}
