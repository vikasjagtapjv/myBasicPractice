package Selenium2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Auto_sugesstion {
	public static void main(String[]args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[contains(@id,'twotabsearchtextbox')]")).sendKeys("galaxy");
		
		Thread.sleep(3000);
		List<WebElement>auto=driver.findElements(By.xpath("//div[contains(@class,'s-suggestion-container')]//div"));
		System.out.println("List of Elements: "+auto.size());
		
		Thread.sleep(3000);
		for(WebElement listitem:auto)
		{
			if(listitem.getText().contains("galaxy s23 plus case")) {
				Thread.sleep(3000);

				listitem.click();
				break;
			}
		}
	}

}
