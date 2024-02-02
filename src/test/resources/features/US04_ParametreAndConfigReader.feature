Feature: Parametre And ConfigReader
  @ConfigReader
  Scenario: TC01 Parametre ConfigReader use
    Given User goes to "faceURL" page
    Then User waits 2 seconds
    When Tests that the URL contains "facebook"
    And Closes the page

  Scenario: TC02 Parametre ConfigReader use
    Given User goes to "googleURL" page
    Then User waits 2 seconds
    When Tests that the URL contains "google"
    And Closes the page