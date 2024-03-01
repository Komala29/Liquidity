@tag
Feature: User should be able to enter all the mandatory fields in the Event Info screen

  @tag2
  Scenario Outline: User should be able to enter all the mandatory fields
    Given User is on the event creation page
    When User should be able to enter Event Name <EventName>
    And User should be able to enter the Event Start Date
    And User should be able to enter the Event Start Time
    And User should be able to enter the Event End date
    And User should be able to enter the Event End Time
    Then Click on Next button
     
