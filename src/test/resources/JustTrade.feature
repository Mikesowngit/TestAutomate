Feature: As a user,
  I want to fill the just trade form


  Background:
    Given am on the landing Page
    When I enter my username and password
    And I click login button
    Then the home page is displayed

  Scenario: Just trade form
    Given I click on the just trade tab
    When I enter my first name
    And I enter my last name
    When I enter my address
    And I enter my postcode
    And I enter my email
    And I click the submit button
    Then a we shall get back to you soonest message is displayed