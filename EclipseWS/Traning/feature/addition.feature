@nonui
Feature: Addition of two number

@regression @sut
Scenario: Adding two any numbers
Given user has two numbers
When user perform addition
Then user get sum of two numbers


Scenario: Adding two positive numbers
Given user has 3 and 4
When user perform addition
Then user get sum of two numbers as 7

Scenario: Adding two negative numbers
Given user has -3 and -4
When user perform addition
Then user get sum of two numbers as -17