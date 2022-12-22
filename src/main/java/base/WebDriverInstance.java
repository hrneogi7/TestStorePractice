package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class WebDriverInstance {
    public static ThreadLocal<WebDriver> webDriver = new ThreadLocal<>();

    public static WebDriver getDriver(){
        if(webDriver.get() == null){
            try {
                webDriver.set(createDriver());
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
        return webDriver.get();
    }

    public static WebDriver createDriver() throws IOException {
        WebDriver webDriver = null;

        Properties prop = new Properties();
        FileInputStream data = new FileInputStream( System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties");
        prop.load(data);

        if (prop.getProperty("browser").equals("chrome")) {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") +
                    "\\src\\main\\java\\drivers\\chromedriver.exe");
            webDriver = new ChromeDriver();
        } else if (prop.getProperty("browser").equals("firefox")) {
            System.setProperty("webdriver.gecko.driver",
                    System.getProperty("user.dir") + "\\src\\main\\java\\drivers\\chromedriver.exe");
            webDriver = new FirefoxDriver();
        } else {
            System.setProperty("webdriver.edge.driver", System.getProperty("user.dir") +
                    "\\src\\main\\java\\drivers\\msedgedriver.exe");
            webDriver = new EdgeDriver();
        }

        webDriver.manage().window().maximize();
        webDriver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        return webDriver;
    }

    public static void cleanupDriver() {
        webDriver.get().quit();
        webDriver.remove();
    }


}
