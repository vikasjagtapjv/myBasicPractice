package Aug15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestNgDemo01 extends Base_For_All {
	@Test
	public void demoAssertation()
	{
		//driver.get("https://smartcare.sbilife.co.in/");
		//System.out.println(driver.getTitle());
		driver.navigate().to("https://www.iciciprulife.com/");
		WebElement element=driver.findElement(By.xpath("(//span[text()='Plans'])[1]"));
		element.click();
		WebElement element01=driver.findElement(By.xpath("(//span[text()='ICICI Pru iProtect Smart '])[1]"));
		element01.click();
		String e_Title="Term Insurance Plan Calculator Online 2023 | ICICI Pru Life";
		if(driver.getTitle().equals(e_Title))
		{
			Assert.assertTrue(true);
		}
		driver.findElement(By.xpath("//span[text()='Yes']")).click();
		WebElement drp=driver.findElement(By.xpath("//select[@id='myDropDown']"));
		Select se=new Select(drp);
		List<WebElement>elem=se.getOptions();
		for ( WebElement opt:elem)
		{
			if(opt.getText().equals("Female"))
			{
				opt.click();
				break;
			}
		}
		driver.findElement(By.xpath("(//label[@class='col-12 form-check-label'])[3]")).click();
		driver.findElement(By.xpath("(//input[@placeholder='DD/MM/YYYY'])[1]")).sendKeys("29/08/2023");
		driver.findElement(By.xpath("(//input[@id='leadMobileNo'])")).sendKeys("123345678");
		
	}
	

}
