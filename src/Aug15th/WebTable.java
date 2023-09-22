package Aug15th;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebTable extends Base_For_All{
	@Test
	public void testTableElement() throws IOException
	{
		driver.get("https://admin-demo.nopcommerce.com/");
		WebElement element=driver.findElement(By.xpath("//input[@id='Email']"));
		element.clear();
		element.sendKeys("admin@yourstore.com");
		WebElement element01=driver.findElement(By.xpath("//input[@id='Password']"));
		element01.clear();
		element01.sendKeys("admin");
		driver.findElement(By.xpath("//button[text()='Log in']")).click();
		
		WebElement element02=driver.findElement(By.xpath("//i[@class='nav-icon far fa-user']"));
		
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element02));
		element02.click();
		driver.findElement(By.xpath("(//a[@href='/Admin/Customer/List'])[1]")).click();
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		WebElement element03=driver.findElement(By.xpath("(//table[contains(@class,'table table')])[2]//tr[5]/td[7]"));
		wait.until(ExpectedConditions.visibilityOf(element03));
		element03.click();
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile=new File("E:\\Feb 2022\\src\\Aug15th\\ScreenshotAs\\image03.png");
		FileHandler.copy(srcFile, destFile);
		
	}

}
