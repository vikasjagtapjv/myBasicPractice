package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class Mouse_hover extends Base_For_All {
	//driver=new ChromeDriver();
	
	@Test
	public void test()
	{
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement element=driver.findElement(By.xpath("//div[contains(text(),'Mobiles')]"));
		
		//create an actions object
		Actions act=new Actions(driver);
		act.moveToElement(element).build().perform();
	}
	

}
