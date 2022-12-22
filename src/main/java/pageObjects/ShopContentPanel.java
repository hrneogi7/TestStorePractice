package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopContentPanel extends BasePage {
    public WebDriver webDriver;

    By proceedToCheckOut = By.linkText("\uE876PROCEED TO CHECKOUT");
    By continueShopping = By.xpath("//button[contains(text(),'Continue')]");

    public ShopContentPanel() throws IOException {
        super();
    }

    public WebElement getProceedToCheckOut() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(proceedToCheckOut);
    }
    public WebElement getContinueShopping() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(continueShopping);
    }
}
