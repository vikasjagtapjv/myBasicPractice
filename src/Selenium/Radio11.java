package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;

public class Radio11 {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>radio= driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		System.out.println("Size of the radio button  "+radio.size());
		System.out.println(radio.get(0).isSelected());
		System.out.println(radio.get(2).isDisplayed());
		System.out.println(radio.get(1).isEnabled());
		Thread.sleep(3000);
		radio.get(2).click();
		driver.quit();
		
		
		
	}

}
