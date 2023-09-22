package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test14practice {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
			driver.manage().deleteAllCookies();
			driver.get("https://opensource-demo.orangehrmlive.com/");
			driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
			driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");
		    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id='menu_pim_viewPimModule']")).click();
           List<WebElement>lis=driver.findElements(By.xpath("//input[@type='checkbox']"));
			System.out.println("size of elements:" +lis.size());
			System.out.println(lis.get(0).isEnabled());
			System.out.println(lis.get(4).isSelected());
			System.out.println(lis.get(2).isDisplayed());
			lis.get(10).click();
			System.out.println(lis.get(4).isSelected());
			
			/*
			 * Thread.sleep(3000);
			
			List<WebElement>list=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
			System.out.println("size of list of elements:"+list.size());
			
			String ExpectedResult ="10";
			for(int i=0;i<list.size();i++)
			{
				if(list.get(i).getText().equalsIgnoreCase(ExpectedResult))
				{
					list.get(i).click();
				}
			}
			 */
		
	}

}
