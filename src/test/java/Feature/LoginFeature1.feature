Feature: Testing the Login Feature of Active Time Application

Background:
# it is used to perform repeated Action and to removed the redundant code for faster execution
#precondition itself
Given The brower is launched
And  The Apllication is loaded

Scenario Outline: Testing the login feature with valid data

#precondition itself
#Given The browser is launched
#And  The Application is loaded

#Representing  the Action of Test cases
When The user Enters the valid Credential in "<username>" and "<password>"

And The user Click on Login button

#Representating previous Action
Then Dashbord will Display

Examples:
|username|	|password|
|admin|		|manager|
|trainee|	|trainee|
|binu|		|kumar|