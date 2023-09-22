package June212023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main (String []args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://eudyogaadhaar.org/");
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,800)");
		WebElement element=driver.findElement(By.xpath("//select[@name='social_category']"));
		System.out.println(element.getSize());
		Select sec=new Select(element);
		sec.selectByVisibleText("SC");
		
		
		WebElement element01=driver.findElement(By.xpath("//select[@id='office-state']"));
		Select sec01=new Select(element01);
		sec01.selectByValue("Assam");
		sec01.selectByIndex(5);
		
		
		List<WebElement> ListOfWebElements=sec.getOptions();
		System.out.println("List of the Elements are : "+ListOfWebElements.size());
		for(WebElement el:ListOfWebElements)
		{
			Thread.sleep(3000);
			System.out.println(el.getText());
		}
		
		//Thread.sleep(5000);
		 List <WebElement>ListOfWebElements01=sec.getOptions();
		 System.out.println("List of Elements are :"+ListOfWebElements01.size());
		 for(int i=0;i<ListOfWebElements01.size();i++)
		 {
			 if(ListOfWebElements01.get(i).getText().equalsIgnoreCase("OBC"))
			 {
				 ListOfWebElements01.get(i).click();
			 }
		 }
		driver.close();
		
	}

}
