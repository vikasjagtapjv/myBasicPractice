package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheUrl8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https:/www.facebook.com//");
	}

}
