package observr_pom;

import java.io.File;
import java.io.IOException;

import javax.print.attribute.SetOfIntegerSyntax;

import org.apache.hc.core5.reactor.Command.Priority;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestVerification extends BaseClass {

	@Test(priority = 0)
	public void verifyTitleAndLogo() throws IOException, InterruptedException {
		// 1. Verify Title
		String actualTitle = driver.getTitle();
		System.out.println("Expected Title: " + expectedTitle);
		System.out.println("Actual Title: " + actualTitle);
		Assert.assertEquals(actualTitle, expectedTitle, "Title does not match!");

		// 2. Verify Logo, menu btn
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.isLogoDisplayed(), "Logo is not visible!");
		System.out.println("logo verifyed");
		

	}

	@Test(priority = 1)
	public void verifyscreenshot_maintext() throws IOException, InterruptedException {

		// 3. Take Screenshot
		TakesScreenshot ts = (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);

		File per = new File("./screenshot/homepage.png");
		FileHandler.copy(temp, per);

		System.out.println("page loaded successful");
		

		// 4. main text element
		HomePage homePage = new HomePage(driver);
		String actualtext = homePage.getMainText();
		String expectedtext = "Digital Work Management Solution For Asset-Intensive Industries";

		Assert.assertEquals(actualtext, expectedtext, "Main text do not match");
		
	}

	@Test(priority = 2)
	public void verifyvideobtn_loadmorebtn_booksession() throws InterruptedException {

		HomePage homePage = new HomePage(driver);
		if (homePage.getvideobtn().isEnabled()) {
			System.out.println("Clicking on Video Button");
			homePage.getvideobtn().click();
		} else {
			System.out.println("Video button not available");
		}
		
		
Assert.assertTrue(homePage.loadmorebtnenabled(), expectedTitle);


		System.out.println("load more btn enabled");

		if (homePage.getbooksession().isEnabled()) {
			System.out.println("book session is enebled");
		} else {
			System.out.println("book session is not enebled");
		}

	}

	@Test(priority = 3)
	public void industry() throws InterruptedException {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.manufacturingenebled(), "maunfacturing is not enabled");
		System.out.println("manufacturing is enabled");

		Assert.assertTrue(homePage.miningenebled(), "mining is not enabled");
		System.out.println("mining enabled");

		Assert.assertTrue(homePage.oilandgasenebled(), "oil and gas is not enabled");
		System.out.println("oil and gas enebled");

		Assert.assertTrue(homePage.railenebled(), "rail is not enabled");
		System.out.println("rail enebled");

		Assert.assertTrue(homePage.bulkingportsenebled(), "maunfacturing is not enabled");
		System.out.println("bulking ports enebled");

	}
	
	@Test(priority = 4)
	public void solutions() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.assesenebled(), "assesmaintainance is not enabled");
		System.out.println("assesmaintainance is enabled");
		
		Assert.assertTrue(homePage.safetyenable(), "safety is not enabled");
		System.out.println("safety is enabled");
		
		Assert.assertTrue(homePage.inspectionsenabled(), "inspection is not enabled");
		System.out.println("inspection is enabled");
		
		Assert.assertTrue(homePage.complainsenebled(), "complains is not enabled");
		System.out.println("complains is enabled");
		
		Assert.assertTrue(homePage.bussinessenabled(), "bussiness intelligence is not enabled");
		System.out.println("bussiness intelligence");
	}

	@Test(priority = 5)
	public void product() {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.featuresenabled(), "features is not enabled");
		System.out.println("features is enabled");
		
		Assert.assertTrue(homePage.securityenebled(), "security is not enabled");
		System.out.println("security is enabled");
		
		Assert.assertTrue(homePage.integrationenabled(), "integration is not enabled");
		System.out.println("integration is enabled");
		
		Assert.assertTrue(homePage.templatesenebled(), "templates is not enabled");
		System.out.println("templates is enabled");
	}
	
	@Test(priority = 6)
	public void others () {
		HomePage homePage = new HomePage(driver);
		Assert.assertTrue(homePage.blogenabled(), "blog is not enabled");
		System.out.println("blog is enabled");
		
		Assert.assertTrue(homePage.googpalyenebled(), "googleplay is not enabled");
		System.out.println("google play is enabled");
		
		Assert.assertTrue(homePage.winstoreenabled(), "windows store is not enabled");
		System.out.println("windows store is enabled");
		
		Assert.assertTrue(homePage.appleplayenebled(), "apple store is not enabled");
		System.out.println("apple store is enabled");
		
		Assert.assertTrue(homePage.termsenabled(), "terms is not enabled");
		System.out.println("terms is enabled");
		
		Assert.assertTrue(homePage.privacyenabled(), "piracy is not enabled");
		System.out.println("piracy is enabled");
		
		Assert.assertTrue(homePage.youtubeenebled(), "youtube is not enabled");
		System.out.println("youtube is enabled");
		
		Assert.assertTrue(homePage.linkedenabled(), "linkedin is not enabled");
		System.out.println("inkedin is enabled");
	}
}