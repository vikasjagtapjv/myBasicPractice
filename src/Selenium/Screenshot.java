package Selenium;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;

public class Screenshot {
WebDriver driver;
public void capturescreenshot(ITestResult result) throws IOException {
	if((ITestResult.FAILURE)==result.getStatus())
			{
		TakesScreenshot ts=(TakesScreenshot)driver;
		File src=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src,new File("./ScreenShot12/"+ result.getName() +".png"));
		System.out.println("method() screenshot Captured"+ result.getName());
			}
	
}
}
