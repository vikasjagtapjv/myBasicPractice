package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FrameDemo01 extends Base_For_All {
	@Test(priority=1)
	public void demo() throws InterruptedException {
		driver.get("https://selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame("packageListFrame");//switch to name value
		WebElement element=driver.findElement(By.xpath("//a[contains(text(),'org.openqa.selenium.bidi.browsingcontext')]"));
		
		System.out.println(element.getText());
		Thread.sleep(3000);
		
	}

}
