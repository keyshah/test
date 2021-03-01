Feature: To Test Google Search Functionality

Scenario: Validate google search is working

Given Browser is opened
And  User is on google search page
When user enters a text on search box
And Hit enter
Then user is redirected to search detail page