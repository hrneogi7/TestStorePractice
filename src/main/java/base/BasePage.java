package base;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

//import static jdk.jfr.internal.handlers.EventHandler.timestamp;

public class BasePage {
    private String url;
    private Properties properties;
    public static String screenShotDestinationPath;

    public BasePage() throws IOException{
        properties = new Properties();

        FileInputStream loadData = new FileInputStream(System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
        properties.load(loadData);
    }

    public static WebDriver getWebDriver() throws IOException{
        return WebDriverInstance.getDriver();
    }

    public String getUrl() throws IOException{
        url = properties.getProperty("url");
        return url;
    }

    public static String takeSnapshot(String name) throws IOException{
        File sourceFile = ((TakesScreenshot)getWebDriver()).getScreenshotAs(OutputType.FILE);

        String destinationFile = System.getProperty("user.dir") + "\\Screenshots\\"
        + timestamp() + ".png";
        screenShotDestinationPath = destinationFile;

        try {
            FileUtils.copyFile(sourceFile, new File(destinationFile));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return name;
    }

    public static String timestamp() {
        return new SimpleDateFormat("yyyy-MM-DD hh-mm-ss").format(new Date());
    }
    public static String getScreenshotDestinationPath() {
        return screenShotDestinationPath;
    }
    public static void waitForElementInvisibleBy(WebElement webElement,int timer) throws IOException {
        WebDriverWait wait = new WebDriverWait(getWebDriver(),timer);
        wait.until(ExpectedConditions.invisibilityOf(webElement));
    }
}
