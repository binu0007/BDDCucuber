Feature: Testing the Login Feature of Active Time Application

Background:
# it is used to perform repeated Action and to removed the redundant code for faster execution
#precondition itself
Given The brower is launched
And  The Apllication is loaded

Scenario: Testing the login Feature with valid admin credentials
When the user enters valid username and password
|username|password|
|admin|manager|
|trainee|trainee|
And The user must Clicks on the login button 
Then dashboard should be displayed

# if there are N Number of fields than we will go on Map. If limited fields than we will go for List
