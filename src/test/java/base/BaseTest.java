package base;

import java.lang.reflect.Method;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import utils.DriverFactory;
import utils.ExtentManager;
import utils.ScreenshotUtils;

public class BaseTest {

    public WebDriver driver;

    public static ExtentReports extent;

    public ExtentTest test;

    @BeforeSuite
    public void setupReport() {

        extent = ExtentManager.getReport();
    }

    @BeforeMethod
    public void setup(Method method) {

        driver = DriverFactory.initDriver();

        driver.manage().window().maximize();

        driver.manage()
                .timeouts()
                .implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/");

        test = extent.createTest(method.getName());
    }

    @AfterMethod
    public void tearDown(ITestResult result)
            throws Exception {

        if (result.getStatus() == ITestResult.FAILURE) {

            String path =
                    ScreenshotUtils.capture(
                            driver,
                            result.getName());

            test.fail("Test Failed");

            test.addScreenCaptureFromPath(path);

        } else {

            test.pass("Test Passed");
        }

        driver.quit();
    }

    @AfterSuite
    public void endReport() {

        extent.flush();
    }
}