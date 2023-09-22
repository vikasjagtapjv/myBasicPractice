package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Scrolling_Action extends Base_For_All {
	@Test
	public void scroll() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement element =driver.findElement(By.cssSelector("*[placeholder='Username']"));
		element.sendKeys("Admin");
		
		WebElement element01=driver.findElement(By.cssSelector("*[placeholder='Password']"));
		element01.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']"));
		
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		
	}

}
