package Aug15th;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_For_All {
	public static WebDriver driver;
	public ExtentReport report;
	//
	
	
	
	@BeforeClass
	public void setup() {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
	
		driver=new ChromeDriver();//this is the upcasting
			//driver.manage().window().maximize();//this is the example of method chaining
			//whenever we have non static member we to create a object in this way we have to 
			/*
			 * to create multiple objects to avoid this we can execute constructor of that 
			 * particular class
			 * IMP: instead of creating object we can use constructor that is called method 
			 * Chaining
			 * when we using wait also that time we used method chaining 
			 */
			driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
	}
	
	@AfterClass
	public void teardown()
	{
		//driver.close();
	}

}
