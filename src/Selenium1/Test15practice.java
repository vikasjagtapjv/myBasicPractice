package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test15practice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    Thread.sleep(3000);
		List<WebElement>lis=driver.findElements(By.xpath("//*[@id='mainMenuFirstLevelUnorderedList']/li"));
		System.out.println("size:"+lis.size());
	
		System.out.println(lis.get(3).isEnabled());
		lis.get(2).click();
		driver.findElement(By.xpath("//*[@id='leaveList_chkSearchFilter_checkboxgroup_allcheck']")).click();
	}

}
