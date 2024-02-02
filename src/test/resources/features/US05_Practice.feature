Feature: Practice
    @Practice
  Scenario: TC01 User tests login with valid information
Given On the user "brcUrl" homepage
    Then clicks on the login text

    And user enters invalid username

    And user enters invalid password

    And clicks on the login button

    Then Tests whether the page can be logged in
    And Closes the page
