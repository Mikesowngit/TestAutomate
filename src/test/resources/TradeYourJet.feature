Feature: As the user,
  I want to be able to trade my jet

  Background:
    Given am on the landing Page
    When I enter my username and password
    And I click login button
    Then the home page is displayed

  Scenario: Trade my jet
    Given I am on the home page
    When click on the trade my jet tab
    Then the trade your jet page is displayed
    And I enter my current jet price
    And I enter how much i purchased it for
    And I enter my flight time
    And I click no on the do you know your range option
    And I click yes on the do you know the take off time option
    And I click the submit button
    Then a thank you message is displayed

