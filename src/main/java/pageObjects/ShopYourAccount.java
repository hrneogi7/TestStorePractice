package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopYourAccount extends BasePage {
    public WebDriver webDriver;
    By yourAccount = By.cssSelector("h1");
    By signOut = By.linkText("\uE7FF Sign out");
    public ShopYourAccount() throws IOException {
        super();
    }
    public WebElement getYourAccount() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(yourAccount);
    }
    public WebElement getSignOut() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(signOut);
    }

}
