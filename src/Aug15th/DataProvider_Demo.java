package Aug15th;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProvider_Demo extends Base_For_All{
	@Test(dataProvider="TestData")
	public void test0(String user,String pwd) {
		driver.get("https://admin-demo.nopcommerce.com/login/");
		WebElement element=driver.findElement(By.xpath("//input[@id='Email']"));
		   element.clear();
		   element.sendKeys(user);
		   WebElement element01=driver.findElement(By.xpath("//input[@id='Password']"));
		   element01.clear();
		   element01.sendKeys(pwd);
		   driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	@DataProvider(name="TestData") 
	public Object[][] Data() throws IOException
	{
		String FN="E:\\Feb 2022\\src\\Aug15th\\excelFile\\testGoogle.xlsx";
		Object [][] data1=getData(FN,"Sheet2");
		return data1;
		
	}
	public String[][]getData(String FileN,String sheetN) throws IOException
	{
		String data[][]=null;
		FileInputStream fis=new FileInputStream(FileN);
		XSSFWorkbook workbook=new XSSFWorkbook(fis);
		XSSFSheet sheet =workbook.getSheet(sheetN);
		int row=sheet.getLastRowNum()+1;
		int cell=sheet.getRow(0).getLastCellNum();
		data=new String[row-1][cell];
		for(int r=1;r<row;r++)
		{
			for(int c=0;c<cell;c++)
			{
				data[r-1][c]=sheet.getRow(r).getCell(c).getStringCellValue();
			}
		}
		workbook.close();
		
		return data;
	}
	

}
