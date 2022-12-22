package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class OrderShipping extends BasePage {
    public WebDriver webDriver;

    By deliveryMsgTextbox = By.cssSelector("textarea#delivery_message");
    By continueBtn = By.cssSelector("[name='confirmDeliveryOption']");

    public OrderShipping() throws IOException {
        super();
    }

    public WebElement getDeliveryMsgTextbox() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(deliveryMsgTextbox);
    }

    public WebElement getContinueBtn() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(continueBtn);
    }
}
