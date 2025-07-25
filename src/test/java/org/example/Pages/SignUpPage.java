package org.example.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static org.example.stapDefs.Hooks.driver;

public class SignUpPage extends BasePage {

    @FindBy(css = "input[type=\"text\"]")
    public WebElement Name;
    @FindBy(css = "input[data-qa=\"signup-email\"]")
    public WebElement EmailAddress;
    @FindBy(css = "button[data-qa=\"signup-button\"]")
    public WebElement SignUpButton;
    @FindBy(id ="id_gender2")
    public WebElement SelectGenderType;
    @FindBy(id = "password")
    public  WebElement password;
    @FindBy(id = "days")
    public WebElement days;
    @FindBy(id = "months")
    public WebElement months;
    @FindBy(id = "years")
    public WebElement years;
    @FindBy(id = "first_name")
    public WebElement firstName;
    @FindBy(id="last_name")
    public WebElement lastName;
    @FindBy(id = "address1")
    public WebElement Address;
    @FindBy(id = "country")
    public WebElement country;
    @FindBy(id = "state")
    public WebElement state;
    @FindBy(id="city")
    public WebElement city;
    @FindBy(id = "zipcode")
    public WebElement zipcode;
    @FindBy(id="mobile_number")
    public WebElement mobileNumber;
    @FindBy(css = "button[data-qa=\"create-account\"]")
    public  WebElement createAccount;








}
