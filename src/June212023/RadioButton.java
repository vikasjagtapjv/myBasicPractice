package June212023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButton {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		driver.findElement(By.xpath("//a[contains(@data-testid,'open-registration-form-button')]")).click();
		List buttons=driver.findElements(By.xpath("//label[contains(@class,'_58mt')]"))	;
		System.out.println("Numbers of Buttons are "+buttons.size());
		for (int i=1;i>=1;i++)
		{
			driver.findElements(By.xpath("//input[contains(@type,'radio')]")).get(1).click();
		}
	}

}
