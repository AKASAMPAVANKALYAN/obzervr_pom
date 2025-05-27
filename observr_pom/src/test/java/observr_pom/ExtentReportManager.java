package observr_pom;

import com.aventstack.extentreports.*;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReportManager {

    private static ExtentReports extent;
    private static ExtentTest test;

    static {
        ExtentSparkReporter spark = new ExtentSparkReporter("./reports/ExtentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(spark);
        extent.setSystemInfo("Project", "Observr Automation");
        extent.setSystemInfo("Environment", "QA");
        extent.setSystemInfo("Tester", "pavan");
    }

    public static void createTest(String testName) {
        test = extent.createTest(testName);
    }

    public static ExtentTest getTest() {
        return test;
    }

    public static void flush() {
        extent.flush();
    }
}
