package test;

import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import pojo.Browser;
import pom.Login_page;
import utility.BaseClass;
import utility.Screenshot;
import utility.parametrization;
import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;

@Listeners(utility.Listners.class)
public class SwagLabLoginTest extends BaseClass {
	ExtentReports reports;
	ExtentTest test;
	
	@BeforeTest
	public void configureReports() {
		reports = new ExtentReports();
	}
	@BeforeMethod
	public void openBrowser() {
		driver= Browser.launchChrome();	
	}  
	@Test
	private void swagLabLoginTest() throws EncryptedDocumentException, IOException {
		Login_page login_page = new Login_page(driver);
		String un =parametrization.getExcelData("Credentials", 1, 0);
		String pw =parametrization.getExcelData("Credentials", 1, 1);
		login_page.enteruserName(un);
		login_page.enterPassword(pw);
		login_page.clickOnlogin();
		String Expectedurl = "https://www.saucedemo.com/inventory.html";
		String ActualUrl= driver.getCurrentUrl();
		Assert.assertNotEquals(ActualUrl, Expectedurl);
		Screenshot.clickSS(driver, "SwagLabs- ");
		}
	
	@AfterMethod
	public void publishResult(ITestResult result) {
	if(result.getStatus()==ITestResult.SUCCESS)
	{
		test.log(Status.PASS,result.getName() );
	}
	else if (result.getStatus()==ITestResult.FAILURE)
	{
		test.log(Status.FAIL,result.getName() );
	}
	else
	{
		test.log(Status.SKIP,result.getName() );
	}
}
@AfterTest
public void createReport() {
	reports.flush();
}
}
