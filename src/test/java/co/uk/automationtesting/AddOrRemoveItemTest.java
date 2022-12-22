package co.uk.automationtesting;

import base.BasePage;
import base.ExtentManager;
import base.Hooks;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import pageObjects.ShopContentPanel;
import pageObjects.ShopHomePage;
import pageObjects.ShopProductPage;
import pageObjects.ShoppingCart;

import java.io.IOException;
@Listeners(resources.Listeners.class)
public class AddOrRemoveItemTest extends Hooks {
    public AddOrRemoveItemTest() throws IOException{
        super();
    }

    @Test
    public void addOrRemoveItem() throws InterruptedException, IOException {
        ExtentManager.log("Starting add or remove item test.....");

        ShopHomePage shopHomePage = new ShopHomePage();
        ExtentManager.pass("Shop Home page gets open");
        shopHomePage.getProductOne().click();

        ShopProductPage shopProductPage = new ShopProductPage();
        ExtentManager.pass("We are in shop product page...");
        Select option = new Select(shopProductPage.getSizeOption());
        option.selectByVisibleText("L");
        ExtentManager.pass("Size got selected.....");
        shopProductPage.getQuantityIncrease().click();
        ExtentManager.pass("Quantity Increased.....");
        shopProductPage.getAddToCart().click();

        //Thread.sleep(5000);

        ShopContentPanel shopContentPanel = new ShopContentPanel();
        shopContentPanel.getContinueShopping().click();

        shopProductPage.getHomePageLink().click();
        shopHomePage.getProductThree().click();
        shopProductPage.getAddToCart().click();
        shopContentPanel.getProceedToCheckOut().click();

        ShoppingCart shoppingCart = new ShoppingCart();
        shoppingCart.getDeleteItem2().click();


        waitForElementInvisibleBy(shoppingCart.getDeleteItem2(),20);
        //System.out.println(shoppingCart.getCartTotal().getText());

        // using an assertion to make sure the total amount is what we are expecting
        try {
            Assert.assertEquals(shoppingCart.getCartTotal().getText(), "$45.23");
            ExtentManager.pass("Cart total matched successfully..");
        }
        catch (Exception e){
            Assert.fail(e.getMessage());
        }
    }

}

