package Aug15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Dropdown_ {
	@Test
	public void testCountry()
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://www.opencart.com/");
		//driver.findElement(By.xpath("(//a[text()='Register'])[2]")).click();
		driver.findElement(By.xpath("//a[text()='Resources ']")).click();
		List<WebElement>ele=driver.findElements(By.xpath("//ul[@class='dropdown-menu']//li"));
		System.out.println(ele.size());
		
		for(WebElement e:ele)
		{
			
				
				String s1=e.getText();
				System.out.println(s1);
				if(s1.equals("OPENCART PARTNERS"))
				{
					e.click();
					break;
				}
			
		}
		
	}
}
