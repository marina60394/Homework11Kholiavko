package com.aqacourses.serenity.pages;


import com.aqacourses.serenity.utils.YamlParser;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

/**
 * Created by Marina on 03.03.2019.
 */
public class AbstractPage extends PageObject {
    String currentPageURL;

    // Web Elements
    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInLink;

    @FindBy(
            xpath =
                    "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='T-shirts']"
    )
    private WebElement menuTShirts;

    @FindBy(xpath = "//div[@class='breadcrumb clearfix']")
    private WebElement breadcrumb;

    /**
     * Constructor
     *
     * @param driver
     */
    public AbstractPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Open Site
     */
    public void openSite() {
        getDriver().manage().window().maximize();
        getDriver().get(YamlParser.getYamlData().getUrl());
    }

    /**
     * Click on Sign In link
     */
    public void clickSignInLink() {
        waitFor(ExpectedConditions.visibilityOf(signInLink));
        signInLink.click();
    }

    /**
     * get Current URL
     *
     * @param
     * @return
     */
    public String getTitle() {
        currentPageURL = getDriver().getTitle();
        return currentPageURL;
    }


    /**
     * Click to menu T-shirt
     */
    public void clickMenuTShirt() {
        waitFor(ExpectedConditions.visibilityOf(menuTShirts));
        menuTShirts.click();
    }

    /**
     * Check breadcrumb
     *
     * @param expectedBreadcrumbs
     */
    public void checkBreadrumb(String expectedBreadcrumbs) {
        waitFor(ExpectedConditions.visibilityOf(breadcrumb));
        String breadcrumbs = breadcrumb.getAttribute("innerText");

        String actualBreadCrumbs = breadcrumbs.replace(" > ", "").replace(">", " ");

        //  verify breadcrumb from page with breadcrumb from enum
        Assert.assertEquals(actualBreadCrumbs, expectedBreadcrumbs);
    }
}
