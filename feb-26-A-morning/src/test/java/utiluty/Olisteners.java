package utiluty;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import test.OMainBrowser;


public class Olisteners extends OMainBrowser implements ITestListener{
	
	OScreenshot obj1;
	public void onTestFailure(ITestResult result) {
		obj1=new OScreenshot();
		try {
			obj1.takeScreenshot(driver,result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
