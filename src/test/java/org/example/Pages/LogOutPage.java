package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LogOutPage extends BasePage{
    @FindBy(css = "a[href=\"/logout\"]")
    public WebElement  logOutBTN;
}
