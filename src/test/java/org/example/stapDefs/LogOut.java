package org.example.stapDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.LogOutPage;
import org.example.Pages.LoginPage;

import static org.example.stapDefs.signUp.email;
import static org.example.stapDefs.signUp.password;

public class LogOut {
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    LogOutPage logout =new LogOutPage();
    @Given("user go to HomePage")
    public void UserGoToHomePage(){
        home.SignUpTab.click();
    }

    @When("user enter emailAddress at homepage")
    public void userEnterEmailAddressAtHomepage() {login.loginEmail.sendKeys(email);
    }

    @And("user enter Password at homepage")
    public void userEnterPasswordAtHomepage() {login.loginPassword.sendKeys(password);
    }

    @And("user click on login Button")
    public void userClickOnLoginButton() {login.loginButton.click();
    }

    @Then("user click on logOut button")
    public void userClickOnLogOutButton() {logout.logOutBTN.click();
    }
}
