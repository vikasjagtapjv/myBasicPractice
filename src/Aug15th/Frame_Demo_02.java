package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Frame_Demo_02 extends Base_For_All {
	@Test
	public void demo() {
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(1);
		
		WebElement element=driver.findElement(By.xpath("//span[text()='Action']"));
		element.click();
		System.out.println(element.getText());
	}
	

}
