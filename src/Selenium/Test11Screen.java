package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Test11Screen {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		//System.setProperty("WebDriver.chrome.driver","E:\\Feb 2022\\Drivers\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//Take screenshot and store it as file format
		TakesScreenshot sr=((TakesScreenshot)driver);
		File file=sr.getScreenshotAs(OutputType.FILE);
		//copy file to specific location
		File sre=new File("E:\\Screenshot\\.png");
				FileHandler.copy(file,sre);
		
		
		
	}

}
