package amazon.framework.reports;
import amazon.framework.utils.CoreUtils;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class EmailableReport {

        private static EmailableReport instance;
        private ExtentReports extentReports;
        private EmailableReport() {
            extentReports = new ExtentReports();
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(CoreUtils.generateReportFileName());
            extentReports.attachReporter(htmlReporter);
        }

        public static ExtentTest createTest(String testName){
            if(instance== null) {
                instance = new EmailableReport();
            }
            return instance.extentReports.createTest(testName);
        }
        public static void closeTest(){
            if(instance!=null){
                instance.extentReports.flush();
            }
        }
    }


