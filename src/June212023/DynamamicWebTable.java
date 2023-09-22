package June212023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DynamamicWebTable {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://money.rediff.com/gainers");
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,200)");
		
		List<WebElement> Elements=driver.findElements(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		double count=Elements.size();
		System.out.println("List of WebElements are :"+count);
		
		for(WebElement List:Elements)
		{
			if(List.getText().contains("Olatech Solutions"))
			{
				List.click();
				break;//Is used to terminate the loop immediately
			}
		}
		
	}

}
