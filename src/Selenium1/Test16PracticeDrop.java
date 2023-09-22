package Selenium1;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test16PracticeDrop {
	public static void main(String[]args) throws Exception {
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver _103\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://opensource-demo.orangehrmlive.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[contains(@name,'txtUsername')]")).sendKeys("Admin");
		driver.findElement(By.xpath("//*[contains(@name,'txtPassword')]")).sendKeys("admin123");
	    driver.findElement(By.xpath("//input[@id='btnLogin']")).click();
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[text()='Leave']")).click();
	    WebElement drp=driver.findElement(By.xpath("//*[@id='calFromDate']"));
	    drp.click();
	    WebElement drop=driver.findElement(By.xpath("//select[@data-handler='selectMonth']"));
	    
	    Thread.sleep(3000);
	   Select sc=new Select(drop);
	    //sc.selectByIndex(3);
	    
	   // Thread.sleep(3000);
	    //sc.selectByValue("9");
	    
	    Thread.sleep(3000);
	    
	   // sc.selectByVisibleText("Aug");
	    
	    List<WebElement>dr=sc.getOptions();
	    System.out.println("list of minth:"+dr.size());
	   // String ExpectedResult="Dec";
	    for(int i =0;i<=dr.size();i++) {
	    	String re=dr.get(i).getText();
			if(re.equalsIgnoreCase("Mar")) {
				dr.get(i).click();
			}
	    		
	    }
	    
	}

}
