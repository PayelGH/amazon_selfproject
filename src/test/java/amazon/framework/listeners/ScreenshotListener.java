package amazon.framework.listeners;
import amazon.framework.utils.CoreUtils;
import amazon.framework.utils.StatusEnum;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class ScreenshotListener implements ITestListener {

    @Override
    public void onTestStart(ITestResult iTestResult) {

    }
    @Override
    public void onTestSuccess(ITestResult iTestResult) {
        CoreUtils.captureScreenshot(iTestResult.getName(), StatusEnum.PASS);
    }

    @Override
    public void onTestFailure(ITestResult iTestResult) {
        CoreUtils.captureScreenshot(iTestResult.getName(), StatusEnum.FAIL);

    }
    @Override
    public void onTestSkipped(ITestResult iTestResult) {

    }
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }
    @Override
    public void onStart(ITestContext iTestContext) {
    }
    @Override
    public void onFinish(ITestContext iTestContext) {

    }
}
