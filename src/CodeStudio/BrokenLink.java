package CodeStudio;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		//Now we are creating the instance of WebDriver interface and cast it 
		//in different browser class through reference variable driver.through 
		//driver we can use different methods
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.deadlinkcity.com/");
		
				
	}
}
