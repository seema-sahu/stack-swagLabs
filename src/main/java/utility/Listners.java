package utility;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listners extends BaseClass implements ITestListener{
	
	public void onTestStart(ITestResult result) {
		System.err.println(" Test Started " +  result.getName());   	
    } 

	public void onTestSuccess(ITestResult result) {
    	System.out.println(" Test is Passed "  + result.getName());
    }
    
    public void onTestFailure(ITestResult result) {
    	System.out.println(" Test is Failed " + result.getName());
    	try
    	{		
    	Screenshot.clickSS(driver,result.getName());  		
		}
    	catch (IOException e)
    	{			
		e.printStackTrace();			
		}
}  
    public void onTestSkipped(ITestResult result){
    
    	System.out.println(" Test is Skipped " + result.getName());
    }
}

