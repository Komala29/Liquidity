@tag3
Feature: User should be on the home page 

Scenario Outline: Verify the user is on homepage
Given User is on home page and Information Modal opens
When Click on Close icon of information modal
And Click on Manage Options
And Select Exercise Options
And Click on Create New Exercise Event Button
Then User should be navigated to the Exercise Event Creation page