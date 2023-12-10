package Aug15th;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FileUploads extends Base_For_All {
	@Test
	public void uploadFile()
	{
		driver.get("https://the-internet.herokuapp.com/upload");
		WebElement element =driver.findElement(By.cssSelector("input#file-upload"));
		String filePath="E:\\Feb 2022\\src\\Aug15th\\UploadFILE\\Demo.json";
		element.sendKeys(filePath);
		WebElement clicks=driver.findElement(By.cssSelector("input#file-submit"));
		clicks.click();
		
	}

}
