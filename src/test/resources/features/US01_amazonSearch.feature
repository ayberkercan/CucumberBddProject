Feature: Amazon Search Test
  Scenario: TC01 user tests searchbox
    Given user goes to amazon page
    When user searches for iPhone
    Then user tests results include Iphone
    And  user closes the page

  Scenario: TC02 user tests searchbox
    Given user goes to amazon page
    When user searches for Selenium
    Then user tests results Selenium Iphone
    And  user closes the page
