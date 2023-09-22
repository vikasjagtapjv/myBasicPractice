package Aug15th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Handle_window extends Base_For_All {
	@Test
	public void window() throws InterruptedException {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement element =driver.findElement(By.cssSelector("*[placeholder='Username']"));
		element.sendKeys("Admin");
		
		WebElement element01=driver.findElement(By.cssSelector("*[placeholder='Password']"));
		element01.sendKeys("admin123");
		
		driver.findElement(By.xpath("//button[@type='submit']"));
		Thread.sleep(3000);
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		
		Set<String> id=driver.getWindowHandles();
		
//		Iterator<String> itr=id.iterator();
//		String ParentId=itr.next();
//		String ChildId=itr.next();
//		System.out.println(ParentId);
//		System.out.println(ChildId);
//		
		//driver.switchTo().window(ParentId);
		//driver.switchTo().window(ChildId);
		for( String id1:id) {
			
			String Title=driver.switchTo().window(id1).getTitle();
			if(Title.equals("OrangeHRM")
					||Title.equals("OrangeHRM HR Software | Free & Open Source HR Software | HRMS | HRIS | OrangeHRM"))
			{
				driver.close();
			}
			
		}
			
		{
			
		}
	}

}
