package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_test1 {
	WebDriver driver;
	/*
	 * Vikas Vikas@123
	 * Viraj Viraj@123
	 * Vinita Vinita@123
	 */
	@DataProvider(name="FacebooK_Login")
	public Object[][] searchData(){
		Object[][] find=new Object[3][2];
		find[0][0]="Vikas";
		find[0][1]="Vikas@123";
		
		find[1][0]="Viraj";
		find[1][1]="Viraj@123";
		
		find[2][0]="Vinita";
		find[2][1]="Vinita@123";
		
		return find;
	}
	@Test(dataProvider="FacebooK_Login")
	public void facebookLogin(String UserName,String Password) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.Facebook.com/");
		WebElement name=driver.findElement(By.xpath("//input[@id='email']"));
		name.sendKeys(UserName);
		WebElement pass=driver.findElement(By.xpath("//input[@id='pass']"));
		pass.sendKeys(Password);
		driver.close();
	
		
		
	}
	

}
