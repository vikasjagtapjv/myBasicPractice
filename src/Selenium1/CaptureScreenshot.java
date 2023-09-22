package Selenium1;


import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;



public class CaptureScreenshot {
	static WebDriver driver;
	public static void main(String[]args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.facebook.com/");
		
		//Take screenshot and store it as file format
				TakesScreenshot fe =((TakesScreenshot)driver);
				File file=fe.getScreenshotAs(OutputType.FILE);
				
				//copy the screenshot desired location
				File sre=new File("E:\\Screenshot\\First1.png");
				
				FileHandler.copy(file,sre);
				
				
	}
	
		
		
	

}
