package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.TShirtPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Marina on 03.03.2019.
 */
public class TShirtPageSteps extends ScenarioSteps {


    private static final long serialVersionUID = -4305443090237528873L;

    /**
     * Constructor
     *
     * @param pages
     */
    public TShirtPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get Product Page
     *
     * @return
     */
    private TShirtPage onTShirtPage() {
        return pages().get(TShirtPage.class);
    }

    /**
     * CLick to product
     */
    @Step("User clicks to product")
    public void userClicksToProduct(String productName) {
        onTShirtPage().clickToProduct(productName);
    }


}
