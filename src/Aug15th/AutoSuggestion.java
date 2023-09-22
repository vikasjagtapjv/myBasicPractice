package Aug15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AutoSuggestion extends Base_For_All {
	@Test
	public void test0() throws InterruptedException
	{
		driver.get("https://www.google.com");
		WebElement element=driver.findElement(By.cssSelector("textarea#APjFqb"));
		element.sendKeys("Ram Temples");
		Thread.sleep(5000);
//		WebDriverWait wait =new WebDriverWait(driver,50);
//    	wait.until(ExpectedConditions.visibilityOf(element));
		List<WebElement>list=driver.findElements(By.xpath("//li[@class='sbct']//div[@role='option']//div[1]/span"));
		
		System.out.println(list.size());
		for(WebElement li:list)
		{
			if(li.getText().contains(" temple hyderabad"))
			{
				li.click();
				break;
			}
		}
	}

}
