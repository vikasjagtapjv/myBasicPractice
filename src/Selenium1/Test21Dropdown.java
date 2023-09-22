package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test21Dropdown {
	public static void main(String[]args) throws Exception {   
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
		WebElement drp=driver.findElement(By.xpath("//select[@id='month']"));
		Thread.sleep(3000);
		
		Select sc= new Select(drp);
		sc.selectByVisibleText("Mar");
		Thread.sleep(3000);
		sc.selectByIndex(5);
		Thread.sleep(3000);
		sc.selectByValue("9");
		System.out.println(sc.getFirstSelectedOption().getText());
		
		
	}
}

