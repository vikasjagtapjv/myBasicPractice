package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13practicePavan {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	    driver.manage().deleteAllCookies();
	    driver.get("https://opensource-demo.orangehrmlive.com/");
	    driver.findElement(By.xpath("//input[@id='txtUsername']")).sendKeys("Admin ");
	    driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    driver.findElement(By.xpath("//span[text()='Assign Leave']")).click();
	    List<WebElement>lis=driver.findElements(By.xpath("//input[@type='text']"));
	    System.out.println("Size of element" +lis.size());
	    lis.get(0).sendKeys("Viraj");
	    lis.get(1).clear();
	    Thread.sleep(3000);
	    lis.get(1).sendKeys("2022-07-02");
	    lis.get(2).clear();
	    Thread.sleep(3000);       
	    lis.get(2).sendKeys("2022-07-05");
	    
		
		
	}

}
