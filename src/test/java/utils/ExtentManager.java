package utils;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    public static ExtentReports getReport() {

        ExtentSparkReporter reporter =
                new ExtentSparkReporter("reports/report.html");

        reporter.config().setReportName("OrangeHRM Automation Report");

        ExtentReports extent = new ExtentReports();

        extent.attachReporter(reporter);

        return extent;
    }
}