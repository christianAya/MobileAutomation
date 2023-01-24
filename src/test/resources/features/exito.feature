@stories
Feature: Exito application automation
  I, as a user, want to register in the application to purchase products.

  Background:
    Given I that user wants to enter the Exito application

  @Register
  Scenario: Exito application register
    When I enter with the user information "Carlos", "Cortez", "123456", "3124567891", "eamx.cipbm33@pihey.com"
    Then I should see the code page


  @Login
  Scenario: Exito application authentication
    And I login with the email "ejmo.nrzwp85@pihey.com" and the password "Exito1234"
    When I add a product to the cart
    Then I should see the product in my cart