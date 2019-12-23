Feature: Demo multi login
This is to test whether user is able to login 
Scenario Outline: Testing Multiple Logins
Given testme app homepage is opened
When I provide "<login>" and "<password>"
Then the relevant Login username is displayed

Examples:
|login|password|
|aaa1111@gmail.com|aaa111|
|aaa1112@gmail.com|aaa112|
|aaa1113@gmail.com|aaa113|
