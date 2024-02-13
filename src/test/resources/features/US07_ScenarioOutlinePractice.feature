Feature: Scenario Outline Practice
  Scenario Outline: TC01 Using scenario outline with Congifrader
    Given  User goes to "<istenenURL>" page
    Then User waits 2 seconds
 When Tests whether the "<requestedURL>" exists
    And Closes the page

    Examples:
      | istenenURL | requestedURL |
      | amazonURL  | amazon       |
      | faceURL    | facebook     |
      | googleURL  | google       |
      | brcUrl     | blue         |