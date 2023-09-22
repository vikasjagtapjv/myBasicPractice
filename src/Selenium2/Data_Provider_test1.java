package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Data_Provider_test1 {
	@DataProvider(name="Shoping")
	
	public Object[][] searchData(){
		//Shirt pant
		//mobile back cover
		//spray perfume
		Object[][] search= new Object[3][2];
		search[0][0]="Shirt";
		search[0][1]="pant";
		
		search[1][0]="mobile";
		search[1][1]="back cover";
		
		search[2][0]="spray";
		search[2][1]="perfume";
		
		return search;
		
		
	}
	WebDriver driver;
	@Test(dataProvider="Shoping")
	public void multipleData(String one,String two) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.amazon.com");
		
		WebElement Search=driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']"));
		Search.sendKeys(one +" "+two,Keys.ENTER);
		driver.close();
		
		
	}
	

}
