package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice40javascript {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(3000);
		
		JavascriptExecutor jre= (JavascriptExecutor) driver;
		jre.executeScript("document.getElementById('email').value='viky'");
		jre.executeScript("document.getElementById('pass').value='123456987'");
		Thread.sleep(3000);
		jre.executeScript("window.scrollBy(0,350)");
		Thread.sleep(3000);

		jre.executeScript("window.scrollBy(0,-400)");
		/*
		 * it is a very populer client side scripting lang.

#.. it is mainly used for enhancing the interaction of a user with webpage.

#.. we can make webpage more intractive with the help of JavaScript.

#.. Implimentation of javascript in selenium :--

#.. to execute javascript in our selenium script, we do not have to write seperate code..
    but we have one predefined Interface available i.e, "JavascriptExecutor".

#.. JavascriptExecuter is an a interface which is available in  org.openqa.selenium package.

#.. inside the interface we have one one predefined method called as executeScript().

#.. so whatever script will pass as a string it will be executed by "JavaScriptExecutor".  

		 */


		
	}

}
