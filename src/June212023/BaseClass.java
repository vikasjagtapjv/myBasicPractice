package June212023;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseClass {
	public static WebDriver driver;
	@BeforeTest
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}
	public void captureScreenshot(String fileName)
	{
		TakesScreenshot takescreenshot =(TakesScreenshot)driver; 
		
		File sourceFile=takescreenshot.getScreenshotAs(OutputType.FILE);
		File destinationFile=new File("./Screenshot/"+fileName);
		try {
			FileUtils.copyFile(sourceFile, destinationFile);
			
		}catch(IOException e) {
			e.printStackTrace();
			
		}
		System.out.println("Screenshot saved sucessfully");
	}

}
