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

public class PracticeOnDataProviders {
	WebDriver driver;
//	public PracticeOnDataProviders(WebDriver ldriver) {
//		driver=ldriver;
//		PageFactory.initElements(ldriver,this);
//		
//	}
	@BeforeMethod
	public void setUp()
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
	}
	
	@Test(dataProvider="google")
	public void setData(String Keyword) 
	{
		WebElement search=driver.findElement(By.xpath("//input[@name='q']"));
		search.sendKeys(Keyword);
		search.sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}
	@DataProvider(name="google")
	public Object[][]searchData()
	{
		String fileName="E:\\Feb 2022\\Excel\\Book1.xlsx";
		Object[][] getData=getExcelData(fileName,"Sheet2");
		return getData;
	}
	public String[][] getExcelData(String fileName,String sheetName )
	{
		String[][]data=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);
			XSSFWorkbook workbook=new XSSFWorkbook(fis);
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
	
}
