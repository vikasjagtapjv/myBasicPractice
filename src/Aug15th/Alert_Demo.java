package Aug15th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Alert_Demo extends Base_For_All {
	//@Test
	public void test0()
	{try {
		driver.get("https://demoqa.com/alerts");
		WebElement element=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		element.click();
		
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert=driver.switchTo().alert();
		alert.accept();
		System.out.println("unexpected alert handled");
	}
	catch(Exception e)
	{
		System.out.println("Unexpected alert not present");
	}
	driver.close();
		
	}
	
	//@Test(priority=1)
	public  void test01() {
		//js alert :comes under releted to the browser/application
		//we canot inspet anything here
		//we cannot inspect the alert window
		//webdriver can handle only application not the browser stuff
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsAlert()']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	//@Test(priority=2)
	public void test2() {
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
		Alert alert =driver.switchTo().alert();
		//alert.accept();

		alert.dismiss();
		
		
	}
	//@Test(priority=3)
	public void test3()
	{
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
		Alert alert =driver.switchTo().alert();
		System.out.println(alert.getText());

		alert.sendKeys("Alert accepted");
		alert.accept();
		
	}
	
	//Authentication popup
	//@Test(priority=4)
	public void test4()
	{
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		//how to handle authenticate popup
		//https://username:password@URl
		//https://admin:admin@the-internet.herokuapp.com/basic_auth
	}
	
	//permission popup
	@Test(priority=5)
	public void test5()
	{
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notificaions");
		System.setProperty("webdriver.chrome.driver"
				,"F:\\\\Drivers\\\\chromedriver-win32\\\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(options);
		
		//permission popup
		driver.get("https://www.redbus.in/");
		
	}
	
	

}
