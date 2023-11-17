package Bank;

import org.testng.ITestListener;

public class Listeners implements ITestListener{
	
	public void onTestFailure(ITestListener result) {
		
	}
	public void onTestSuccess(ITestListener result) {
		System.out.println("test pass");
	}
}
