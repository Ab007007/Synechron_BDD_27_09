Feature: Print AutoSuggestions

  Scenario Outline: Suggestions for Company
    Given user is on google page
    When user enter <company> in searchbox
    Then user print all autosuggetions
    And close the browser

    Examples: 
      | company   |
      | synechron |
      | IBM       |
      | Wipro     |