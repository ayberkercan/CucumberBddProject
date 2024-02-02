Feature: Background  use
  Background: Ortak adimlar
    Given user goes to amazon page
@Scenario1
  Scenario: TC01 user tests searchbox
    When user searches for iPhone
    Then user tests results include Iphone


  Scenario: TC02 user tests searchbox
    When user searches for Selenium
    Then user tests results Selenium
    And  user closes the page