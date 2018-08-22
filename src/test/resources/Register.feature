Feature: As a user,
  I want to be able to register as a member

  Scenario: Register as a member
    Given I am on the landing page
    When I click the register button
    Then the register page should be displayed
    When I enter my username
    And I enter my Email
    When I enter my password
    And click the checkbox
    When I click the Submit button
    Then I should be on the home page