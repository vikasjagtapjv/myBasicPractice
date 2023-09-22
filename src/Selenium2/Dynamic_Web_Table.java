package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dynamic_Web_Table {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://money.rediff.com/gainers");
		List<WebElement>webtable=driver.findElements
				(By.xpath("//table[@class='dataTable']/tbody/tr/td"));
		System.out.println("List of Elemnts present in Table:"+ webtable.size());
		// Now we are using For each loop 
		for(WebElement list:webtable)
		{
			if(list.getText().contains("Roopshri Resorts"))
			{
				list.click();
				break;
			}
		}
		
		
		
		
	}

}
