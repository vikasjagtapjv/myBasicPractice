package Selenium1;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Test20Practice {
	WebDriver driver;
	
	public void capturescreenshot(ITestResult result) throws IOException
	{
		if(ITestResult.FAILURE == result.getStatus()) {
			
		
			//to create reference of TakesScreenshot interface type casting
			
			TakesScreenshot ts =(TakesScreenshot)driver;//downcasting java does not support
			//use getScreenshotAs() TO capture screenshot in file format
			//getScreenshotAs() its retrntype is file
			File source = ts.getScreenshotAs(OutputType.FILE);
			//copy file to specific location
			FileUtils.copyFile(source, new File("./Screenshot"+ result.getName() +".png"));
			System.out.println(result.getName()+ "method() screenshot captured..!!");
			
			
		}
	}
	

}
