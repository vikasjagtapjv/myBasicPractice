package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class NopCommerce {
	public static WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
		
	}
	@Test(dataProvider="SetData")
	public void getData(String user,String pwd,String Exp)
	{
		driver.get("https://admin-demo.nopcommerce.com/login");
		WebElement txtMail=driver.findElement(By.xpath("//input[@id='Email']"));
		txtMail.clear();
		txtMail.sendKeys(user);
		 
		WebElement txtPassword=driver.findElement(By.xpath("//input[@id='Password']"));
		txtPassword.clear();
		txtPassword.sendKeys(pwd);
		
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		String exp_Title="Dashboard / nopCommerce administration";
		String act_Title=driver.getTitle();
		if(Exp.equals("Valid"))
		{
			if(exp_Title.equals(act_Title))
			{
				driver.findElement(By.xpath("//a[text()='Logout']")).click();
				Assert.assertTrue(true);
			}
		}
		if(Exp.equals("Invalid")) {
			if(exp_Title.equals(act_Title)) {
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Assert.assertTrue(false);
			}
		}
	}
	
	@DataProvider(name="SetData")
	public Object[][] setData()
	{
		Object data[][]={ 
				{"admin@yourstore.com","admin","Valid"},
				{"admin@yourstore.com","adm","Invalid"},
				{"adm@yoursstore.com","admin","Invalid"},
				{"adm@yoursstore.com","adm","Invalid"}
				
		                };
		return data;
		
	}
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}

}
