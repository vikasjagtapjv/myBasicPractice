package June212023;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowhandle {
	public static void main(String[]args) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		String SingleId =driver.getWindowHandle();
		System.out.println(SingleId);
		driver.findElement(By.xpath("//a[text()='OrangeHRM, Inc']")).click();
		// driver.findElement(By.xpath("//a[text()='Accept Cookies']")).click();
		Set<String>Ids=driver.getWindowHandles();
		Iterator<String>it=Ids.iterator();
		String parentId=it.next();
		System.out.println("Parent id is :"+parentId);
		String childId=it.next();
		System.out.print("child Id is :"+childId);
		
		driver.switchTo().window(parentId);
		System.out.println("parent window title is: "+driver.getTitle());
		Thread.sleep(5000);
		driver.switchTo().window(childId);
		System.out.println("child window title is :"+driver.getTitle());
		//driver.close();
	}

}
