package Selenium2;

import java.io.FileInputStream;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class IMP_DataP {
	WebDriver driver;
	@BeforeMethod
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(50,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https:/opensource-demo.orangehrmlive.com/");
	}
	@Test(dataProvider="searchDataProvider") 
	public void login(String Username,String Password )
	{
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys(Username);
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys(Password);
		driver.findElement(By.xpath("//button[@type='submit']")).sendKeys(Keys.ENTER);
	}
	@AfterMethod
	public void tearDown()
	{
		driver.quit();
	}




	//For read the data from file we are creating the one method
	//after reading data it will return String array
	//Method Name-getExcelData().
	//First parameter -fileName
	//Second Parameter--sheetName
	@DataProvider(name="searchDataProvider")
	public Object[][]searchDataProviderMethod()
	{ //inside array we need to read the data from the file
		//Then we are calling file we use Method  name-getExcelData.
		//Here we need to give the file name & Sheet Name
		String fileName="E:\\Feb 2022\\Excel\\Book1.xlsx";

		Object[][] searchData=getExcelData(fileName,"Sheet2");
		//we kept here file name-fileName & sheet name-Sheet2




		return searchData;
	}

	public String[][]getExcelData(String fileName,String sheetName )
	{
		//we are creating StringArray
		//Array name=data
		String[][] data=null;//here we declaring the array
		//for Opening the file read mode we are 
		//creating the Object of FileInputStream
		try {
			FileInputStream fis=new FileInputStream(fileName);

			XSSFWorkbook workbook=new XSSFWorkbook(fis);//we need to access-Sheet inside workbook 
			XSSFSheet Sheet=workbook.getSheet(sheetName);
			int row=Sheet.getLastRowNum()+1;//for total number of rows,its indexing start from (0)
			int cell=Sheet.getRow(0).getLastCellNum();//for total number of cells 

			data=new String[row-1][cell];//here we initializing the array.

			//now we need to read the from cell for that we use the forloop
			//for loop outer-read the data from rows 
			//for loop inner-read the data from cell
			for (int currentRow=1;currentRow<row;currentRow++)//if we start here from zero then heading also readable 
				//because of that we start from 1 to read only data
			{
				for(int currentCell=0;currentCell<cell;currentCell++)
				{
					//now here we need to read the data & store in the array
					data[currentRow-1][currentCell]=Sheet.getRow(currentRow).getCell(currentCell).getStringCellValue();
					//we need here test data from excel file

					//Now we need to use"getExcelData" this method

				}
			}
			workbook.close();

		}catch(Exception e) {
			e.printStackTrace();
		}
		//it will return string array
		return data;
	}
	//To read the data from excel our whole process is completed
	//now we need ues this to fetch data inside the DataProvider

}
