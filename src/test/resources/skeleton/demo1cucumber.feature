Feature: login
This is to test whether user is able to login 
Scenario: Valid Login
Given The user is on testme app homepage
When the user gives valid login and valid password
Then user should be able to login
