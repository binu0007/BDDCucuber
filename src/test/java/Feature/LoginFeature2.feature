Feature: Testing the Login Feature of Active Time Application

Background:
# it is used to perform repeated Action and to removed the redundant code for faster execution
#precondition itself
Given The brower is launched
And  The Apllication is loaded

Scenario: Testing the login Feature with valid admin credentials
When the user enters valid username password
|admin|manager|
|trainee|trainee|
And the user clicks on the login button
Then dashboard should displayed

				# Difference b/w Example keyword and Data Table 
#->if you using example keyword(scenario outline) you can you the data whenever we want the data but in the case of data table
#it is restricted to use. 
#->scenario outline keyword data table for the completed scenarios but data table is for a specific steps.

#->In the scenario outline get executed based pn the number of row executed but in dataTable it will executed only once.
