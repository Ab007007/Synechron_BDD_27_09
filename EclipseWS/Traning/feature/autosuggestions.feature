Feature: Print AutoSuggestions 

@regression @google
Scenario: Suggestions for Syncchron
Given user is on google page
When user enter "Synechron" in searchbox
Then user print all autosuggetions
And close the browser

@regression @google
Scenario: Suggestions for IBM
Given user is on google page
When user enters "IBM" in searchbox
Then user print all autosuggetions
And close the browser

@uat @google
Scenario: Suggestions for Wipro
Given user is on google page
When user enters "Wipro" in searchbox
Then user print all autosuggetions
And close the browser


@junk @google
Scenario: Suggestions for Junk
Given user is on google page
When user enter "jsahdlfksjhflsjdfhlksdjfhlaksdjfhksladjfh" in searchbox
Then user print no autosuggetions
And close the browser