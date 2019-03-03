package com.aqacourses.serenity.pages;

import com.aqacourses.serenity.utils.YamlParser;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Marina on 19.02.2019.
 */
public class LoginPage extends AbstractPage {

    // Web Elements
    @FindBy(
            xpath =
                    "//form[@id='login_form']/descendant::div[@class='form-group']/input[@data-validate='isEmail']"
    )
    private WebElement fieldLogin;

    @FindBy(
            xpath =
                    "//form[@id='login_form']/descendant::div[@class='form-group']/span/input[@type='password']"
    )
    private WebElement fieldPassword;

    @FindBy(xpath = "//button[@id='SubmitLogin']")
    private WebElement submitButton;

    /**
     * Constructor
     *
     * @param driver
     */
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    /**
     * Enter login and password and click to Submit Button
     */
    public void signIn() {
        fieldLogin.sendKeys(YamlParser.getYamlData().getEmail());
        fieldPassword.sendKeys(YamlParser.getYamlData().getPassword());
        submitButton.click();
    }
}
