@implementing
Feature: Print the product Names in GSM Arena

  # Implement the Scenario using
  # Hooks
  Background: 
    Given user is on gsmarena application

  Scenario: Validate Mobile details
    When user select "Apple"
    Then user will print all the phone names which has 14 in it
    And user will print all the watchs with series 8
   
  Scenario: Validate Mobile details
    When user select "Apple"
    Then user click on "iphone 14 pro max"
    And user will print the camera details of the phone
   
  #Scenario: Validate Mobile details
    #When user select "apple"
    #Then user select the phone and print camera details
      #| iphone 14         |
      #| iphone 14 pro     |
      #| iphone 14 pro max |
  