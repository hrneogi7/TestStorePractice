package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopSignInPage extends BasePage {
    public WebDriver webDriver;

    By emailField = By.xpath("//input[@name='email']");
    By passwordField = By.xpath("//input[@name='password']");
    By submitButton = By.xpath("//button[@id='submit-login']");

    public ShopSignInPage() throws IOException {
        super();
    }
    public WebElement getEmailField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(emailField);
    }
    public WebElement getPasswordField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(passwordField);
    }
    public WebElement getSubmitButton() throws IOException{
        this.webDriver = getWebDriver();
        return webDriver.findElement(submitButton);
    }
}
