package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderPersonalInfo extends BasePage {
    public WebDriver webDriver;

    By genderMr = By.cssSelector("label:nth-of-type(1) > .custom-radio > input[name='id_gender']");
    By genderMrs = By.cssSelector("label:nth-of-type(2) > .custom-radio > input[name='id_gender']");
    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By emailField = By.cssSelector("form#customer-form > section input[name='email']");
    By passwordField = By.cssSelector("form#customer-form > section input[name='password']");
    By birthDateField = By.cssSelector("input[name='birthday']");
    By receiveOffersCheckbox = By.cssSelector("div:nth-of-type(7)  span > label > span");
    By newsletterCheckbox = By.cssSelector("div:nth-of-type(8)  span > label > span");
    By termsConditionsCheckbox = By.cssSelector("input[name='psgdpr']");
    By continueBtn = By.cssSelector("form#customer-form  button[name='continue']");

    public OrderPersonalInfo() throws IOException {
        super();
    }

    public WebElement getGenderMr() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(genderMr);
    }

    public WebElement getGenderMrs() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(genderMrs);
    }

    public WebElement getFirstNameField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(firstNameField);
    }

    public WebElement getLastnameField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(lastNameField);
    }

    public WebElement getEmailField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(emailField);
    }

    public WebElement getPasswordField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(passwordField);
    }

    public WebElement getBirthDateField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(birthDateField);
    }

    public WebElement getRecOfferCheckbox() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(receiveOffersCheckbox);
    }

    public WebElement getNewsletterCheckbox() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(newsletterCheckbox);
    }

    public WebElement getTermsConditionsCheckbox() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(termsConditionsCheckbox);
    }

    public WebElement getContinueBtn() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(continueBtn);
    }

}
