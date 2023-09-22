package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Keyboard_Actions extends Base_For_All {
	@Test
	public void demo()
	{
		driver.get("https://www.facebook.com/");
		WebElement element =driver.findElement(By.xpath("//input[@id='email']"));
		
		//Actions act =new Actions(driver);  
		element.sendKeys("vikasJagtap");
		
		WebElement element01=driver.findElement(By.xpath("//input[@id='pass']"));
		element01.sendKeys("123456");
		WebElement element02=driver.findElement(By.xpath("//button[@type='submit']"));
		element02.sendKeys(Keys.ENTER);
		
		/*This is used to type special characters with keyboard actions 
		 * element02.sendKeys(Keys.CONTROL,"a");
		 * element02.sendKeys(Keys.BACK_SPACE);
		 * 
		 * 
		 */
		
		
		
	}
	

}
