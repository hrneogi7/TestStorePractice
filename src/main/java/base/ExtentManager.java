package base;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtentManager extends BasePage{
    public static ExtentReports extentReports;
    public static String extentReportsPrefix;
    public static ThreadLocal<ExtentTest> extentTestThreadLocal = new ThreadLocal<>();
    public ExtentManager() throws IOException {
        super();
    }

    public static ExtentReports getExtentReports(){
        if(extentReports == null){
            setupExtentReport("Live Project 1");
        }
        return extentReports;
    }

    public static ExtentReports setupExtentReport(String testName) {
        extentReports = new ExtentReports();
        ExtentSparkReporter sparkReporter = new ExtentSparkReporter(System.getProperty("user.dir")
        + "\\report\\" + extentReportsPrefixName(testName) + ".html");
        extentReports.attachReporter(sparkReporter);

        extentReports.setSystemInfo("Tester", "Hrithik");
        sparkReporter.config().setReportName("Regression Test");
        sparkReporter.config().setDocumentTitle("Test Results");
        sparkReporter.config().setTheme(Theme.DARK);

        return extentReports;
    }

    public static String extentReportsPrefixName(String testName) {
        String date = new SimpleDateFormat("yyyy-MM-dd_HH-mm-ss").format(new Date());
        extentReportsPrefix = testName + "_" + date;
        return extentReportsPrefix;
    }

    public static void flushReport() {
        extentReports.flush();
    }

    public synchronized static ExtentTest getTest() {
        return extentTestThreadLocal.get();
    }

    public synchronized static ExtentTest createTest(String name, String description) {
        ExtentTest test = extentReports.createTest(name, description);
        extentTestThreadLocal.set(test);
        return getTest();
    }

    public synchronized static void log(String message) {
        getTest().info(message);
    }

    public synchronized static void pass(String message) {
        getTest().pass(message);
    }

    public synchronized static void fail(String message) {
        getTest().fail(message);
    }

    public synchronized static void attachImage() {
        getTest().addScreenCaptureFromPath(getScreenshotDestinationPath());
    }

}
