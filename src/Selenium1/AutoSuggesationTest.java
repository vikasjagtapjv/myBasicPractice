package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AutoSuggesationTest {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
		Thread.sleep(3000);
		
		 WebElement eb=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		 eb.sendKeys("keypad");
		 Thread.sleep(3000);
		 
		 List<WebElement>Auto=driver.findElements(By.xpath("//div[@class='s-suggestion-container']"));
		 System.out.println("Total auto suggesations :" + Auto.size());
		 
		 Thread.sleep(2000);
		 
		 String ExpectedResult="keypad 4g mobile phone";
		 for(int i=0;i<Auto.size();i++)
		 {
			 if(Auto.get(i).getText().equalsIgnoreCase(ExpectedResult))
			 {
				 Auto.get(i).click();
				 System.out.println("clicked");
				 break;
			 }
		 }
	
	}

}
