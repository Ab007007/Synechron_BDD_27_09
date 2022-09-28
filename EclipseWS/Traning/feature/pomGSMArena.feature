@pom
Feature: Print the product Names in GSM Arena

  # Implement the Scenario using
  # Hooks
  Background: 
    Given user is on gsmarena application

  Scenario: Validate Mobile details
    When pomuser select "Apple"
    Then pomuser will print all the phone names which has 14 in it
    And pomuser will print all the watchs with series 8
   
  