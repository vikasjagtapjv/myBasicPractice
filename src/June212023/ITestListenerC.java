package June212023;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class ITestListenerC extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		captureScreenshot(result.getTestName()+".jpg");
		
	}
	

}
