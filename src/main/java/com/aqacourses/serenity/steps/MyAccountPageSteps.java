package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.MyAccoutPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;


/**
 * Created by Marina on 03.03.2019.
 */

public class MyAccountPageSteps extends ScenarioSteps {

    private static final long serialVersionUID = 4273433809903897353L;

    /**
     * Contructor
     *
     * @param pages
     */
    public MyAccountPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get MyAccount Page
     *
     * @return
     */
    private MyAccoutPage onMyAccountPage() {
        return pages().get(MyAccoutPage.class);
    }

    /**
     * Click Menu T-Shirt
     */
    @Step("User clicks to T-Shirts Menu")
    public void userClicksToTShirtsMenu() {
        onMyAccountPage().clickMenuTShirt();
    }
}
