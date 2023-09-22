package Aug15th;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class NaukriApply extends Base_For_All {
	@Test
	public void test() throws InterruptedException
	{
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement element=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]"));
		element.sendKeys("vikasjagtapjv@gmail.com");
		WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]"));
		element1.sendKeys("Mh23@m5753");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(5000);
		WebElement element2=driver.findElement(By.xpath("(//a[@class='nI-gNb-menuItems__anchorDropdown'])[1]"));
		element2.click();
		//Thread.sleep(5000);

//		driver.findElement(By.xpath("//a/span[text()='View all']")).click();
//		Thread.sleep(5000);
		driver.findElement(By.xpath("(//p[@class='title ellipsis typ-16Bold'])[1]")).click();
		Set<String>id=driver.getWindowHandles();
		Iterator<String> itr=id.iterator();
		String parentid=itr.next();
		String childid=itr.next();
		driver.switchTo().window(childid);
		
	
		
		driver.findElement(By.xpath("(//button[@id='apply-button'])[1]")).click();
		driver.findElement(By.xpath("//label[text()='Skip this question']")).click();
     	driver.findElement(By.xpath("//div[text()='Save']")).click();
	/*
	 * 	List<WebElement>list=driver.findElements(By.xpath("//div//i[@class='dspIB naukicon naukicon-ot-checkbox']"));
	
		System.out.println(list.size());
		for(int i=0;i<list.size();i++)
		{
			if(i<5)
			{
				list.get(i).click();
			}
		}
		WebElement button=driver.findElement(By.xpath("//button[contains(text(),'Apply')]"));
		WebDriverWait wait=new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(button));
		button.click();
		 */
		//driver.findElement(By.xpath("(//div[@class='info dspIB'and //p[contains(text(),'Job |')]])[1]")).click();
		
	}
	
	}
