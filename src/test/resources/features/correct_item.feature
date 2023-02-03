Feature: Check that the correct item is in the cart

  As a customer
  I want to add item to the cart
  So that I can be sure of item correctness

  Scenario: User have correct item in the cart
    Given user opens "https://www.saucedemo.com/"
    And logins with username: "standard_user" and password: "secret_sauce"
    And selects "Sauce Labs Backpack" item
    And adds item to the cart
    When goes to the cart
    Then should be "Sauce Labs Backpack" item in the cart