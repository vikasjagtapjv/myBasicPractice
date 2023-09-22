package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Upload_File {
	static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://demoqa.com/upload-download");
		//we are using sendkeys where in HTML DOM file =type only.
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys("C:\\Users\\pc\\Desktop");
		
	}

}
