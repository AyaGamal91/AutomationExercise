@regression
Feature: signIn: this feature allow user to login accounts
  Background: shared step for login
    Given user go to signIn page
  @smoke
  Scenario:  user  logIn to account
    When user enter emailAddress
    And user enter Password
    Then user click on login button




