package com.aqacourses.serenity.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

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

    // Web Elements
    @FindBy(
            xpath =
                    "//div[@class='product-container']/div[@class='right-block']/h5[@itemprop='name']/a[@title='Faded Short Sleeve T-shirts']"
    )
    private WebElement productCOntainer;

    /**
     * Click to Product Page
     *
     * @return new instance of Product page
     */
    public void clicktoProduct() {
        Actions action = new Actions(getDriver());
        action.moveToElement(productCOntainer).perform();
        buttonViewForProduct.click();
    }
}
