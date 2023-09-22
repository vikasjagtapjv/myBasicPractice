package Selenium2;

import java.io.FileInputStream;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class FBRadioButton {
	WebDriver driver;
	@BeforeMethod
	public void setup() 
	{
		System.setProperty("webdriver.chrome.driver","C:\\chromedriver_win32 (3)\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(60,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		WebElement text=driver.findElement(By.xpath("//a[@data-testid='open-registration-form-button']"));
		text.click();
		
	}
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
	
	@Test(dataProvider="getData")
	public void inputData(String Username,String Surname,String eMail,String password)
	{
		WebElement userName=driver.findElement(By.xpath("//input[@aria-label='First name']"));
		userName.sendKeys(Username);
		
		WebElement surname=driver.findElement(By.xpath("//input[@name='lastname']"));
		surname.sendKeys(Surname);
		
		WebElement mail=driver.findElement(By.xpath("//input[@name='reg_email__']"));
		mail.sendKeys(eMail);
		
		WebElement pass=driver.findElement(By.xpath("//input[@name='reg_passwd__']"));
		pass.sendKeys(password);
		
	}
	@DataProvider(name="getData")
	public Object[][] searchData()
	{
	String fileName="F:\\Salary-Slip.xlsx";
	Object[][] Data=getData(fileName,"Sheet2");
	return Data;
		
	}
	
	public String[][] getData(String fileName,String sheetName){
		String[][] data=null;
		try {
			FileInputStream inputStream=new FileInputStream(fileName);
			//CREATE XSSFWorkBook Class for excel file Manipulation
			XSSFWorkbook workBook=new XSSFWorkbook(inputStream);
			
			XSSFSheet excelSheet=workBook.getSheet(sheetName);
			//Total Number of rows
			int ttlRows=excelSheet.getLastRowNum()+1;
			
			//total Number of cell
			int ttlCell=excelSheet.getRow(0).getLastCellNum();
			//initialize array
			data=new String[ttlRows-1][ttlCell];
			
			for(int currentRow=1;currentRow<ttlRows;currentRow++) 
			{
				
				for(int currentCell=0;currentCell<ttlCell;currentCell++) 
				{
					data[currentRow-1][currentCell]=excelSheet.
							getRow(currentRow).getCell(currentCell).
							getStringCellValue();
					
				}
			}
			
			
			
			
			workBook.close();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}
	@Test
	public void day()
	{
		WebElement days=driver.findElement(By.xpath("//select[@id='day']"));
		Select Day= new Select(days);
		Day.selectByIndex(9);
	}
	@Test
	public void month()
	{
		WebElement months=driver.findElement(By.xpath("//select[@id='month']"));
		Select Month= new Select(months);
		Month.selectByValue("12");
		
	}
	@Test
	public void year()
	{
		WebElement Year=driver.findElement(By.xpath("//select[@id='year']"));
		Select Years= new Select(Year);
		Years.selectByVisibleText("2013");
		
	}
	@Test
	public void radio() 
	{
	List<WebElement>radios=driver.findElements(By.xpath("//input[@type='radio']"));
	System.out.println("Number of Raadios button:-"+radios.size());
	System.out.println(radios.get(0).isDisplayed());
	System.out.println(radios.get(2).isEnabled());
	System.out.println(radios.get(1).isSelected());
	//Thread.sleep(3000);
	radios.get(0).click();
	//Thread.sleep(3000);
	System.out.println(radios.get(0).isSelected());
	
		
	}

}
