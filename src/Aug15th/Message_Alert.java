package Aug15th;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Message_Alert extends Base_For_All {
	@Test
	public void demo() throws InterruptedException
	{
		driver.get("https://demoqa.com/alerts");
		WebElement element=driver.findElement(By.xpath("//button[@id='alertButton']"));
		element.click();
		Alert alert=driver.switchTo().alert();
		String text=alert.getText();
		System.out.println(text);
		alert.accept();
		
		WebElement element01=driver.findElement(By.xpath("//button[@id='timerAlertButton']"));
		element01.sendKeys(Keys.ENTER);
		
	
		
		
		//Thread.sleep(5000);
		WebDriverWait wait=new WebDriverWait(driver,50);
		wait.until(ExpectedConditions.alertIsPresent());
		Alert alert01=driver.switchTo().alert();
		alert.accept();
		
		String text01 =alert01.getText();
		System.out.println(text01);
	}
	

}
