Feature: FreeCrm login feature


Scenario: FreeCrm login test scenario

Given User is on login page
When User enter valid credentials
And click on login button
Then User should be able to see homepage
And logout from the page


Scenario: FreeCrm login test scenario with multiple inputs

Given User is on login page
When User enters "akjs@gmail.com" and "adjjs@342"
And click on login button
Then User should be able to see "Invalid login"

Scenario Outline: FreeCrm login test scenario with multiple inputs

Given User is on login page
When User enters "<username>" and "<password>"
And click on login button
Then User should be able to see "<message>"

Examples: 
	|username|password|message|
	|abc@gmail.com|ach@6d|Invalid login|
	|iamhasan097@gmail.com|Hasan@1998|Invalid login|