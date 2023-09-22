package June212023;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonByCodeStudio {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver_win32 (1)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://udyamregistration.gov.in/Udyam_Login.aspx");
		List<WebElement> radio=driver.findElements(By.xpath("//input[contains(@type,'radio')]"));
		System.out.println("Number of radio buttons "+ radio.size());
		for(int r=0;r>=0;r++) {
			driver.findElements(By.xpath("//input[contains(@type,'radio')]")).get(1).click();
		}
	}

}
