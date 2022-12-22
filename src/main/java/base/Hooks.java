package base;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.io.IOException;

public class Hooks extends BasePage{
    public Hooks() throws IOException{
        super();
    }
    @BeforeTest
    public void setup() throws IOException{
        getWebDriver().get(getUrl());
    }

    @AfterTest
    public void teardown(){
        WebDriverInstance.cleanupDriver();
    }
}
