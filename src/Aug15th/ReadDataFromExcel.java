package Aug15th;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadDataFromExcel {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=new FileInputStream("E:\\Feb 2022\\Excel\\Book1.xlsx");
		try (XSSFWorkbook workbook = new XSSFWorkbook(fis)) {
			XSSFSheet sheet=workbook.getSheet("Sheet2");
			int row=sheet.getLastRowNum();
			int cell=sheet.getRow(0).getLastCellNum();
			
			HashMap<String, String>hm=new HashMap<String ,String>();
			for(int r=0;r<row;r++)
			{
				for(int c=0;c<cell;c++) {
				String k=sheet.getRow(r).getCell(0).getStringCellValue();
				String v=sheet.getRow(r).getCell(1).getStringCellValue();
				hm.put(k, v);
				}
			}
			for(Map.Entry e:hm.entrySet())
				{
				System.out.println(e.getKey()+"  "+e.getValue());
			}
			
		}
	}

}
