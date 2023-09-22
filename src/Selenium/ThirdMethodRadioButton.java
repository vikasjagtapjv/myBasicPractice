package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ThirdMethodRadioButton {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		List<WebElement>radio=driver.findElements(By.xpath("//input[@name='radioButton']"));
		Thread.sleep(3000);
		System.out.println("List of Radio buttons  "+radio.size());
		Thread.sleep(3000);

		
	
		/*
		 * for(int i=0;i<radio.size();i++) {
		
			String ExpectedResult ="Radio2";
			//int l=radio.size();
			Thread.sleep(3000);
			
			if (radio.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				Thread.sleep(3000);
				radio.get(i).click();
				
				System.out.println(ExpectedResult);
				
				break;
			}
		}
		 */
		for(WebElement radi:radio) {
		System.out.println(radi.getText());
		if(radi.getText().equalsIgnoreCase("Radio1"));
		radi.click();
		}
		
		
		
	}
	

}
