package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.CategoriesBreadcrumb;
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
     * Click to product
     */
    String breadCrumbsForProductPage =
            CategoriesBreadcrumb.WOMEN.getName()
                    + ' '
                    + CategoriesBreadcrumb.TOPS.getName()
                    + ' '
                    + CategoriesBreadcrumb.TSHIRTS.getName()
                    + ' '
                    + CategoriesBreadcrumb.FADEDSHORTSLEEVETSHIRTS.getName();

    /**
     * Check breadcrumb
     */
    @Step("Check breadcrumb")
    public void onProductPageAndCheckBreadcrumb() {
        onProductPage().checkBreadrumb(breadCrumbsForProductPage);
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
