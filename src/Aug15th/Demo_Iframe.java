package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Demo_Iframe extends Base_For_All {
	@Test
	public void switchTOFrame()
	{
		driver.get("https://www.rediff.com/");
		WebElement element=driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
		driver.switchTo().frame(element);
		WebElement element01=driver.findElement(By.xpath("//span[@id='nseindex']"));
		String str=element01.getText();
		System.out.println(str);
	}

}
