package utility;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Reports {

	public static ExtentReports creatExtentReports() {
	ExtentReports reports = new ExtentReports();
	ExtentSparkReporter sparkReporter = new ExtentSparkReporter("extentreport.html");
	reports.attachReporter(sparkReporter);
	reports.setSystemInfo("createdBy", "seema");
	reports.setSystemInfo("TestSuits", "Regression");
	return reports;
}
}
