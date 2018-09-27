Feature: Google Search Feature Outline

Scenario Outline: Search Google

Given User is on Google Search Page
When title of page is "Google"
Then user enters "<keyword>"
Then user clicks on search button


Examples:
    | keyword  |
    | akshitha |
    | test@123 |
