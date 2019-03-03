package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.CheckoutPage;
import com.aqacourses.serenity.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.Serializable;


/**
 * Created by Marina on 03.03.2019.
 */
public class CheckoutPageSteps extends ScenarioSteps implements Serializable {

    private static final long serialVersionUID = 8370993422625525653L;

    /**
     * Constructor
     *
     * @param pages
     */
    public CheckoutPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get home page
     *
     * @return
     */
    private CheckoutPage onCheckoutPage() {
        return pages().get(CheckoutPage.class);
    }


    /**
     * Click to increase quantity
     */
    @Step("User clicks to increase quantity")
    public void userClicksTOIncreaseQuantity() {
        onCheckoutPage().clickToIncreaseQuantity();
    }

    /**
     * Check Total Price
     */
    @Step("User clicks to increase quantity and check total Price")
    public void userClickToIncreaseQuantityAndCheckTotalPrice() {
        onCheckoutPage().checkTotalPrice();
    }

    /**
     * Delete Product
     */
    @Step("User increase quantity and clicks deletes products")
    public void userIncreaseQuantityAndClicksDeleteProducts() {
        onCheckoutPage().clickDeleteProduct();
    }

    /**
     * Check empty cart
     */
    @Step("Verify empty cart")
    public void onCheckoutPageCheckEmptyCart() {
        onCheckoutPage().checkEmptyCart();
    }

}
