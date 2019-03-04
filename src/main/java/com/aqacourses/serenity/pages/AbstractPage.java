package com.aqacourses.serenity.pages;


import com.aqacourses.serenity.utils.YamlParser;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 03.03.2019.
 */
public class AbstractPage extends PageObject {
    String currentPageURL;

    // Web Elements
    @FindBy(xpath = "//a[@class='login']")
    private WebElement signInLink;

    @FindBy(xpath = "//div[@id='page']")
    protected WebElement divPage;

    @FindBy(xpath = "//div[@class='header_user_info']/a[@class='logout']")
    private WebElement logOut;

    @FindBy(
            xpath =
                    "//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li/a[@title='Dresses']"
    )
    private WebElement menuDresses;

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
     * Click Log Out
     */
    public void logOut() {
        logOut.click();
    }

    /**
     * Click to menu Dresses
     */
    public void clickMenuDresses() {
        menuDresses.click();
    }

    /**
     * Click to menu T-shirt
     */
    public void clickMenuTShirt() {
        menuTShirts.click();
    }

    /**
     * Check breadcrumb
     *
     * @param expectedBreadcrumbs
     */
    public void checkBreadrumb(String expectedBreadcrumbs) {
        String breadcrumbs = breadcrumb.getAttribute("innerText");

        String actualBreadCrumbs = breadcrumbs.replace(" > ", "").replace(">", " ");

        //  verify breadcrumb from page with breadcrumb from enum
        Assert.assertEquals(actualBreadCrumbs, expectedBreadcrumbs);
    }
}
