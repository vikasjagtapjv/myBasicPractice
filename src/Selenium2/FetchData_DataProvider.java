package Selenium2;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FetchData_DataProvider {
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.get("https://www.phonepe.com/careers/jobs-by-department/engineering/");
		WebElement text=driver.findElement(By.xpath("(//a//h3)[17]"));
		text.click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	@Test(dataProvider="phonepeData")
	public void applyJob(String FirstName,String LastName,String Email)
	
	{
		WebElement Fname=driver.findElement(By.xpath("//input[@id='first_name']"));
		Fname.sendKeys(FirstName);
		
		WebElement Lname=driver.findElement(By.xpath("//input[@id='last_name']"));
		Lname.sendKeys(LastName);
		
		WebElement email=driver.findElement(By.xpath("//input[@id='email']"));
		email.sendKeys(Email);
		
		//WebElement PhoneNO=driver.findElement(By.xpath("//input[@id='phone']"));
		//PhoneNO.sendKeys(phone);
		
	}
	
	@DataProvider(name="phonepeData")
	public Object[][]excelData()
	{
		String file_Name="F:\\Salary-Slip.xlsx";
		Object[][] data=getData(file_Name,"Sheet2");
		return data;
		
	}
	public String[][]getData(String file_Name,String sheet_Name)
	
	{
		String[][] data1=null;
	try {
		FileInputStream fis=new FileInputStream(file_Name);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet Sheet=workbook.getSheet(sheet_Name);
		int rows=Sheet.getLastRowNum()+1;
		int cell=Sheet.getRow(0).getLastCellNum();
		data1=new String[rows-1][cell];
		for(int currentRow=1;currentRow<rows;currentRow++) 
		{
			for(int currentCell=0;currentCell<cell;currentCell++)
			{
			 data1[currentRow-1][currentCell]=Sheet.getRow(currentRow)
			 .getCell(currentCell).getStringCellValue();
			
			}
		}
		workbook.close();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return data1;
	}
	
	
	
	
	
	
	

}
