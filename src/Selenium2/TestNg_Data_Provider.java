package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestNg_Data_Provider {
	
	
	//india Qutub minar
//	Agra Tajmahal
//	Hyderabad Charminar
	
	@DataProvider(name="seachDataSet")
	public Object[][] searchData(){
		Object[][] searchKeyword=new Object[3][2];
		searchKeyword[0][0]="india";
		searchKeyword[0][1]="Qutub minar";
		
		searchKeyword[1][0]="Agra";
		searchKeyword[1][1]="Tajmahal";
		
		searchKeyword[2][0]="Hyderabad";
		searchKeyword[2][1]="Charminar";
		
		return searchKeyword;
		
	}
	
	
	
	
	
	WebDriver driver;
	@Test(dataProvider="seachDataSet")
	public void data_Provider(String country,String monument) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.google.com");
		
		WebElement Search=driver.findElement(By.xpath("//input[@name='q']"));
		Search.sendKeys(country +" "+monument);
		
	}
	

}
