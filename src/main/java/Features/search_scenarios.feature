Feature: Google Search Feature

Scenario: Search Google for keyword1

Given User is on Google Search Page
When title of page is "Google"
Then user enters "keyword1"
Then user clicks on search button

Scenario: Search Google for keyword2

Given User is on Google Search Page
When title of page is "Google"
Then user enters "keyword2"
Then user clicks on search button