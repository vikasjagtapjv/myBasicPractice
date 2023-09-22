package Aug15th;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class MultipleDropdown extends Base_For_All{
	
	@Test
	public void fbMultiple() {
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		
		WebElement drp01=driver.findElement(By.xpath("//select[@id='day']"));
		selectOptionsFromDropdown(drp01,"11");
		WebElement drp02=driver.findElement(By.xpath("//select[@id='month']"));
		selectOptionsFromDropdown(drp02,"Nov");
		WebElement drp03=driver.findElement(By.xpath("//select[@id='year']"));
		selectOptionsFromDropdown(drp03,"2021");
		
		
	}

	public static void selectOptionsFromDropdown(WebElement ele,String value) {
		Select drp=new Select(ele);
		List<WebElement> allOptions=drp.getOptions();
		for( WebElement options:allOptions)
		{
			if(options.getText().equals(value))
			{
				options.click();
				break;
			}
			//System.out.println(options.getText());
		}
		
	}


}
