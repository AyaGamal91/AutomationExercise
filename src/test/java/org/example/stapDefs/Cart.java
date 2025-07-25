package org.example.stapDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.CartPage;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import static org.example.stapDefs.signUp.email;
import static org.example.stapDefs.signUp.password;

public class Cart {
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    CartPage cart = new CartPage();
    @Given("user GO to HomePage")
    public void useGOToHomePage(){home.SignUpTab.click();

    }

    @When("user enter emailAddress and password at homepage")
    public void userEnterEmailAddressAndPasswordAtHomepage() {
        login.loginEmail.sendKeys(email);
        login.loginPassword.sendKeys(password);
        login.loginButton.click();
    }

    @And("user click on cart button")
    public void userClickOnCartButton() {cart.CartTab.click();
    }

    @And("user click on here button")
    public void userClickOnHereButton() {cart.hereBTN.click();
    }

    @And("user select product and view it")
    public void userSelectProductAndAddItToCart() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));

        // wait until element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable( cart.viewPro));

        // Scroll element
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", cart.viewPro);


        cart.viewPro.click();

    }

    @And("user write product on search Bar")
    public void userWriteProductOnSearchBar() {cart.searchBar.sendKeys("dress");
    }

    @And("user click on search")
    public void userClickOnSearch() {cart.searchBTN.click();
    }

    @And("user can add to cart")
    public void  userCanAddToCart() throws InterruptedException{

        cart.addToCart.click();
        Thread.sleep(4000);
    }

    @And("user click on proceed To CheckOut button")
    public void userClickOnProceedToCheckOutButton() {cart.checkout.click();
    }

    @And("user click on place order button")
    public void userClickOnPlaceOrderButton() {cart.placeOrder.click();
    }

    @And("user enter payment data")
    public void userEnterPaymentData() {cart.Name.sendKeys("aya gamal mokhtar" );
        cart.cardNum.sendKeys("987654");
        cart.cvc.sendKeys("311");
        cart.expiryMonth.sendKeys("12");
        cart.expiryYear.sendKeys("2028");
    }

    @Then("uer press pay and confirm order button")
    public void uerPressPayAndConfirmOrderButton() {
        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(30));

        // wait until element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable( cart.payBTN));

        // Scroll element
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", cart.payBTN);



        cart.payBTN.click();
    }

    @And("user click on view cart")
    public void userClickOnViewCart() {
        cart.viewCart.click();
    }
}
