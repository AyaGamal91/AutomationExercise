package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage{

    @FindBy(css = "input[data-qa=\"login-email\"]")
    public WebElement loginEmail;
    @FindBy(css = "input[data-qa=\"login-password\"]")
    public WebElement loginPassword;
    @FindBy(css = "button[data-qa=\"login-button\"]")
    public WebElement loginButton;

}
