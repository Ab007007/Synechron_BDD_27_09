Feature: Google Search

Scenario: Print all search results
Given user is on google page
When user enter Synechron in searchbox
And click on search
Then user print all hyperlinks
And close the browser


Scenario: Print all autosuggestions
Given user is on google page
When user enter Synechron in searchbox
Then user print all autosuggetions
And close the browser