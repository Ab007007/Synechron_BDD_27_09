@development
Feature: Print AutoSuggestions

  Background: 
  	Given user is on google page

  @regression @google
  Scenario: Suggestions for Syncchron
    When user enter Synechron in searchbox
    Then user print all autosuggetions
    And close the browser

  @regression @google
  Scenario: Suggestions for IBM
    When user enters IBM in searchbox
    Then user print all autosuggetions
    And close the browser

  @uat @google
  Scenario: Suggestions for Wipro
    When user enters Wipro in searchbox
    Then user print all autosuggetions
    And close the browser

  @junk @google
  Scenario: Suggestions for Junk
    When user enter jsahdlfksjhflsjdfhlksdjfhlaksdjfhksladjfh in searchbox
    Then user print no autosuggetions
    And close the browser
