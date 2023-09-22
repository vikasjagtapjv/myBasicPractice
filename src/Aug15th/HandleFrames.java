package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HandleFrames extends Base_For_All{
	@Test
	public void handleIframe()
	{
	
		driver.get("https://www.rediff.com/");
		//switch to i frame 
		driver.switchTo().frame("moneyiframe");//switch to frame by id value
		String nseIndex=driver.findElement(By.xpath("//span[@id='nseindex']")).getText();
		System.out.println(nseIndex);
		
		//HOw to switch to iframe
		/*
		 * by Id or name 
		 * by Index
		 * by webElement
		 * driver.switch().frame();
		 */
		
	}
	

}
