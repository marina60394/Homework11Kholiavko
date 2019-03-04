package com.aqacourses.serenity.pages;


import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marina on 27.02.2019.
 */
public class CheckoutPage extends AbstractPage {

    private static final String PRODUCT_QUANTITY =
            "//td[@class='cart_quantity text-center']/input[@type='hidden']";
    private static final String MESSAGE_EMPTY_SHOPPING_CART = "Your shopping cart is empty.";
    private static final double DELTA = 1e-15;

    //   Web Elements
    @FindBy(xpath = "//i[@class='icon-plus']")
    private WebElement iconIncreaseQuantity;

    @FindBy(xpath = "//td[@class='cart_total']/span[@class='price']")
    private WebElement totalPrice;

    @FindBy(xpath = "//td[@class='cart_quantity text-center']/input[@type='hidden']")
    private WebElement productQuantity;

    @FindBy(xpath = "//td[@class='cart_unit']/span[@class='price']/span[@class='price']")
    private WebElement productPrice;

    @FindBy(
            xpath = "//td[@class='cart_delete text-center']/div/a[@title='Delete']/i[@class='icon-trash']"
    )
    private WebElement deleteProduct;

    @FindBy(xpath = "//p[@class='alert alert-warning']")
    private WebElement messageEmptyCart;

    /**
     * Constructor
     *
     * @param driver
     */
    public CheckoutPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Wait for increase quantity of products
     */
    public void waitIncreaseElementValue() {
        String currentQuantity =
                getDriver().findElement(By.xpath(PRODUCT_QUANTITY)).getAttribute("value");

        int currentQuantityInt = Integer.parseInt(currentQuantity);

        int expectedQuanttity = currentQuantityInt + 1;

        waitFor(ExpectedConditions.textToBePresentInElementValue(By.xpath(PRODUCT_QUANTITY), String.valueOf(expectedQuanttity)));
    }

    /**
     * increase quantity of products
     */
    public void clickToIncreaseQuantity() {

        iconIncreaseQuantity.click();

        waitIncreaseElementValue();
    }

    /**
     * check total price is the same productPrice*quantity
     */
    public void checkTotalPrice() {
        // get product price
        String productPriceText = productPrice.getText().substring(1);

        // get total Price
        String totalPriceText = totalPrice.getText().substring(1);

        // get quantity of products
        String productQuantityValue = getDriver().findElement(By.xpath(PRODUCT_QUANTITY)).getAttribute("value").toString();

        float prQuantity = Integer.parseInt(productQuantityValue);

        float productPrice = Float.parseFloat(productPriceText);

        float amountTotalPrice = Float.parseFloat(totalPriceText);

        // count total amount
        float checkTotalPrice = productPrice * prQuantity;

        // check total amount and productPrice*quantity
        Assert.assertEquals(amountTotalPrice, checkTotalPrice, DELTA);
    }

    /**
     * Click Delete Product
     */
    public void clickDeleteProduct() {
        deleteProduct.click();
    }

    /**
     * Check Empty Cart
     */
    public void checkEmptyCart() {

        waitFor(ExpectedConditions.visibilityOf(messageEmptyCart));

        // check message for empty cart
        Assert.assertEquals(MESSAGE_EMPTY_SHOPPING_CART, messageEmptyCart.getText());
    }
}
