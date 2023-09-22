package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test46iframe {
	public static void main(String[]args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/");
		
		List<WebElement>list=driver.findElements(By.xpath("//*[contains(text(),'Frames')]"));
		System.out.println("size:"+list.size());
		System.out.println(list.get(2).isSelected());
		list.get(2).click();
		driver.switchTo().frame(0);
		driver.findElement(By.xpath("//*[contains(@id,'iFrame')]")).click();
		
	}

}
