@tag3
Feature: Verify organization page
 @organizationpage @smoke
  Scenario: Navigating to particular organization page
    Given User is on organization page
    And Click on the organization
    Then User should be navigated to the homepage

