package com.aqacourses.serenity.steps;

import com.aqacourses.serenity.pages.LoginPage;
import net.thucydides.core.annotations.Step;
import net.thucydides.core.pages.Pages;
import net.thucydides.core.steps.ScenarioSteps;

/**
 * Created by Marina on 03.03.2019.
 */
public class LoginPageSteps extends ScenarioSteps {


    private static final long serialVersionUID = -1998906195788543570L;

    /**
     * Contructor
     *
     * @param pages
     */
    public LoginPageSteps(Pages pages) {
        super(pages);
    }

    /**
     * Get Login Page
     *
     * @return
     */
    private LoginPage onLoginPage() {
        return pages().get(LoginPage.class);
    }

    /**
     * Click Sign In
     */
    @Step("User opens Login Page and sign in")
    public void userOpensLoginPageAndSignIn() {
        onLoginPage().signIn();
    }

}
