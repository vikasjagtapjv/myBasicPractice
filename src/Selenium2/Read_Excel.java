package Selenium2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Read_Excel {
	public static void main (String[]args) throws IOException {
		// To find the path of excel sheet
		String fileName="F:\\Salary-Slip.xlsx";
		FileInputStream file=new FileInputStream(fileName);
		
		// Creating the Workbook
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		 
		XSSFSheet sheet=workbook.getSheetAt(0);
		int row=sheet.getLastRowNum();
		int cell =sheet.getRow(0).getLastCellNum();
		
		//Cell cell=sheet.getCell(0);
		System.out.println(cell);
		System.out.println(row);
		workbook.close();
	}

}
