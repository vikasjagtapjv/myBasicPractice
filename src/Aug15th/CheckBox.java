package Aug15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class CheckBox extends Base_For_All{
	@Test
	public void test() throws InterruptedException {
		driver.get("https://demoqa.com/checkbox");
		WebElement element00=driver.findElement(By.xpath("//div[@class='rct-options']//button[@title='Expand all']"));
		element00.click();
		List<WebElement>element0=driver.findElements(By.xpath("//button[@class='rct-collapse rct-collapse-btn']"));
		System.out.println(element0.size());
		List<WebElement>element=driver.findElements(By.xpath("//span[@class='rct-checkbox']"));
		System.out.println("list of webElements: "+element.size());
		
//		for(int i=0;i<element.size();i++)
//		{
//			element.get(i).click();
//			break;
//		}
		
//		for( WebElement check:element)
//		{
//			check.click();
//			break;
//			
//		}
		
//		for(WebElement cbox:element)
//		{
//			
//			String sbox=cbox.getText();
//			Thread.sleep(3000);
//			if(sbox.equals("Desktop")||sbox.equals("Angular"))
//			{
//				cbox.click();
//				break;
//			}
//		}
		
		
		
		//select last two checkbox
		// totalNumberOfCheckBoxes-number of checkBoxes want to select=Statting index
		//17-2=15
		// int totalCheckb=element.size();
//		 
//		 for(int i=totalCheckb-2;i<totalCheckb;i++)
//		 {
//			 
//			 
//			 JavascriptExecutor jre=(JavascriptExecutor)driver;
//			 jre.executeScript("window.scrollBy(0,document.body.scrollHeight)");
//			 WebDriverWait wait = new WebDriverWait(driver, 50);
//			 wait.until(ExpectedConditions.visibilityOfAllElements(element)); 
//			 
//			// Thread.sleep(10000);
//			
//			 element.get(i).click();
//			
//		 }
		
		
		
		//Select first 3 check boxes
		for(int i=0;i<element.size();i++)
		{
			if(i<1)
			{
//				WebDriverWait wait=new WebDriverWait(driver,50);
//				wait.until(ExpectedConditions.visibilityOfAllElements(element));
				element.get(i).click();
				
			}
		}
	}

}
