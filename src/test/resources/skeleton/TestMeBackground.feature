Feature: runnin background

Background:
Given Harsh launched chrome browser
And opens testMe app link

Scenario: SignIn to testme app
When he clicks on SignIn
Then he shall be able to provide credentials

Scenario: Signup to testme app
When he clicks on SignUp
Then he shall be able to provide registeration details

