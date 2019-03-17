package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.HomePage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Marina on 03.03.2019.
 */
public class HomePageSteps extends ScenarioSteps {


    private static final long serialVersionUID = -7801471336448596171L;

    /**
     * Constructor
     *
     * @param pages
     */
    public HomePageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get home page
     *
     * @return
     */
    private HomePage onHomePage() {
        return pages().get(HomePage.class);
    }

    /**
     * Open site
     */
    @Step("User opens site and gets Home Page")
    public void userOpensSiteAndGetsHomePage() {
        onHomePage().openSite();
    }

    /**
     * Click Sign In link
     */
    @Step("On home page user clicks link Sign In and gets login page")
    public void onHomePageUserClicksSignInLinksGetLoginPage() {
        onHomePage().clickSignInLink();
    }

}
