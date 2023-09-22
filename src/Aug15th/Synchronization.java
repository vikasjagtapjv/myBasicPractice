package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Synchronization extends Base_For_All {
@Test
public void semo()
{
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	WebDriverWait wait= new WebDriverWait(driver,30);
	WebElement element=wait.until(ExpectedConditions.
			visibilityOfElementLocated(By.xpath("//*[text()='Fashion']")));
	element.click();
}

}
