package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.ProductPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

import java.io.Serializable;

/**
 * Created by Marina on 03.03.2019.
 */
public class ProductPageSTeps extends ScenarioSteps implements Serializable {


    private static final long serialVersionUID = 4475642995121447167L;

    private String breadcrumb;

    /**
     * Constructor
     *
     * @param pages
     */
    public ProductPageSTeps(Pages pages) {
        super(pages);
    }

    /**
     * Get Product Page
     *
     * @return
     */
    private ProductPage onProductPage() {
        return pages().get(ProductPage.class);
    }


    /**
     * Check breadcrumb
     */
    @Step("Check breadcrumb")
    public void onProductPageAndCheckBreadcrumb(String breadcrumb) {
        onProductPage().checkBreadrumb(breadcrumb);
    }

    /**
     * Click to button Add to Cart
     */
    @Step("User clicks to Button Add to Cart")
    public void userClicksToButtonAddToCart() {
        onProductPage().clickToButtonAddToCart();
    }

    /**
     * Click to button Proceed to checkout
     */
    @Step("User clicks to Button Proceed Checkout")
    public void userClicksToButtonProceedCheckout() {
        onProductPage().clickButtonProceedToCheckout();
    }
}
