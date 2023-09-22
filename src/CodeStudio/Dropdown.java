package CodeStudio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	public static void main(String[]args)
	{
		/*
		 * Select Class is used to handle the dropdown
		 * 
		 */
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vikas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com/");
		
		//driver.findElement(By.xpath("(//span[@class='a-button-text'])[1]")).click();
		WebElement element=driver.findElement(By.xpath("//select[@id='searchDropdownBox']"));
		element.click();
		System.out.println(element.getSize()) ;
		
		Select select=new Select(element);
		select.selectByVisibleText("Amazon Warehouse");
		
	}

}
