package org.example.stapDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;

import static org.example.stapDefs.signUp.email;
import static org.example.stapDefs.signUp.password;

public class LogIn {
    HomePage home = new HomePage();
    LoginPage Login = new LoginPage();
    @Given("user go to signIn page")
    public void userGoToSignInPage ()
    {
        home.SignUpTab.click();
    }

    @When("user enter emailAddress")
    public void userEnterEmailAddress() {
        Login.loginEmail.sendKeys(email);


    }

    @And("user enter Password")
    public void userEnterPassword() {
        Login.loginPassword.sendKeys(password);

    }

    @Then("user click on login button")
    public void userClickOnLoginButton() {
        Login.loginButton.click();}}




