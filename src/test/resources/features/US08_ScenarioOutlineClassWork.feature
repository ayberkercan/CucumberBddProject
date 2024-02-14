Feature: Let's log in 5 different users to the Datatables site.
  Scenario Outline: TC01 User must be able to enter 5 different records
    When  User goes to "dataURL" homepage
    Then User presses new button
    And Write "<firstname>" in the name section
    And User waits 2 seconds
    And Write "<lastname>" in the surname section
    And Write "<position>" in the position section
    And User waits 2 seconds
    And Write "<office>" in the office section
    And User waits 2 seconds
    And Write "<extension>" in the extension section
    And User waits 2 seconds
    And Write "<startDate>" in the  startDate section
    And User waits 2 seconds
    And Write "<salary>" in the salary section
    And User waits 2 seconds
    And User presses create button
    And User waits 2 seconds
    When User searches with "<firstname>"
    And It tests that there is "<firstname>" in the name section.
    Examples:
      | firstname | lastname | position                  | office | extension | startDate  | salary |
      | Ayberk    | Ercan    | Software QA Test Engineer | Turkey | UI        | 2022-11-07 | 50000  |

  Scenario: user closes the page
      Given closes the page

