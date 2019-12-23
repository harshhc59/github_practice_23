Feature: Demo workshop login
This is to test whether user is able to login successfully on Demo Website

Scenario Outline: Valid Login
Given Demo workshop homepage is opened
And she clicked on Login Link
When I send "<Login>" and "<Password>"
And click on Login buttom
Then the products page is obtained

Examples:
|Login|Password|
|karthik456@gmail.com|karthik456|

