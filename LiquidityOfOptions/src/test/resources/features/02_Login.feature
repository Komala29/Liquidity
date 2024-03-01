@tag2
Feature: User should be able to access the liquidity platform


@login @validcredentials @smoke @regression
Scenario Outline: Login with valid credentials
Given User is on marketplace login page and enters valid username  <email>
And enters valid password  <password>
And Click on Login button
Then User should login successfully and be on organization page 
# But User should not login successfully when the invalid credentials are entered 
Examples: 
|email                     |password|
|soundhar.g@qapita.com     |Test123!|
