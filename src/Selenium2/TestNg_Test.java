package Selenium2;

import static org.testng.Assert.*;

import java.util.Random;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class TestNg_Test {
	 WebDriver driver;
	@Test
	public void test1() {
	//WebDriverManager.chromedriver().setup();
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
driver =new ChromeDriver();
driver.manage().window().maximize();
driver.manage().deleteAllCookies();
driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
driver.navigate().to("https://opensource-demo.orangehrmlive.com/");
driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
driver.findElement(By.xpath("//button[@type='submit']")).click();
driver.findElement(By.xpath("//span[text()='My Info']")).click();
driver.close();

	
	}
	@Test(priority=0)
	public void testGoogle() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.navigate().to("https://www.google.com/"); 
		driver.findElement(By.name("q")).sendKeys("HYR TUTORIALS",Keys.ENTER);
		//String s=driver.getTitle();
		//System.out.println(s);
		String expectedTitle="HYR TUTORIALS - Google Search";
		String actualTitle=driver.getTitle();
		assertEquals(actualTitle,expectedTitle,"Title is Matched");
		assertTrue(true);
		
		Thread.sleep(5000);
		driver.close();
		
	}
	@Test
    public void testFacebook() throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
	    driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.navigate().to("https://www.Facebook.com/"); 
		driver.findElement(By.name("email")).sendKeys("HYR TUTORIALS",Keys.ENTER);
		
		//System.out.println(s);
		Thread.sleep(5000);
		driver.close();
	}
	@Test
	public void fibonacci () {
		int a=0;
		int b=1;
		int c;
		System.out.print(a+" "+b);
		for(int i=1;i<=8;i++)
		{
			c=a+b;
			System.out.print(" "+c);
			a=b;
			b=c;
		}
		
	}
	@Test
	public void amazon() throws Exception {
		//driver=rdriver;
		//PageFactory.initElements(rdriver,this);
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40,TimeUnit.SECONDS);
		driver.get("https://www.amazon.com/");
		//driver.findElement(By.xpath(""))
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("document.getElementById('twotabsearchtextbox').value='mobile'");
		Thread.sleep(5000);
	    WebElement click=driver.findElement(By.xpath("//*[@id='nav-search-submit-button']"));
	    jre.executeScript("arguments[0].click();",click);
	    driver.close();
		
		
	}
	//Assertion is nothing but to validating the Actual outcome with Expected outcome
	// Assertion is tell you test is actually passed or failed 	
	//for comparision we used Assert.assertEquals method
	
	@Test(priority=1)
	public void randomNum() {
		//By using Math.random method we are generating the random number
		double a;
		a=Math.random()*300;
		System.out.println(a);
		System.out.println("___________________________________");
		
		//By using Random class we are also generating the random number
		Random random=new Random();
		int r=random.nextInt();
		float f=random.nextFloat();
		long l=random.nextLong();
		double d=random.nextDouble();
		System.out.println(" "+r+" "+f+" "+l+" "+d);
		System.out.println("______________________________________");
		// By using for loop we print the random number
		for(int i=1;i<=32;i++) {
			System.out.println((int)(Math.random()*100));
		}
		
	}

}
