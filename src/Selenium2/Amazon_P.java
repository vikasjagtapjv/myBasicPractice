package Selenium2;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Amazon_P 
{
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vikas\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");
	}

	@Test(dataProvider="amazonData")
	public void shop(String List)
	{
		
		
	WebElement searchBox=driver.findElement(By.xpath("//input[@type='text']"));
	searchBox.sendKeys(List);
	searchBox.sendKeys(Keys.ENTER);
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	//use the DataProvider
	@DataProvider(name="amazonData")
	public Object[][]searchData()
	{
		String fileName="F:\\Salary-Slip.xlsx";
		Object[][] AData= getData(fileName,"Sheet3");
		return AData;
		
	}
	//Read The Date from ExcelSheet
	public String[][]getData(String fileName,String sheetName)
	{
		String [][] data=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			int row =sheet.getLastRowNum()+1;
			int cell=sheet.getRow(0).getLastCellNum();
			data=new String[row-1][cell];
			for(int currentRow=1;currentRow<row;currentRow++)
			{
				for(int currentCell=0;currentCell<cell;currentCell++)
				{
					data[currentRow-1][currentCell]=sheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
					
				}
			}
			workbook.close();
			
		}
		catch(Exception e) 
		{
			e.printStackTrace();
			
		}
		
		
		
		
		
		return data;
	}
	

}
