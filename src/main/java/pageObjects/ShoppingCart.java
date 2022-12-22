package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShoppingCart extends BasePage {
    public WebDriver webDriver;

    By havePromoCode = By.linkText("Have a promo code?");
    By promoCode = By.xpath("//input[@name='discount_name']");
    By promoAddButton = By.cssSelector("form[method='post'] span");
    By proceedToCheckOut = By.linkText("PROCEED TO CHECKOUT");
    By cartTotal = By.cssSelector(".cart-total  .value");
    By deleteItemOne = By.cssSelector(".cart-items .cart-item:nth-of-type(1) .float-xs-left");
    By deleteItemTwo = By.cssSelector(".cart-items .cart-item:nth-of-type(2) .float-xs-left");

    public ShoppingCart() throws IOException {
        super();
    }

    public WebElement getHavePromoCode() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(havePromoCode);
    }
    public WebElement getPromoCode() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(promoCode);
    }
    public WebElement getPromoAddButton() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(promoAddButton);
    }
    public WebElement getProceedToCheckOut() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(proceedToCheckOut);
    }
    public WebElement getCartTotal() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(cartTotal);
    }
    public WebElement getDeleteItem1() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(deleteItemOne);
    }
    public WebElement getDeleteItem2() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(deleteItemTwo);
    }

}
