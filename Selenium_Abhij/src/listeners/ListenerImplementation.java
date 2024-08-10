package listeners;

import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		Reporter.log("Test Script is failed",true);
	}
	

}
