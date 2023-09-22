package Selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Test21RadioBasicProgram {
public static void main(String[]args) {
	System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (1)\\chromedriver.exe");
	WebDriver driver =  new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	driver.get("https://www.rahulshettyacademy.com/AutomationPractice/");
	/*
	 * driver.findElement(By.xpath("//input[@value='radio1']")).click();// First method of radio button handling
	
	driver.findElement(By.xpath("//input[@value='radio2']")).click();
	driver.findElement(By.xpath("//input[contains(@value,'radio3')]")).click();
	
	List<WebElement>radio= driver.findElements(By.xpath("//input[contains(@type,'radio')]"));// Second method to find radio button
	System.out.println("size of radio button:"+radio.size());
	System.out.println(radio.get(0).isDisplayed());
	System.out.println(radio.get(2).isSelected());
	System.out.println(radio.get(1).isEnabled());
	radio.get(1).click();
	 */
	List<WebElement>rad=driver.findElements(By.xpath("//input[contains(@name,'radioButton')]"));// Third method of radio button 
	System.out.println("size of Button:"+rad.size());
	String ExpectedResult= "Radio1";
	int l= rad.size();
	for(int i =0;i<l;i++)
	{
		if(rad.get(i).getText().equalsIgnoreCase(ExpectedResult))
		{
			rad.get(i).click();
			System.out.println("clicked"+  ExpectedResult);
			break;
		}
		
		
		
	}
	driver.findElement(By.xpath("//select[@id='dropdown-class-example']")).click();//01
	//driver.findElement(By.xpath("//option[@value='option1']")).click();
List<WebElement>drp= driver.findElements(By.xpath("//select[@name='dropdown-class-example']"));	
System.out.println("size of drp:"+drp.size());
drp.get(0).click();

WebElement drop=driver.findElement(By.xpath("//select[@name='dropdown-class-example']"));//2

Select se=new Select(drop);

se.selectByValue("option2");

List<WebElement>eb=se.getOptions();//3
System.out.println("size:"+eb.size());

for(int i=0;i<eb.size();i++)
{
String str1=eb.get(i).getText();
if(str1.equalsIgnoreCase("option3"))	
	
{
	eb.get(i).click();

}

}







	

	
}
}
