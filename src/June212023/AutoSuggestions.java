package June212023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestions {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		driver.findElement(By.xpath("//textarea[@name='q']")).sendKeys("Pune");
		
		List<WebElement>Elements=driver.findElements(By.xpath("//ul[@role=\"listbox\"]//li"));
		//System.out.println("Total number of Elements :"+Elements.size());
		int count=Elements.size();
		System.out.println(count);
		Elements.get(count-4).click();
		
		
	}
	

}
