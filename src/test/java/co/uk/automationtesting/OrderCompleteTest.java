package co.uk.automationtesting;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.*;

import java.io.IOException;
@Listeners(resources.Listeners.class)

public class OrderCompleteTest extends Hooks {
    public OrderCompleteTest() throws IOException {
        super();
    }


    @Test
    public void endtoendtest() throws InterruptedException, IOException {
 //       HomePage homePage = new HomePage(webDriver);
//        homePage.getToggle().click();
//        homePage.getTestStoreLink().click();

        ExtentManager.log("Starting end to end test......");

        ShopHomePage shopHomePage = new ShopHomePage();
        shopHomePage.getProductOne().click();

        ShopProductPage shopProductPage = new ShopProductPage();
        Select option = new Select(shopProductPage.getSizeOption());
        option.selectByVisibleText("L");

        shopProductPage.getQuantityIncrease().click();
        shopProductPage.getAddToCart().click();

        //Thread.sleep(5000);

        ShopContentPanel shopContentPanel = new ShopContentPanel();
        shopContentPanel.getProceedToCheckOut().click();

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.getHavePromoCode().click();
        shoppingCart.getPromoCode().sendKeys("20OFF");
        shoppingCart.getPromoAddButton().click();
        //Thread.sleep(5000);
        shoppingCart.getProceedToCheckOut().click();

        // creating an object of the order personal information page
        OrderPersonalInfo personalInfo = new OrderPersonalInfo();
        personalInfo.getGenderMr().click();
        personalInfo.getFirstNameField().sendKeys("John");
        personalInfo.getLastnameField().sendKeys("Smith");
        personalInfo.getEmailField().sendKeys("dgjampy731@couldmail.com");
        personalInfo.getTermsConditionsCheckbox().click();
        personalInfo.getContinueBtn().click();

        // creating an object of the order delivery info page
        OrderAddress orderDeliveryAddress = new OrderAddress();
        orderDeliveryAddress.getAddressField().sendKeys("123 Main Street");
        orderDeliveryAddress.getCityField().sendKeys("Houston");
        Select state = new Select(orderDeliveryAddress.getStateDropdown());
        state.selectByVisibleText("Texas");
        orderDeliveryAddress.getPostcodeField().sendKeys("77021");
        orderDeliveryAddress.getContinueBtn().click();

        // creating an object of the shipping method page
        OrderShipping shipMethod = new OrderShipping();
        shipMethod.getDeliveryMsgTextbox().sendKeys("If I am not in, please leave my delivery on my porch.");
        shipMethod.getContinueBtn().click();

        // creating an object of the payment options page
        OrderPayment orderPay = new OrderPayment();
        orderPay.getPayByCheckRadioBtn().click();
        orderPay.getTermsConditionsCheckbox().click();
        orderPay.getOrderBtn().click();
    }

}

