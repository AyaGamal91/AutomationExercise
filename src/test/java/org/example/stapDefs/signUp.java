package org.example.stapDefs;

import com.github.javafaker.Faker;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.example.Pages.HomePage;
import org.example.Pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.time.Duration;

import static org.example.stapDefs.Hooks.driver;


public class signUp {
    public static String email;
    public static String password;

    HomePage home = new HomePage();
    SignUpPage signup = new SignUpPage();
    @Given("user go to signUp page")
    public void userGoToSignUpPage ()
    {
        home.SignUpTab.click();
    }


    @And("user click on singup button")
    public void userClickOnSingupButton() {
        signup.SignUpButton.click();
    }


    @And("user select gender type")
    public void userSelectGenderType() {
      signup.SelectGenderType.click();
    }

    @And("user enter password")
    public void userEnterPassword() {
        Faker fake = new Faker();
        password =fake.internet().password();
        configuration.set("password",password);
        signup.password.sendKeys(password);
    }

    @And("user select Date of birth")
    public void userSelectDateOfBirth() {
        Select Day = new Select(signup.days);
        Day.selectByValue("6");
        Select Month = new Select(signup.months);
        Month.selectByValue("3");
        Select year = new Select(signup.years);
        year.selectByValue("1991");
    }

    @And("user enter first name and last name")
    public void userEnterFirstNameAndLastName() {
       signup.firstName.sendKeys("aya");
       signup.lastName.sendKeys("Gamal");
    }

    @And("user enter address")
    public void userEnterAddress()  {
        signup.Address.sendKeys("Elgalaa street");

    }

    @And("user select country")
    public void userSelectCountry() {

        WebDriverWait wait = new WebDriverWait(Hooks.driver, Duration.ofSeconds(10));

        // wait until element to be clickable
        wait.until(ExpectedConditions.elementToBeClickable(signup.country));

        // Scroll element
        JavascriptExecutor js = (JavascriptExecutor) Hooks.driver;
        js.executeScript("arguments[0].scrollIntoView(true);", signup.country);

        // then select country
        Select country = new Select(signup.country);
        country.selectByVisibleText("United States");

    }

    @And("user enter state and city")
    public void userEnterStateAndCity() {
      signup.state.sendKeys("NewYork");
       signup.city.sendKeys("NewYork");
    }

    @And("user enter zipcode and Mobile Number")
    public void userEnterZipcodeAndMobileNumber() {
       signup.zipcode.sendKeys("123456");
       signup.mobileNumber.sendKeys("010001111222");
    }

    @And("user click on create account button")
    public void userClickOnCreateAccountButton() {
        signup.createAccount.click();
    }

    @Then("the account created successfully")
    public void theAccountCreatedSuccessfully() {
        SoftAssert soft = new SoftAssert();
        String actualUrl = driver.getCurrentUrl();
        soft.assertEquals(actualUrl,"https://www.automationexercise.com/account_created");
        String TEXT= driver.findElement(By.cssSelector("h2[data-qa=\"account-created\"]")).getText();
        soft.assertEquals(TEXT.toLowerCase(),"account created!");
        soft.assertAll();
    }


    @And("user leave password empty")
    public void userLeavePasswordEmpty() {signup.password.sendKeys("");
    }

    @Then("the account not created")
    public void theAccountNotCreated() {
    }

    @When("user enter name")
    public void userEnterName() {signup.Name.sendKeys("AyaGamal");
    }

    @And("user enter EmailAddress")
    public void userEnterEmailAddress() {
        Faker faker = new Faker();
        email =faker.internet().emailAddress();
        configuration.set("email",email);

        signup.EmailAddress.sendKeys(email);
    }

    @And("user enter invalid EmailAddress")
    public void userEnterInvalidEmailAddress() {
        signup.EmailAddress.sendKeys("aya.yahoo.com");

    }


    @And("user enter invalid password")
    public void userEnterInvalidPassword() {signup.password.sendKeys("");
    }
}

