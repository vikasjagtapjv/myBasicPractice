package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FrameDemo03 extends Base_For_All {
	@Test
	public void handleFrame() {
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//WebElement element=driver.findElement(By.xpath("//iframe[@cd_frame_id_='87b8c4a28f9cef12c4c5c83179219d74']"));
		driver.switchTo().frame(1);
		WebElement element01=driver.findElement(By.xpath("//*[text()='Action']"));
		element01.click();
		String e_Title="Overview";
		String a_Title=driver.getTitle();
		Assert.assertEquals(a_Title, e_Title);
//		WebDriverWait wait=new WebDriverWait(driver,30);
//		wait.until(ExpectedConditions.visibilityOf());
		driver.switchTo().parentFrame();
		driver.switchTo().frame(2);
		WebElement element02=driver.findElement(By.xpath("(//*[text()='Tree'])[1]"));
		element02.click();
		
		String E_Title="Class Hierarchy";
		String A_Title=driver.getTitle();
		if(E_Title.equals(A_Title))
		{
			Assert.assertTrue(true);
		}
		driver.switchTo().parentFrame();
		String Title="Overview List";
	   String ActualT=driver.getTitle();
	   if(Title.equals(ActualT))
	   {
		   System.out.println("We are on default frame");
	   }
		
	}

}
