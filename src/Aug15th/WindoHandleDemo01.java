package Aug15th;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WindoHandleDemo01 extends Base_For_All {
	@Test(priority=0)
	public static void singleWindow() {
		driver.get("https://opensource-demo.orangehrmlive.com/");
		String window=driver.getWindowHandle();
		System.out.println(window);
	}
	@Test(priority=1)
	public void multipleWindow()
	{
		driver.get("https://opensource-demo.orangehrmlive.com/");
		WebElement element=driver.findElement(By.xpath("//input[@placeholder='Username']"));
		element.sendKeys("Admin");
		WebElement element01=driver.findElement(By.xpath("//input[@placeholder='Password']"));
		element01.sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		JavascriptExecutor jre=(JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,document.body.scrllHeight)");
		WebElement element02=driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']"));
		element02.click();
		Set<String>Id=driver.getWindowHandles();
		Iterator<String>it=Id.iterator();
		String parentID=it.next();
		System.out.println("Parent window ID is :"+parentID);
		String childID=it.next();
		System.out.println("Child window ID is :"+childID);
		driver.switchTo().window(parentID);
		String P_Title="OrangeHRM";
		String A_Title=driver.getTitle();
		if(A_Title.equals(P_Title))
		{
			Assert.assertTrue(true);
			System.out.println("We are on parent window");
		}
		

	}

}
