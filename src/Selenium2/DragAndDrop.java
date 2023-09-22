package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DragAndDrop {
	public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver =new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	driver.get("https://www.amazon.in/");
	driver.findElement(By.xpath("//span[@class='nav-line-2 ']")).click();
	driver.findElement(By.xpath("//a[@id='createAccountSubmit']")).click();
	
	
	

}
}

