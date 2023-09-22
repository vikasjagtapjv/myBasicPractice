package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Actions_demo extends Base_For_All{
@Test
public void test()
{
	driver.navigate().to("https://www.flipkart.com/");
	Actions act=new Actions(driver);
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebElement element=driver.findElement(By.xpath("//*[text()='Fashion']"));
	act.moveToElement(element).build().perform();
	WebElement element01=driver.findElement(By.xpath("(//*[text()='Mobiles'])[1]"));
	act.contextClick(element01).build().perform();
	WebElement element02=driver.findElement(By.xpath("(//*[text()='Appliances'])"));
	act.doubleClick(element02).build().perform();
	WebElement element03=driver.findElement(By.xpath("//a[text()='Flights']"));
	WebDriverWait wait=new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.elementToBeClickable(element03));
	
	act.clickAndHold(element03).build().perform();
	
}
}
