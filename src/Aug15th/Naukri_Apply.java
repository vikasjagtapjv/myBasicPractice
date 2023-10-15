package Aug15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Naukri_Apply extends Base_For_All {
	@Test(priority=1)
	public void test() throws Exception
	{
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement element=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]"));
		element.sendKeys("vikasjagtapjv@gmail.com");
		WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]"));
		element1.sendKeys("Mh23@m5753");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='view-all-link'])[1]")).click();
		List<WebElement>ele=driver.findElements(By.xpath("//p[@class='title ellipsis typ-16Bold']"));
		System.out.println(ele.size());
		List<WebElement> ele1=driver.findElements(By.xpath("//i[@class='dspIB naukicon naukicon-ot-checkbox']"));
		System.out.println(ele1.size());
		int totalCheckBoxes=ele1.size();
		for (int i=totalCheckBoxes-1;i<totalCheckBoxes;i++)
		{
			ele1.get(i).click();
		}
//		for (int i=0;i<totalCheckBoxes;i++)
//		{
//			if(i<1)
//			{
//				ele1.get(i).click();
//				
//			}
//		}
		Thread.sleep(5000);
		JavascriptExecutor jre= (JavascriptExecutor) driver;
		jre.executeScript("window.scrollBy(300,40)");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
//		List<WebElement>ele2=driver.findElements(By.xpath("//label[contains(@class,'ssrc__label')]"));
//		//int check=ele2.size();
//		for(WebElement e1:ele2)
//		{
//			String s=e1.getAttribute("id");
//			if(s.equals("2 - 5"))
//			{
//				e1.click();
//			}
//		}
		//driver.quit();
		driver.close();
	}
	@Test(priority=2)
	public void test2() throws Exception
	{
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		WebElement element=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your active Email ID / Username')]"));
		element.sendKeys("vikasjagtapjv@gmail.com");
		WebElement element1=driver.findElement(By.xpath("//input[contains(@placeholder,'Enter your password')]"));
		element1.sendKeys("Mh23@m5753");
		driver.findElement(By.xpath("//button[contains(@type,'submit')]")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='view-all-link'])[1]")).click();
		List<WebElement>ele=driver.findElements(By.xpath("//p[@class='title ellipsis typ-16Bold']"));
		System.out.println(ele.size());
		List<WebElement> ele1=driver.findElements(By.xpath("//i[@class='dspIB naukicon naukicon-ot-checkbox']"));
		System.out.println(ele1.size());
		int totalCheckBoxes=ele1.size();
		for (int i=totalCheckBoxes-1;i<totalCheckBoxes;i++)
		{
			ele1.get(i).click();
		}
		
		Thread.sleep(5000);
		JavascriptExecutor jre= (JavascriptExecutor) driver;
		jre.executeScript("window.scrollBy(300,40)");
		
		
		driver.findElement(By.xpath("//button[contains(text(),'Apply')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='crossIcon chatBot chatBot-ic-cross']")).click();
	
		driver.close();
	}

}
