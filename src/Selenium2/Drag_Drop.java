package Selenium2;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drag_Drop {
	static WebDriver driver;
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
//		Find the source Element
		WebElement n=driver.findElement(By.xpath("//div[@id='box6']"));
//		Find Target Element
		WebElement n1=driver.findElement(By.xpath("//div[@id='box106']"));
		
		
//		Now creating the object of actions class&passing WebDriver Object as argument
		
		Actions act =new Actions(driver);
		act.dragAndDrop(n, n1).build().perform();
		
		
		
	}

}
