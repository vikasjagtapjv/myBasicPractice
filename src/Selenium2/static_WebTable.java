package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class static_WebTable {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.moneycontrol.com/stocks/marketstats/nsegainer/index.php?index=FNO");
		driver.findElements(By.xpath("//table[@cellpadding=\"0\"]//tr")).size();
		System.out.println("total Number of columns in a table:");
		
	}

}
