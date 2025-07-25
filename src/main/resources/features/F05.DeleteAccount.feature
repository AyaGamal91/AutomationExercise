Feature: user can delete account
  Background: delete account
    Given User Goto HomePage

  @smoke
  Scenario:  user  delete account
    When user can enter emailAddress
    And user enter Password at Homepage
    And user click on logIn Button
    Then user click on DeleteAccount button