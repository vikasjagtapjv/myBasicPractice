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

public class DataProvider_G {
	WebDriver driver;
	@BeforeMethod
	public void setup()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		driver.get("https://www.flipkart.com/");
		
	}
	@Test(dataProvider="ProvideData")
	public void Shopping(String Keywords)
	{
		WebElement search=driver.findElement(By.xpath("//input[@type='text']"));
		search.sendKeys(Keywords);
		search.sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
	}
	
	@DataProvider(name="ProvideData")
	public Object[][]searchData()
	{
		String fileName="F:\\Salary-Slip.xlsx";
		Object[][] sData=getData(fileName,"Sheet3");
		return sData;
	}
	
	
	public String[][]getData(String fileName,String sheetName)
	{
		String[][] data=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);
			XSSFWorkbook workbook= new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			int rows=sheet.getLastRowNum()+1;
			int cell=sheet.getRow(0).getLastCellNum();
			data=new String[rows-1][cell];
			for(int currentRow=1;currentRow<rows;currentRow++)
			{
				for(int currentCell=0;currentCell<cell;currentCell++)
				{
					data[currentRow-1][currentCell]=sheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
					
				}
			}
			
			workbook.close();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
		
		return data;
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}

}
