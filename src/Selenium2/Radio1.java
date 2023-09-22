package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio1 {
	public static void main (String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>rad=driver.findElements(By.xpath("//input[@class='radioButton']"));
		System.out.println("size of radio button  "+rad.size());
		System.out.println(rad.get(1).isEnabled());
		System.out.println(rad.get(0).isDisplayed());
		System.out.println(rad.get(2).isSelected());
		Thread.sleep(3000);
		rad.get(2).click();
		driver.close();
		
	}

}
