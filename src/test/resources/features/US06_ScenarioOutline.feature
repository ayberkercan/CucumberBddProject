Feature: Scenario Outline use

  Scenario Outline: TC01 The user searches for the words she wants
    Given User goes to amazon page
    Then User searches for "<requestedWord>"
    Then Tests that the results contain "<requestedWordControl>"
    And closes the page
    Examples:
      | requestedWord | requestedWordControl |
      | iphone        | iphone               |
      | selenium      | selenium             |
      | SQL           | SQL                  |