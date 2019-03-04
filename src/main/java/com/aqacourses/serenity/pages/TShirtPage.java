package com.aqacourses.serenity.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * Created by Marina on 26.02.2019.
 */
public class TShirtPage extends AbstractPage {

    /**
     * Constructor
     *
     * @param driver
     */
    public TShirtPage(WebDriver driver) {
        super(driver);
    }

    public String pageBreadcrumb;

    private String PRODUCT_DETAILS =
            "//div[@class='product-container']/div[@class='right-block']/h5[@itemprop='name']/a[@title='%s']";
    private String productName = "Faded Short Sleeve T-shirts";

    /**
     * Click to Product Page
     *
     * @return new instance of Product page
     */
    public void clicktoProduct() {
        getDriver()
                .findElement(By.xpath(String.format(PRODUCT_DETAILS, productName)))
                .click();
    }
}
