package June212023;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HandleMultipleWindows {
	WebDriver driver;
	@BeforeMethod
	public void setUp()throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
	}
	@Test(priority=0)
	public void test01()throws InterruptedException
	{
		String ExpectedTitle="OrangeHRM";
		String ActualTitle=driver.getTitle();
		Assert.assertEquals(ExpectedTitle,ActualTitle,"Title Verified");
		String Id=driver.getWindowHandle();
		System.out.println("Id of the Login Page is :"+Id);
		
		
	}
	@Test(priority=1)
	public void test02()throws InterruptedException
	{
		
		
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("admin123");
		//driver.findElement(By.xpath("//button[@type='submit']")).click();
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		Set<String>Ids=driver.getWindowHandles();
		/*
		 * We can capture Id by using iterator
		 * 
		 */
		Iterator<String>it=Ids.iterator();
		/*
		 * from Ids i am using iterator method which will return 
		 * iterator object of String.
		 * it.next();
		 * Which will give you first window id that store in string variable called as parent Id;
		 */
		String parentId=it.next();
		System.out.println("Parent Window Id is :"+parentId);
		String childId=it.next();
		System.out.println("Child window id is :"+childId);
		
		driver.switchTo().window(parentId);
		System.out.println("Title of parent Window is :"+driver.getTitle());
		driver.switchTo().window(childId);
		System.out.println("Title of child Window is :"+driver.getTitle());
		
			
	}
	@Test(priority=2)
	public void test03()throws InterruptedException
	{
		
	}
	@AfterMethod
	public void tearDown()throws InterruptedException
	{
		//driver.close();
	}
	
	
	

}
