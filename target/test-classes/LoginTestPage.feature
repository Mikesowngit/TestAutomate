Feature: As a user,
  I want to be able to Login

  @testcomplete
  Scenario: Login
    Given am on the landing Page
    When I enter my username and password
    And I click login button
    Then the home page is displayed