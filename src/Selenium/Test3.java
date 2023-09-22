package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test3 {
	public static void main(String[]args) throws Exception
	{
		/*System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		//contains method by finding xpath
		driver.findElement(By.xpath("//input[contains(@placeholder,'Ema')]")).sendKeys("vikas");
		driver.findElement(By.xpath("//h2[contains(text(),'f')]"));//text method
		*/
		System.setProperty("webdriver.chrome.driiver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		driver.navigate().to("https://www.google.co.in/");
		driver.navigate().back();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("9527069986");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("j@gtap2");
		driver.findElement(By.xpath("//button[@id='u_0_d_Hx']")).click();
		Thread.sleep(3000);
		//driver.navigate().to("https://www.flipkart.com/");
		driver.findElement(By.xpath("//span[contains(@class,'a8c37x1j')]")).sendKeys("shooes");
		
	}

}
