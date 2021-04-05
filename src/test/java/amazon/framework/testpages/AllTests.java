package amazon.framework.testpages;

import amazon.framework.drivermanager.DriverManager;
import amazon.framework.reports.EmailableReport;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.util.concurrent.TimeUnit;

public class AllTests {
    private WebDriver driver = DriverManager.getDriver();

    @BeforeSuite
    public void setUp() {
        driver.get("https://meet.voicemailtel.com/");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
    }

    @AfterSuite
    public void tearDown() throws InterruptedException {
        Thread.sleep(4000);
        EmailableReport.closeTest();
        driver.quit();
    }
}

