package Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test13 {
	public static void main(String[]args) {
		//Automate registration of E-Commerce website
		/*
		 * 1. Test Case - Automate User Registration process of e-commerce website.
Steps to Automate:
1. Open this url  http://automationpractice.com/index.php
2. Click on sign in link.
3. Enter your email address in 'Create and account' section.
4. Click on Create an Account button.
5. Enter your Personal Information, Address and Contact info.
6. Click on Register button.
7. Validate that user is created.
		 */
		System.getProperty("webdriver.chrome.driver","E:\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		String Url="http://automationpractice.com/index.php";
		driver.get(Url);
		driver.manage().timeouts().implicitlyWait(2000,TimeUnit.MILLISECONDS);
		driver.manage().window().maximize();
		// Click on sign in
		driver.findElement(By.linkText("Sign in")).click();
		// Enter the Email adress here
		driver.findElement(By.cssSelector("[name='email_create']")).sendKeys("test4212@test.com");
		// click on create an account
		driver.findElement(By.xpath("//button[@id=\"SubmitCreate\"]")).click();
		
		 //Select Title
		  driver.findElement(By.xpath("//input[@id=\"id_gender1\"]")).click();
		  driver.findElement(By.name("customer_firstname")).sendKeys("viky");
		  driver.findElement(By.name("customer_lastname")).sendKeys("Jaga");
		  driver.findElement(By.id("passwd")).sendKeys("V1soft");
		   
		  // Enter Address
		  driver.findElement(By.id("company")).sendKeys("Jaga");
		  driver.findElement(By.id("address1")).sendKeys("Star road,cine Complex near indian oil pump");
		  driver.findElement(By.id("city")).sendKeys("abc");
		  
		  
		  
	}

}
