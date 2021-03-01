#test


Feature: feature to test login page

@smoketest
  Scenario: Check login with valid cred
    Given User is on login page
    When user enters user and pwd
    And clicks on login button
    Then User is navigated to my account