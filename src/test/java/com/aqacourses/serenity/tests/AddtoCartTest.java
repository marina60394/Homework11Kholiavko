package com.aqacourses.serenity.tests;

import com.aqacourses.serenity.pages.CategoriesBreadcrumb;
import com.aqacourses.serenity.steps.*;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.annotations.ManagedPages;
import net.thucydides.core.annotations.Steps;
import net.thucydides.core.pages.Pages;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marina on 03.03.2019.
 */

// Serenity Runner
@RunWith(SerenityRunner.class)
public class AddtoCartTest {

    private static final String FADED_SHORT_SLEEVE_TSHIRTS = "Faded Short Sleeve T-shirts";

    @Managed
    WebDriver driver;

    @ManagedPages
    Pages pages;

    @Steps
    HomePageSteps homePageSteps;

    @Steps
    LoginPageSteps loginPageSteps;

    @Steps
    MyAccountPageSteps myAccountPageSteps;

    @Steps
    TShirtPageSteps tShirtPageSteps;

    @Steps
    ProductPageSTeps productPageSTeps;

    @Steps
    CheckoutPageSteps checkoutPageSteps;

    @Test
    public void testAddToCart() {
        homePageSteps.userOpensSiteAndGetsHomePage();
        homePageSteps.onHomePageUserClicksSignInLinksGetLoginPage();
        loginPageSteps.UserOpensLoginPageAndSignIn();
        myAccountPageSteps.UserClicksToTShirtsMenu();
        tShirtPageSteps.userClicksToProduct();
        productPageSTeps.onProductPageAndCheckBreadcrumb(
                CategoriesBreadcrumb.WOMEN.getName()
                        + ' '
                        + CategoriesBreadcrumb.TOPS.getName()
                        + ' '
                        + CategoriesBreadcrumb.TSHIRTS.getName()
                        + ' '
                        + FADED_SHORT_SLEEVE_TSHIRTS);
        productPageSTeps.userClicksToButtonAddToCart();
        productPageSTeps.userClicksToButtonProceedCheckout();
        checkoutPageSteps.onCheckoutPageUserClicksToIncreaseQuantity();
        checkoutPageSteps.onCheckoutPageUserCheckTotalPrice();
        checkoutPageSteps.OnCheckoutPageUserClicksDeleteProducts();
        checkoutPageSteps.onCheckoutPageCheckEmptyCart();

    }

}
