package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.CheckoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * Created by Marina on 03.03.2019.
 */
public class CheckoutPageSteps extends ScenarioSteps {

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
    public void onCheckoutPageUserClicksToIncreaseQuantity() {
        onCheckoutPage().clickToIncreaseQuantity();
    }

    /**
     * Check Total Price
     */
    @Step("On Checkout Page user checks total Price")
    public void onCheckoutPageUserCheckTotalPrice() {
        onCheckoutPage().checkTotalPrice();
    }

    /**
     * Delete Product
     */
    @Step("User deletes products")
    public void onCheckoutPageUserClicksDeleteProducts() {
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
