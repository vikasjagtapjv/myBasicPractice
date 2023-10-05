package sep23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class HndleMultipleBrowser {
	@Test//lecture=8th
	public void test()
	{
		System.setProperty("webdriver.chrome.driver",
				"F:\\Drivers\\chromedriver-win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		/*
		 * WebDriver is an interface ,we can create the instance of WebDriver
		 * and cast it into different browser class using reference variable 
		 * driver .
		 * then we can use different methods of the WebDriver interfaces like get(),
		 * getTitle(),close()....etc.to write the automation code.
		 */
		driver.get("https://www.techbeamers.com/dropdown-and-multiple-select-in-webdriver/"); 
		WebElement python=driver.findElement(By.xpath("//a[text()='Python' and //ul[@class='sub-menu']]"));
		Select se1=new Select(python);
		se1.selectByVisibleText("Python Quizzes");
		WebElement java=driver.findElement(By.xpath("//a[text()='Java' and //ul[@class='sub-menu']]"));
		Select se2=new Select(java);
		se2.selectByIndex(3);
		WebElement selenium=driver.findElement(By.xpath("//a[text()='Selenium' and //ul[@class='sub-menu']]"));
		Select se3=new Select(selenium);
		se3.selectByVisibleText("Selenium Tutorial");
		WebElement testing=driver.findElement(By.xpath("//a[text()='Testing' and //ul[@class='sub-menu']]"));
		Select se4=new Select(testing);
		se4.selectByIndex(2);
	}

}
