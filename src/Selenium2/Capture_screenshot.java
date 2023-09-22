package Selenium2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Capture_screenshot {
	public static void main(String []args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.facebook.com/");
		TakesScreenshot sc=((TakesScreenshot)driver);
		File file =sc.getScreenshotAs(OutputType.FILE);
		File src=new File("E:\\Screenshot\\vikas1.png");
		FileHandler.copy(file, src);
		driver.close();
		
	}

}
