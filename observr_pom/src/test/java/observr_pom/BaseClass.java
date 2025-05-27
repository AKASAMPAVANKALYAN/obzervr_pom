package observr_pom;

import java.io.FileInputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.*;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

    public WebDriver driver;
    public Workbook workbook;
    public String expectedTitle;
    public String url;

    @BeforeClass
    public void setupBrowser() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        FileInputStream fis = new FileInputStream("./excelfiles/observr.xlsx");
        workbook = WorkbookFactory.create(fis);
        expectedTitle = workbook.getSheet("sheet1").getRow(0).getCell(1).getStringCellValue();
        url = workbook.getSheet("sheet1").getRow(1).getCell(1).getStringCellValue();

        ExtentReportManager.createTest("Observr Test Suite");
    }

    @BeforeMethod
    public void navigateToURL() {
        driver.get(url);
    }

    @AfterClass
    public void quitbrowser() {
        driver.quit();
        ExtentReportManager.flush();
    }
	public void onTestFailure(ITestResult result) {
		
	}
}
