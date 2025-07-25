@regression
Feature: add to cart: this feature allow user add product to cart
  Background: cart
    Given user GO to HomePage

  @smoke
  Scenario:  user  add product to cart
    When user enter emailAddress and password at homepage
    And user click on cart button
    And user click on here button
    And user write product on search Bar
    And user click on search
    And user select product and view it
    And user can add to cart
    And user click on view cart
    And user click on proceed To CheckOut button
    And user click on place order button
    And user enter payment data
    Then uer press pay and confirm order button
