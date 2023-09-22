package Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChangePosition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
	//	point p = new Point();
		//driver.manage().window().getPosition();
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("shirt");

	}

}
