Feature: Login dfbdbf
Scenario: Successful Login with valid credentials


Given User Launch Chrome browser
When User opens URL 
And User enters Email as  and Pssword as 
And Click on Login
Then Page Title should be 
When User click on Log out link
Then Page Title should be 
And  close browser 