package Selenium;
//How to handle Dyanamic web table: HTML DOM is sometimes diplayed in 
//Table format using <Table>  tag along with <tr>,
//<td>,<thead>,<tbody>.

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test44Dyna {
	public static void main(String[]args) throws Exception
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();//upcasting
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.navigate().to("https://money.rediff.com/gainers");
		Thread.sleep(3000);
		List<WebElement>list=driver.findElements(By.xpath("//*[contains(@class,'dataTable')]/tbody/tr/td[1]/a"));
		System.out.println(list.size());
		Thread.sleep(3000);
		String ExpectedResult="Hikal Ltd.";
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getText().equalsIgnoreCase(ExpectedResult))
			{
				list.get(i).click();
				break;
			}
		}
		
		
		
	}

}
/*<table> tag is represent the complete web table data.
#.<tr> tag is represent the table rows.
#. <td> tag is represent the tables in columns.
#. <thead> tag is represent the table header.
#. <tbody> tag is represent whole table body except table header.
*/

