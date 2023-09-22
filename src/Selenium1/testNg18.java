package Selenium1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testNg18 {
	public static void main(String[]args)
	{
		System.out.println("Its main method");
		
		
	}
	@Test(priority=1,invocationCount=2)
	public void clickA() {
		System.out.println("Its execute first");
		
		
	}
	@BeforeSuite 
	public void clickB() {
		System.out.println("It will repeat ");
	}
	@BeforeTest
	public void clickC() {
		System.out.println("Its normal c");
		
	}
	@Test(enabled=false)
	public void clickD() {
		String st="Google";
		try {
			String str="Gooogle";
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		
	}
	

}
