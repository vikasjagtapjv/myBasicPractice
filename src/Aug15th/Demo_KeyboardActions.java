package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

public class Demo_KeyboardActions extends Base_For_All {
@Test(priority=0)
public void test()
{
	driver.get("https://www.facebook.com/");
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("vikas");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("abcd123@sim");
	driver.findElement(By.xpath("//button[text()='Log in']")).sendKeys(Keys.ENTER);
	driver.close();
	
	
}

	
	

}
