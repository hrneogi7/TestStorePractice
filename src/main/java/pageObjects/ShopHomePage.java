package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopHomePage extends BasePage {
    public WebDriver webDriver;

    By productOne = By.linkText("Hummingbird Printed T-Shirt");
    By productTwo = By.linkText("Hummingbird Printed Sweater");
    By productThree = By.linkText("The Best Is Yet To Come'...");
    By productFour = By.linkText("The adventure begins Framed...");
    By productFive = By.linkText("Today is a good day Framed...");
    By productSix = By.linkText("Mug The best is yet to come");
    By productSeven = By.linkText("Mug The adventure begins");
    By productEight = By.linkText("Mug Today is a good day");
    By signInButton = By.cssSelector("div#_desktop_user_info .hidden-sm-down");
    By alertMessage = By.cssSelector(".alert.alert-danger");

    public ShopHomePage() throws IOException {
        super();
    }
    public WebElement getProductOne() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productOne);
    }
    public WebElement getProductTwo() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productTwo);
    }
    public WebElement getProductThree() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productThree);
    }
    public WebElement getProductFour() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productFour);
    }
    public WebElement getProductFive() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productFive);
    }
    public WebElement getProductSix() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productSix);
    }
    public WebElement getProductSeven() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productSeven);
    }
    public WebElement getProductEight() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(productEight);
    }
    public WebElement getSignInButton() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(signInButton);
    }
    public WebElement getAlertMessage() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(alertMessage);
    }

}
