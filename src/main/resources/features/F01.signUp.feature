@regression
Feature: signUp: this feature allow user to create new valid accounts
  Background: shared step for signup
    Given user go to signUp page
    When user enter name

@smoke
  Scenario: user can create valid account
    And user enter EmailAddress
    And user click on singup button
    And user select gender type
    And user enter password
    And user select Date of birth
    And user enter first name and last name
    And user enter address
    And user select country
    And user enter state and city
    And user enter zipcode and Mobile Number
    And user click on create account button
    Then the account created successfully


  Scenario: user can not create invalid account
    And user enter EmailAddress
    And user click on singup button
    And user select gender type
    And user enter invalid password
    And user select Date of birth
    And user enter first name and last name
    And user enter address
    And user select country
    And user enter state and city
    And user enter zipcode and Mobile Number
    And user click on create account button
    Then the account not created








