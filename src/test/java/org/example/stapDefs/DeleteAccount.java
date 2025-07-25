package org.example.stapDefs;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.BasePage;
import org.example.Pages.DeletePage;
import org.example.Pages.HomePage;
import org.example.Pages.LoginPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.example.stapDefs.signUp.email;
import static org.example.stapDefs.signUp.password;

public class DeleteAccount  {
    HomePage home = new HomePage();
    LoginPage login = new LoginPage();
    DeletePage Delete =new DeletePage();
    @Given("User Goto HomePage")
    public void UserGotoHomePage(){home.SignUpTab.click();

    }

    @When("user can enter emailAddress")
    public void userCanEnterEmailAddress() {login.loginEmail.sendKeys(email);
    }

    @And("user enter Password at Homepage")
    public void userEnterPasswordAtHomepage() {login.loginPassword.sendKeys(password);
    }

    @And("user click on logIn Button")
    public void userClickOnLogInButton() {login.loginButton.click();
    }

    @Then("user click on DeleteAccount button")
    public void userClickOnDeleteAccountButton() {Delete.deleteBTN.click();
    }


}
