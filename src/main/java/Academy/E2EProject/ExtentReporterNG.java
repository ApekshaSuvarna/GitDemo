package Academy.E2EProject;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReporterNG {
	static ExtentReports finalReport;
	public static ExtentReports getReportObject() {
		String path = System.getProperty("user.dir") + "\\reports\\index.html";
		ExtentSparkReporter report = new ExtentSparkReporter(path);
		report.config().setReportName("Automation Results");
		report.config().setDocumentTitle("Test Results");

		finalReport = new ExtentReports();
		finalReport.attachReporter(report);
		finalReport.setSystemInfo("tester", "Apeksha");
		return finalReport;
		
	}

}
