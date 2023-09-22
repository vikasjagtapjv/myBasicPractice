    package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;

public class Test23 {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
	//	driver.manage().timeouts().impcitlyWait(30,Timeouts.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://www.amazon.in/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Shirt");
		Thread.sleep(3000);
		
         List<WebElement>lis=driver.findElements(By.xpath("//div[@class='autocomplete-results-container']//div[@class='s-suggestion s-suggestion-ellipsis-direction']"));
		System.out.println("list of elements:"+lis.size());
		
		//int l = lis.size();
		for(int i = 0;i<lis.size();i++) {
			
			String ExpectedResult="Shirt for boys";
			if(lis.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				lis.get(i).click();
				System.out.println(ExpectedResult+ "clicked");
				break;
			}
		}
         
	}

}
