package Aug15th;

import org.testng.ITestContext;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class Demo_ExtentReport {
	ExtentSparkReporter htmlReporter;
	ExtentReports reports;
	ExtentTest test;
	 
	public void configReport() {
		htmlReporter=new ExtentSparkReporter("ExtentListenerReport.html");
		reports=new ExtentReports();
		reports.attachReporter(htmlReporter);
		
		//Environmental Details
		reports.setSystemInfo("Machine","TestMachine01");
		reports.setSystemInfo("Host","QA Engineer");
		reports.setSystemInfo("Browser","Chrome");
		reports.setSystemInfo("User","Vikas");
		reports.setSystemInfo("Operating System","windows 11");


		//configuration to change the lool and feel 
		htmlReporter.config().setDocumentTitle("Extent Report");
		htmlReporter.config().setReportName("Good html report");
		htmlReporter.config().setTheme(Theme.DARK);
		
		
		
		
	}
	public void onStart(ITestContext result )
	{
		configReport();
		System.out.println("this is on test start");
	}
	public void onFinished(ITestContext result)
	{
		System.out.println("On finish Method Invoked:::::::");
		reports.flush();
	}
	public void onTestStart(ITestResult result)
	{
		System.out.println("On TestStartMethod invoked:::::::::::");
		
	}
	public void onTestSuccess(ITestResult result)
	{
		System.out.println("OnTestSuccessMethod invoked"+result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.PASS,MarkupHelper.
				createLabel("Name of pass testMethod is "+result.getName(),ExtentColor.GREEN));
	}
	public void onTestFailure(ITestResult result)
	{
		System.out.println("Name of test method failure is :"+result.getName());
		test=reports.createTest(result.getName());
		test.log(Status.FAIL,MarkupHelper.
				createLabel("Name of failed test case is :"+result.getName(),ExtentColor.RED));
	}

}
