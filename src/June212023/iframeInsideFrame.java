package June212023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class iframeInsideFrame {
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("https://chercher.tech/practice/frames-example-selenium-webdriver");
		driver.switchTo().frame("frame1");//parent Frame/Outer frame
		driver.switchTo().frame("frame3");//child frame/Inner frame
		driver.findElement(By.xpath("//input[@id='a']")).click();
		driver.switchTo().parentFrame();
		driver.findElement(By.tagName("input")).sendKeys("Vikas Jagtap");
		driver.switchTo().defaultContent();
		driver.switchTo().frame("frame2");
		WebElement element=driver.findElement(By.xpath("//select[@id='animals']"));
		System.out.println("List of Elements: "+element.getSize());
		Select sc=new Select(element);
		sc.selectByVisibleText("Big Baby Cat");
		//driver.close();
		
		
	}

}
