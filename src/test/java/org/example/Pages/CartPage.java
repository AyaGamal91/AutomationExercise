package org.example.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage {
    @FindBy(xpath = "//ul[@class='nav navbar-nav']//a[@href='/view_cart']")
    public WebElement CartTab;
    @FindBy(xpath = "//p[@class=\"text-center\"]//a[@href=\"/products\"]")
    public WebElement hereBTN;
    @FindBy(id = "search_product")
    public WebElement searchBar;
    @FindBy(id= "submit_search")
    public WebElement searchBTN;
    @FindBy(css = "a[href=\"/product_details/3\"]")
    public WebElement viewPro;
    @FindBy(css = "button[type=\"button\"]")
    public WebElement addToCart;

    @FindBy(xpath = "//p[@class=\"text-center\"]//a[@href=\"/view_cart\"]")
    public WebElement viewCart;
    @FindBy(className = "check_out")
    public WebElement checkout;
    @FindBy(css = "a[href=\"/payment\"]")
    public WebElement placeOrder;
    @FindBy(css = "input[name=\"name_on_card\"]")
    public WebElement Name;
    @FindBy(css = "input[name=\"card_number\"]")
    public WebElement cardNum;
    @FindBy(css = "input[name=\"cvc\"]")
    public WebElement cvc;
    @FindBy(css = "input[name=\"expiry_month\"]")
    public WebElement expiryMonth;
    @FindBy(css = "input[name=\"expiry_year\"]")
    public WebElement expiryYear;
    @FindBy(id = "submit")
    public WebElement payBTN;

}