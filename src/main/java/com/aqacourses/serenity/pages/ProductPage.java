package com.aqacourses.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 26.02.2019.
 */
public class ProductPage extends AbstractPage {

    String expectedBreadCrumb = "Women>Tops>T-shirts>Faded Short Sleeve T-shirts";

    //  Web elements
    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement breadcrumb;

    @FindBy(xpath = "//p[@id='add_to_cart']/button")
    private WebElement buttonAddToCart;

    @FindBy(xpath = "//div[@class='button-container']/a[@title='Proceed to checkout']")
    private WebElement buttonProceedToCheckout;

    /**
     * Constructor
     *
     * @param driver
     */
    public ProductPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Click to button Add to Cart
     */
    public void clickToButtonAddToCart() {
        buttonAddToCart.click();
    }

    /**
     * Click to button Proceed Checkout
     */
    public void clickButtonProceedToCheckout() {
        buttonProceedToCheckout.click();
    }
}
