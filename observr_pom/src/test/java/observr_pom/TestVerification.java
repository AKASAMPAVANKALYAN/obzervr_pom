package observr_pom;

import java.io.File;

import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.aventstack.extentreports.Status;

@Listeners(observr_pom.TestListener.class)
public class TestVerification extends BaseClass  {

    @Test(priority = 0)
    public void verifyTitleAndLogo() throws IOException {
        ExtentReportManager.createTest("Verify Title and Logo");

        String actualTitle = driver.getTitle();
        ExtentReportManager.getTest().log(Status.INFO, "Actual Title: " + actualTitle);
        ExtentReportManager.getTest().log(Status.INFO, "Expected Title: " + expectedTitle);
        Assert.assertEquals(actualTitle, expectedTitle, "page title does not match!");
        ExtentReportManager.getTest().pass("Title matches.");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.isLogoDisplayed());
        ExtentReportManager.getTest().pass("Logo is displayed.");
    }

    @Test(priority = 1)
    public void verifyscreenshot_maintext() throws IOException {
        ExtentReportManager.createTest("Verify Screenshot and Main Text");

        TakesScreenshot ts = (TakesScreenshot) driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File dest = new File("./screenshot/homepage.png");
        FileHandler.copy(src, dest);
        ExtentReportManager.getTest().pass("Screenshot taken.");

        HomePage homePage = new HomePage(driver);
        String actualtext = homePage.getMainText();
        String expectedtext = "Digital Work Management Solution For Asset-Intensive Industries";
        Assert.assertEquals(actualtext, expectedtext);
        ExtentReportManager.getTest().pass("Main text matches.");
        
    }

    @Test(priority = 2)
    public void verifyvideobtn_loadmorebtn_booksession() {
        ExtentReportManager.createTest("Verify Buttons: Video, Load More, Book Session");

        HomePage homePage = new HomePage(driver);
        if (homePage.getvideobtn().isEnabled()) {
            homePage.getvideobtn().click();
            ExtentReportManager.getTest().pass("Video button clicked.");
        }
        Assert.assertTrue(homePage.loadmorebtnenabled());
        ExtentReportManager.getTest().pass("Load more button is enabled.");

        Assert.assertTrue(homePage.getbooksession().isEnabled());
        ExtentReportManager.getTest().pass("Book session button is enabled.");
    }

    @Test(priority = 3)
    public void industry() {
        ExtentReportManager.createTest("Verify Industry Links");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.manufacturingenebled());
        ExtentReportManager.getTest().pass("Manufacturing link is enabled.");

        Assert.assertTrue(homePage.miningenebled());
        ExtentReportManager.getTest().pass("Mining link is enabled.");

        Assert.assertTrue(homePage.oilandgasenebled());
        ExtentReportManager.getTest().pass("Oil and Gas link is enabled.");

        Assert.assertTrue(homePage.railenebled());
        ExtentReportManager.getTest().pass("Rail link is enabled.");

        Assert.assertTrue(homePage.bulkingportsenebled());
        ExtentReportManager.getTest().pass("Bulk Ports link is enabled.");
    }

    @Test(priority = 4)
    public void solutions() {
        ExtentReportManager.createTest("Verify Solution Links");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.assesenebled());
        ExtentReportManager.getTest().pass("Assess Maintenance enabled.");

        Assert.assertTrue(homePage.safetyenable());
        ExtentReportManager.getTest().pass("Safety enabled.");

        Assert.assertTrue(homePage.inspectionsenabled());
        ExtentReportManager.getTest().pass("Inspections enabled.");

        Assert.assertTrue(homePage.complainsenebled());
        ExtentReportManager.getTest().pass("Complaints enabled.");

        Assert.assertTrue(homePage.bussinessenabled());
        ExtentReportManager.getTest().pass("Business Intelligence enabled.");
    }

    @Test(priority = 5)
    public void product() {
        ExtentReportManager.createTest("Verify Product Links");

        HomePage homePage = new HomePage(driver);
        Assert.assertTrue(homePage.featuresenabled());
        ExtentReportManager.getTest().pass("Features enabled.");

        Assert.assertTrue(homePage.securityenebled());
        ExtentReportManager.getTest().pass("Security enabled.");

        Assert.assertTrue(homePage.integrationenabled());
        ExtentReportManager.getTest().pass("Integration enabled.");

        Assert.assertTrue(homePage.templatesenebled());
        ExtentReportManager.getTest().pass("Templates enabled.");
    }

    @Test(priority = 6)
    public void others() {
        ExtentReportManager.createTest("Verify Other Footer Links");

        HomePage homePage = new HomePage(driver);
        

        Assert.assertTrue(homePage.googpalyenebled());
        ExtentReportManager.getTest().pass("Google Play enabled.");

        Assert.assertTrue(homePage.winstoreenabled());
        ExtentReportManager.getTest().pass("Windows Store enabled.");

        Assert.assertTrue(homePage.appleplayenebled());
        ExtentReportManager.getTest().pass("Apple Store enabled.");

        Assert.assertTrue(homePage.termsenabled());
        ExtentReportManager.getTest().pass("Terms enabled.");

        Assert.assertTrue(homePage.privacyenabled());
        ExtentReportManager.getTest().pass("Privacy Policy enabled.");

        Assert.assertTrue(homePage.youtubeenebled());
        ExtentReportManager.getTest().pass("YouTube enabled.");

        Assert.assertTrue(homePage.linkedenabled());
        ExtentReportManager.getTest().pass("LinkedIn enabled.");
    }
}
