package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class Test20Radio {
	public static void main(String[]args) throws Exception
	{
		//System.setProperty("webdriver.gecko.driver","F:\\geckodriver-v0.31.0-win32\\geckodriver.exe");
		//WebDriver driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		Thread.sleep(3000);
		//driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Admin");
		//driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");
	   driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']")).click();
	   List<WebElement>radio=driver.findElements(By.xpath("//input[@class='_8esa']"));
	   System.out.println("size of radio Buttons"+radio.size());
	   System.out.println(radio.get(0).isSelected());
	   System.out.println(radio.get(2).isDisplayed());
	   System.out.println(radio.get(1).isEnabled());
	   radio.get(0).click();
	   
	  Thread.sleep(3000);
	  List<WebElement>radio1=driver.findElements(By.xpath("//label[@class='_58mt']"));
	  System.out.println("size of radio "+radio1.size());
	  Thread.sleep(3000);
	  String ExpectedResult="Male";
	  for( int i=0;i<radio1.size();i++)
	  {
		  if(radio1.get(i).getText().equalsIgnoreCase(ExpectedResult))
		  {
			  radio1.get(i).click();
			  System.out.println(ExpectedResult);
			  break;
		  }
	  }
	}

}
