package Aug15th;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Driver;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Read_Data_From_Excel extends Base_For_All {
	@Test(dataProvider="TestData")
	public void Demo(String user,String pwd) {
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
	public Object[][]fetchData() throws IOException
	{
		String FN="E:\\Feb 2022\\src\\Aug15th\\excelFile\\testGoogle.xlsx";
//		Object [][] data01=getInputData(FN,"Sheet2");
//		return data01;
		Object [][] data01=getData(FN,"Sheet2");
		return data01;
	}
	
	
	public String[][]getData(String fileName,String sheetName) throws IOException{
		String data [][]=null;
		
		FileInputStream fis=new FileInputStream(fileName);
		 XSSFWorkbook workbook = new XSSFWorkbook(fis);
			XSSFSheet sheet=workbook.getSheet(sheetName);
			int row=sheet.getLastRowNum()+1;
			int cell=sheet.getRow(0).getLastCellNum();
			data=new String [row-1][cell];
			
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
