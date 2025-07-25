@regression
Feature: LogOut: this feature allow user to logOut
  Background: singOut
    Given user go to HomePage

  @smoke
  Scenario:  user  logout account
    When user enter emailAddress at homepage
    And user enter Password at homepage
    And user click on login Button
    Then user click on logOut button
