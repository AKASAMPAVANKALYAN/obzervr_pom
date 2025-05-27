package observr_pom;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener extends BaseClass implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
	    String methodName = result.getMethod().getMethodName();
	    String timestamp = new SimpleDateFormat("yyyyMMdd_HHmmss").format(new Date());
	    String screenshotPath = "./screenshot/" + methodName + "_FAILED_" + timestamp + ".png";

	    try {
	        Object testClass = result.getInstance();
	        WebDriver driver = ((BaseClass) testClass).driver;

	        TakesScreenshot ts = (TakesScreenshot) driver;
	        File src = ts.getScreenshotAs(OutputType.FILE);
	        File dest = new File(screenshotPath);
	        FileHandler.copy(src, dest);

	        ExtentReportManager.getTest()
	            .fail("Test failed: " + result.getThrowable().getMessage())
	            .addScreenCaptureFromPath(screenshotPath);

	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}

}
