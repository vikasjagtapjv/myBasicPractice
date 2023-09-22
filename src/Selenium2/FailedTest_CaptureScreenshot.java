package Selenium2;

import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.concurrent.TimeUnit;
import java.util.logging.FileHandler;

import org.openqa.selenium.TakesScreenshot;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FailedTest_CaptureScreenshot {
	public WebDriver driver;
	@BeforeMethod
	public void setUp() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	@Test(dataProvider="getData")
	public void loginWithValidCredentials(String user,String pwd,String Exp) throws IOException
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement txtuser=driver.findElement(By.xpath("//input[@id='Email']"));
		txtuser.clear();
		txtuser.sendKeys(user);
		WebElement txtpwd=driver.findElement(By.xpath("//input[@id='Password']")); 
		txtpwd.clear();
		txtpwd.sendKeys(pwd);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String exp_title="Dashboard / nopCommerce administration";
		String act_title=driver.getTitle();
		if(Exp=="Valid")
		{
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(true);	
				
				}
			
			
		}
		if(Exp=="Invalid") {
			if(exp_title.equals(act_title))
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(false);
			}
		}
		
		TakesScreenshot screenshot=((TakesScreenshot)driver);
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		File dest= new File("E:\\Feb 2022\\Screenshot\\"+timeStamp()+".png");
		
		FileUtils.copyFile(src, dest);
		
		
		
		
	}
	
	
	@DataProvider(name="getData")
	public Object[][] setData()
	{
		Object [][] data= {{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","adm","Invalid"},
				{"adm@yoursstore.com","admin","Invalid"},
				{"adm@yoursstore.com","adm","Invalid"}
				
		};
		return data;
	}
	public String timeStamp() {
		Date date=new Date();
		System.out.println(date);
		return date.toString().replace(" ", " ").replace(":","_");
	}
	@AfterMethod
	public void tearDown() {
		driver.close();
	}
	
	

}
