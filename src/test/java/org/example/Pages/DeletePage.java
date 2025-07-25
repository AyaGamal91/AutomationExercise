package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;



public class DeletePage extends BasePage {

    @FindBy(css = "a[href=\"/delete_account\"]")
    public WebElement deleteBTN;

}
