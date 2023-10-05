package sep23;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;



public class DropDown {
	@Test
	public void test()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
         WebDriver driver=new ChromeDriver();
         driver.manage().window().maximize();
      driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
         
            driver.get("https://www.opencart.com/");
            driver.findElement(By.xpath("//ul[@class='nav navbar-nav']//a[text()='Marketplace']")).click();
            WebElement ele=driver.findElement(By.xpath("//select[@id='input-sort']"));
            ele.click();
           Select sel=new Select(ele);
//            sel.selectByIndex(3);
            
            List<WebElement>option=sel.getOptions();
            for(WebElement elew:option)
            {
            
            	if(elew.getText().equals("Rating"))
            	{
            		elew.click();
            		break;
            	}
            }
            driver.close();
            
            
            
            		
	}

}
