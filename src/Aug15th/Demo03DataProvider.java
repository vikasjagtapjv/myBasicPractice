package Aug15th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
@Test(dataProvider="Test")
public class Demo03DataProvider extends Base_For_All {
	public void Register(String FirstName,String LastName,String Email,String Password) throws InterruptedException
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
		
	}
	@DataProvider(name="Test")
	public  Object[][]fetchData() throws IOException
	{
		String filename="E:\\Feb 2022\\src\\Aug15th\\excelFile\\testGoogle.xlsx";
		Object[][]data=getData(filename,"Sheet4");
		return data;
	}
	public String[][] getData(String fileName,String sheetName)throws IOException
	{
		String Data[][]=null;
		FileInputStream fis=new FileInputStream(fileName);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet=workbook.getSheet(sheetName);
		int row=sheet.getLastRowNum()+1;
		int cell=sheet.getRow(0).getLastCellNum();
		Data=new String[row-1][cell];
		
		for(int r=1;r<row;r++)
		{
			for(int c=0;c>cell;c++)
			{
				Data[r-1][c]=sheet.getRow(r).getCell(c).getStringCellValue();
			}
		}
		workbook.close();
		return Data;
		
	}

}
