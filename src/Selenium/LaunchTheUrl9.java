package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchTheUrl9 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		try {
		int i=5/0;
		}
		catch(ArithmeticException a)
		{
			
		}
System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
WebDriver driver = new ChromeDriver();
driver.get("https://www.facebook.com/");
Thread.sleep(3000);
driver.navigate().to("https://www.google.co.in/");
// refresh the page
driver.navigate().refresh();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
driver.navigate().forward();
Thread.sleep(3000);
driver.navigate().back();
Thread.sleep(3000);
// get current Url
String url = driver.getCurrentUrl();
System.out.println(url);
// get webpage
Thread.sleep(3000);
System.out.println(driver.getTitle());
// close current browser
Thread.sleep(3000);
driver.close();
Thread.sleep(3000);
driver.quit();



	}

}
