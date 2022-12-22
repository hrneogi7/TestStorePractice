package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderPayment extends BasePage {
    public WebDriver webDriver;

    By payByCheck = By.xpath("//span[.='Pay by Check']");
    By payByWire = By.xpath("//span[.='Pay by bank wire']");
    By termsAndConditions = By.xpath("//input[@id='conditions_to_approve[terms-and-conditions]']");
    By orderBtn = By.xpath("//div[@id='payment-confirmation']//button[@type='submit']");

    public OrderPayment() throws IOException {
        super();
    }

    public WebElement getPayByCheckRadioBtn() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(payByCheck);
    }

    public WebElement getPayByWireRadioBtn() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(payByWire);
    }

    public WebElement getTermsConditionsCheckbox() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(termsAndConditions);
    }

    public WebElement getOrderBtn() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(orderBtn);
    }
}
