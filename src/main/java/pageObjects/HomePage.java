package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;


public class HomePage extends BasePage {
    public WebDriver webDriver;

    By toggle = By.xpath("//div[@id=\"sidebar\"]/a[@href=\"#sidebar\"]");
    By homepageLink = By.linkText("HOMEPAGE");
    By accordionLink = By.linkText("ACCORDION");
    By browserTabLink = By.linkText("BROWSER TABS");
    By buttonsLink = By.linkText("BUTTONS");
    By calcLink = By.linkText("CALCULATOR (JS)");
    By contactUsLink = By.linkText("CONTACT US FORM TEST");
    By datePickerLink = By.linkText("DATE PICKER");
    By dropdownLink = By.linkText("DROPDOWN CHECKBOX & RADIO");
    By fileUpload = By.linkText("FILE UPLOAD");
    By hiddenElementsLink = By.linkText("HIDDEN ELEMENTS");
    By iFrameLink = By.linkText("IFRAME");
    By loaderLink = By.linkText("LOADER");
    By loginPortalLink = By.linkText("LOGIN PORTAL TEST");
    By mouseLink = By.linkText("MOUSE MOVEMENT");
    By popupLink = By.linkText("POP UPS & ALERTS");
    By predictiveLink = By.linkText("PREDICTIVE SEARCH");
    By tablesLink = By.linkText("TABLES");
    By testStoreLink = By.linkText("TEST STORE");
    By aboutMeLink = By.linkText("ABOUT ME");
    By signInButton = By.cssSelector("div#_desktop_user_info .hidden-sm-down");
    By alertMessage = By.cssSelector(".alert.alert-danger");

    public HomePage() throws IOException {
        super();
    }
    public WebElement getToggle() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(toggle);
    }
    public WebElement getHomepageLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(homepageLink);
    }
    public WebElement getAccordionLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(accordionLink);
    }
    public WebElement getBrowserTabLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(browserTabLink);
    }

    public WebElement getButtonLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(buttonsLink);
    }

    public WebElement getCalcLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(calcLink);
    }

    public WebElement getContactUsLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(contactUsLink);
    }

    public WebElement getDatePickerLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(datePickerLink);
    }

    public WebElement getDropdownLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(dropdownLink);
    }

    public WebElement getFileUploadLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(fileUpload);
    }

    public WebElement getHiddenElementsLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(hiddenElementsLink);
    }

    public WebElement getIframeLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(iFrameLink);
    }

    public WebElement getLoaderLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(loaderLink);
    }

    public WebElement getLoginPortalLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(loginPortalLink);
    }

    public WebElement getMouseLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(mouseLink);
    }

    public WebElement getPopupLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(popupLink);
    }

    public WebElement getPredictiveLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(predictiveLink);
    }

    public WebElement getTablesLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(tablesLink);
    }

    public WebElement getTestStoreLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(testStoreLink);
    }

    public WebElement getAboutMeLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(aboutMeLink);
    }


}
