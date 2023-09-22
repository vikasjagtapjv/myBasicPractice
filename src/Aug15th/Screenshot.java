package Aug15th;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

public class Screenshot extends Base_For_All{
	@Test
	public void captureScreenshot() throws IOException
	{
		driver.get("https://admin-demo.nopcommerce.com/");
		WebElement element=driver.findElement(By.cssSelector("input#Email"));
		element.clear();
		element.sendKeys("adminyour@store.com");
		WebElement element01=driver.findElement(By.cssSelector("input#Password"));
		element01.clear();
		element01.sendKeys("admin");
		driver.findElement(By.cssSelector("button[type='submit']")).click();
		//byte[]screenshot=((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File sourcefile=screenshot.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\Feb 2022\\src\\Aug15th\\ScreenshotAs\\image01.png");
		FileHandler.copy(sourcefile, destination);
		
	}

}
