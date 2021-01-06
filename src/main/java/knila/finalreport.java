package knila;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class finalreport {

	static	ExtentReports extent;
	public static ExtentReports config()
	{
	String path=System.getProperty("user.dir")+"\\reports\\index.html";
	ExtentSparkReporter rep=new ExtentSparkReporter(path);
	rep.config().setReportName("web automation result");
	rep.config().setDocumentTitle("test result");
	
	 extent=new ExtentReports();
	extent.attachReporter(rep);
	extent.setSystemInfo("tester", "krishnamoorhty");
	return extent;
}
}