Feature: As a user,
  I want to fill in the contact form

  Scenario: Submit contact form
    Given I am on the home page
    And I click the contact support tab
    Then I enter the below information in the name text
    |Mike                        |
    |Jake                        |
    |Jeffers                     |
    |23 Gresham crescent         |
    |SW12 8BB                    |
    |Michaeloluade@hotmail.co.uk |
    |Automation is interesting   |
    And I click the submit button on the contact page
    Then Thank you for your message! We will get in touch as soon as possible. is displayed