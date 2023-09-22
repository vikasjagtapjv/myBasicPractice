package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test22 {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS );
		 driver.navigate().to("https://www.google.co.in/");
		 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("how stuff works");
		 
		 //To  handle auto suggestion
		 List<WebElement>lis=driver.findElements(By.xpath("//ul[@role='listbox']/li"));
		 System.out.println("auto suggestion list:"+lis.size());
		
		 for(int i=0;i<lis.size();i++) 
		 {
			 
			 
			 String ExpectedResult = " how stuff works video";
			 
			 if( lis.get(i).getText().equalsIgnoreCase(ExpectedResult));
			 {
				 
			 lis.get(i).click();
			 
			 System.out.println(ExpectedResult +  "clicked"  );
			 
			 break;
			 }
		 }
		
	}

}
