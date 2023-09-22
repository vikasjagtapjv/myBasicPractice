package Selenium1;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hslf.exceptions.EncryptedPowerPointFileException;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class RepeatExcelSheet {
	public static String RepeatExcelSheet(String sheetName, int row,int cell)throws EncryptedPowerPointFileException, IOException
	{
		FileInputStream file = new FileInputStream("F:\\ExcelSheet.xlx");
		String value=WorkbookFactory.create(file).getSheet(sheetName).getRow(row).getCell(cell).getStringCellValue();
		return value;
	}

	public static String getData(String string, int i, int j) {
		// TODO Auto-generated method stub
		return null;
	}


}
