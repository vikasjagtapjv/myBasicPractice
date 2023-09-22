package June212023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicWEBTable {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.moneycontrol.com/stocksmarketsindia/");
		
		driver.findElement(By.xpath("//button[text()='No thanks']")).click();
		JavascriptExecutor jre= (JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,800)");
		
		List<WebElement>Elements=driver.findElements(By.xpath("//div[@class='marketatc_actcont']//table[@class='mctable1']/tbody/tr/td"));
		double listOfElements=Elements.size();
		System.out.println("List of WebElements are :"+listOfElements);
		for(WebElement List:Elements)
		{
			if(List.getText().contains("S&P BSE Smallcap"))
			{
				List.click();
				break;//Is used to terminate the loop immediately
			}
			

		}
		System.out.println("Clicked on S&P BSE Smallcap");
		driver.quit();
		
		
	}

}
