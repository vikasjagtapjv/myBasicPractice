package sep23;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon_Demo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}

}
