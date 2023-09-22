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

public class DataProviderWithExcel {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		//Launch ChromeBrowser
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//Open Url
		driver.get("https://www.google.com/");
	}
	@Test(dataProvider="searchDataProvider")
	public void searchKeyword(String Keyword) {
		WebElement searchBox=driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys(Keyword);
		searchBox.sendKeys(Keys.ENTER);
		
	}
	@DataProvider(name="searchDataProvider")
	public Object[][] searchDataProviderMethod()
	{
		String fileName="E:\\Feb 2022\\Excel\\Book1.xlsx";
		Object[][] searchData=getExcelData(fileName,"Sheet2");
		
//		Object[][] searchData=new Object[2][1];
//		searchData[0][0]="Taj Mahal";
//		searchData[1][0]="Lal Kila";
		return searchData;
		
	}
	public String[][] getExcelData(String fileName,String sheetName){
		// String array declared
		String[][] data=null;
		//Open File in Read
		try {
			FileInputStream inputStream=new FileInputStream(fileName);
			//CREATE XSSFWorkBook Class for excel file Manipulation
			XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
			
			XSSFSheet excelSheet=workBook.getSheet(sheetName);
			//Total Number of rows
			int ttlRows=excelSheet.getLastRowNum()+1;
			
			//total Number of cell
			int ttlCell=excelSheet.getRow(0).getLastCellNum();
			//initialize array
			data=new String[ttlRows-1][ttlCell];
			
			for(int currentRow=1;currentRow<ttlRows;currentRow++) 
			{
				
				for(int currentCell=0;currentCell<ttlCell;currentCell++) 
				{
					data[currentRow-1][currentCell]=excelSheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
					
				}
			}
			
			
			
			
			workBook.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
		
	}
	
	
	
	
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
		
	}
	

}
