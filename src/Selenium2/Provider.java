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

public class Provider {
	WebDriver driver;
	@BeforeMethod
	public void setUp() {
	//	WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","F:\\Drivers\\chromedriver-win32\\chromedriver.exe");

		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 driver.manage().deleteAllCookies();
		 driver.get("https:/opensource-demo.orangehrmlive.com/");
		 
	}
	@Test(dataProvider="Data")
	public void login(String userName,String passsword)
	{
		WebElement name=driver.findElement(By.xpath("//input[@name='username']"));
		name.sendKeys(userName);
		WebElement password=driver.findElement(By.xpath("//input[@name='password']"));
		password.sendKeys(passsword);
		driver.findElement(By.xpath("//button[contains(@type,'subm')]")).click();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		driver.close();
	}
	@DataProvider(name="Data")
	public Object[][]searchDataProvider(){
              
		String fileNam="E:\\Feb 2022\\Excel\\Book1.xlsx";
		
		Object[][] searchData=getExcelData(fileNam,"Sheet2");
		
		return searchData;
		
	}
	public String[][] getExcelData(String fileName,String sheetName){
		String[] []Data=null;
		try {
			FileInputStream fis=new FileInputStream(fileName);

			XSSFWorkbook workbook=new XSSFWorkbook(fis);//we need to access-Sheet inside workbook 
			XSSFSheet Sheet=workbook.getSheet(sheetName);
			int row=Sheet.getLastRowNum()+1;//for total number of rows,its indexing start from (0)
			int cell=Sheet.getRow(0).getLastCellNum();//for total number of cells 

			Data=new String[row-1][cell];//here we initializing the array.

			//now we need to read the from cell for that we use the forloop
			//for loop outer-read the data from rows 
			//for loop inner-read the data from cell
			for (int currentRow=1;currentRow<row;currentRow++)//if we start here from zero then heading also readable 
				//because of that we start from 1 to read only data
			{
				for(int currentCell=0;currentCell<cell;currentCell++)
				{
					//now here we need to read the data & store in the array
					Data[currentRow-1][currentCell]=Sheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
					//we need here test data from excel file

					//Now we need to use"getExcelData" this method

				}
			}
			workbook.close();

			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return Data;
	}

}
