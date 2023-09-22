package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheUrl13 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		/*driver.navigate().to("https://www.google.co.in/");
		Thread.sleep(2999);
		driver.navigate().refresh();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		String url = driver.getCurrentUrl();
		System.out.println(url);
		Thread.sleep(3000);
		System.out.println(driver.getTitle());
		Thread.sleep(2000);
		driver.close();
		Thread.sleep(3000);
		driver.quit();
		*/
		driver.findElement(By.xpath("//input[@id=\"email\"]")).sendKeys("jagtapviky@gmail.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id=\"pass\"]")).sendKeys("12345678");
		
		

	}

}
