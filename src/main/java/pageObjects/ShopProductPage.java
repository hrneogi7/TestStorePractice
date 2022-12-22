package pageObjects;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;

public class ShopProductPage extends BasePage {
    public WebDriver webDriver;

    By sizeOption = By.xpath("//select[@id='group_1']");
    By quantityIncrease = By.xpath("//i[@class='material-icons touchspin-up']");
    By quantityDecrease = By.xpath("//i[@class='material-icons touchspin-down']");
    By addToCart = By.cssSelector(".add-to-cart.btn.btn-primary");
    By homePageLink = By.xpath("//span[text()='Home']");
    By clothesPageLink = By.xpath("//span[text()='Clothes']");

    public ShopProductPage() throws IOException {
        super();
    }

    public WebElement getSizeOption() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(sizeOption);
    }
    public WebElement getQuantityIncrease() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(quantityIncrease);
    }
    public WebElement getQuantityDecrease() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(quantityDecrease);
    }
    public WebElement getAddToCart() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(addToCart);
    }
    public WebElement getHomePageLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(homePageLink);
    }
    public WebElement getClothesPageLink() throws IOException {
        this.webDriver = getWebDriver();
        return webDriver.findElement(clothesPageLink);
    }
}
