Feature:As a user,
  I want to be able to book my Jet

  Background:
    Given am on the landing Page
    When I enter my username and password
    And I click login button
    Then the home page is displayed


  Scenario: Book my Jet
    Given I am on the home page
    When I click on the book your jet tab
    Then the book your jet page is displayed
    And I enter my start destination
    And I enter my end destination
    And I click the select zones dropdown
    And I click UK on the zones dropdown
    And I click the flying with family checkbox
    And I click the flying first class checkbox
    And I click the group flight checkbox
    And I click yes on the radio button
    And I click the submit button
    Then a thank you message page is displayed
