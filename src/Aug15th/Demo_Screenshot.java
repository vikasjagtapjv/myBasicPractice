package Aug15th;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo_Screenshot extends Base_For_All {
	@Test(dataProvider="Test")
	public void screenshot(String FirstName,String LastName,String Email,String Password  ) throws InterruptedException, IOException
	{
		driver.get("https://demo.opencart.com/");
		WebElement element=driver.findElement(By.xpath("//span[text()='My Account']"));
		element.click();
		WebElement element01=driver.findElement(By.xpath("//a[text()='Register']"));
		element01.click();
		WebElement fName=driver.findElement(By.xpath("//input[@id='input-firstname']"));
		fName.sendKeys(FirstName);
		WebElement lName=driver.findElement(By.xpath("//input[@id='input-lastname']"));
		lName.sendKeys(LastName);
		WebElement email=driver.findElement(By.xpath("//input[@id='input-email']"));
		email.sendKeys(Email);
		WebElement pass=driver.findElement(By.xpath("//input[@id='input-password']"));
		pass.sendKeys(Password);
		JavascriptExecutor jre= (JavascriptExecutor)driver;
		jre.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//button[text()='Continue']")).click();
		
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		File srcFile=screenshot.getScreenshotAs(OutputType.FILE);
		File destFile= new File("E:\\Feb 2022\\src\\Aug15th\\ScreenshotAs\\image02.png");
		FileHandler.copy(srcFile, destFile);
		
	}
	
	@DataProvider(name="Test")
	public Object[][]readData()throws IOException
	{
		String filename="E:\\Feb 2022\\src\\Aug15th\\excelFile\\testGoogle.xlsx";
		Object[][] data=fetchData(filename,"Sheet4");
		return data;
	}
	
	public String[][]fetchData(String fileName,String sheetName)throws IOException
	{
		String [][] data01=null;
		FileInputStream fis=new FileInputStream(fileName);
		XSSFWorkbook workbook =new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		int row=sheet.getLastRowNum()+1;
		int cell=sheet.getRow(0).getLastCellNum();
		data01=new String[row-1][cell];
		
		for(int r=1;r<row;r++)
		{
			for(int c=0;c<cell;c++)
			{
				data01[r-1][c]=sheet.getRow(r).getCell(c).getStringCellValue();
			}
		}

		workbook.close();
		return data01;
	}
	@DataProvider(name="Test")
	public Object[][] getData() throws IOException
	{
		String filePath="";
		Object[][]data=fetchData1(filePath,"ShhetName");
		return data;
	}
	public String[][] fetchData1(String fileName,String sheetName) throws IOException{
		String data00[][]=null;
		FileInputStream fils=new FileInputStream(fileName);
		XSSFWorkbook workbok=new XSSFWorkbook(fils);
		XSSFSheet sheet=workbok.getSheet(sheetName);
		int row=sheet.getLastRowNum()+1;
		int cell=sheet.getRow(0).getLastCellNum();
		data00=new String[row-1][cell];
		for(int r1=1;r1<row;r1++)
		{
			for(int c1=0;c1<cell;c1++)
			{
				data00[r1-1][c1]=sheet.getRow(r1).getCell(c1).getStringCellValue();
			}
		}
		workbok.close();
		return data00;
		
	}
	

}
