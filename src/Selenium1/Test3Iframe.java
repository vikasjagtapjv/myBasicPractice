   package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3Iframe {
	public static void main (String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='iFrame']")).click();
		
		int allframe =driver.findElements(By.xpath("//*[@id='portfolio_items']")).size();
		System.out.println(allframe);
		
		
		for(int i=0;i<allframe;i++)
		{
			driver.switchTo().frame(i);
			
			
			
		}
		
		
		

}
}
