package Aug15th;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class ExtentReport implements ITestListener {
	ExtentSparkReporter htmlReporter;
	ExtentReports reporter;
	ExtentTest test;
	
	public void configReport()
	{
		htmlReporter=new ExtentSparkReporter("ExtentListenerReport.html");
		reporter=new ExtentReports();
		reporter.attachReporter(htmlReporter);
		
		//Environmental details
		reporter.setSystemInfo("machine", "testPc01");
		reporter.setSystemInfo("Host","QA Engineer");
		reporter.setSystemInfo("User","Vikas jagtap");
		reporter.setSystemInfo("Browser","Chrome");
		reporter.setSystemInfo("Operating System","Windows 11");
		
		
		//Configuration to change look and feel
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setReportName("Report");
		htmlReporter.config().setTheme(Theme.DARK);
	}
	public void onStart(ITestContext result)
	{
		configReport();
		System.out.println("On Start Method Invoked::::::");
	}
	public void onFinish(ITestContext result)
	{
		System.out.println("On finish Method Invoked:::::::");
		reporter.flush();
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("Name of the test method  Started:"+result.getName());
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Name of test method failure is :"+result.getName());
		test=reporter.createTest(result.getName());
		test.log(Status.FAIL, MarkupHelper
				.createLabel("Name of failed test case is : "+result.getName(),ExtentColor.RED));
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("Name of test method Success is :"+result.getName());
		test=reporter.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper
				.createLabel("Name of pass test method is :"+result.getName(),ExtentColor.GREEN));
		
	}
	public void onTestSkipped(ITestResult result)
	{
		System.out.println("Name of test method Skipped is :"+result.getName());
		test=reporter.createTest(result.getName());
		test.log(Status.SKIP,MarkupHelper
				.createLabel("Name of Skipped test method is :"+result.getName(),ExtentColor.YELLOW));
	}
	

}
