package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Drag_Drop extends Base_For_All{
	@Test
	public void test() throws InterruptedException
	{
		driver.navigate().to("https://www.flipkart.com/");
		Actions act=new Actions(driver);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		WebElement from=driver.findElement(By.xpath("//div[text()='Grocery']"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(from));
		WebElement to=driver.findElement(By.xpath("//input[@name='q']"));
		wait.until(ExpectedConditions.visibilityOf(to));
		Thread.sleep(3000);
		act.dragAndDrop(from, to).build().perform();
	}

}
