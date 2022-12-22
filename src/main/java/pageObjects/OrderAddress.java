package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderAddress extends BasePage {
    public WebDriver webDriver;

    By firstNameField = By.cssSelector("input[name='firstname']");
    By lastNameField = By.cssSelector("input[name='lastname']");
    By companyNameField = By.cssSelector("input[name='company']");
    By addressField = By.cssSelector("input[name='address1']");
    By addressComplementField = By.cssSelector("input[name='address2']");
    By cityField = By.cssSelector("input[name='city']");
    By stateDropdown = By.cssSelector("select[name='id_state']");
    By postcodeField = By.cssSelector("input[name='postcode']");
    By countryDropdown = By.cssSelector("select[name='id_country']");
    By phoneField = By.cssSelector("input[name='phone']");
    By invoiceSameAddCheckboc = By.cssSelector("input#use_same_address");
    By continueBtn = By.cssSelector("button[name='confirm-addresses']");

    public OrderAddress() throws IOException {
        super();
    }

    public WebElement getFirstNameField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(firstNameField);
    }

    public WebElement getLastnameField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(lastNameField);
    }

    public WebElement getCompanyField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(companyNameField);
    }

    public WebElement getAddressField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(addressField);
    }

    public WebElement getAddressCompField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(addressComplementField);
    }

    public WebElement getCityField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(cityField);
    }

    public WebElement getStateDropdown() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(stateDropdown);
    }

    public WebElement getPostcodeField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(postcodeField);
    }

    public WebElement getCountryDropdown() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(countryDropdown);
    }

    public WebElement getPhoneField() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(phoneField);
    }

    public WebElement getInvoiceSameAddCheckbox() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(invoiceSameAddCheckboc);
    }

    public WebElement getContinueBtn() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(continueBtn);
    }

}
