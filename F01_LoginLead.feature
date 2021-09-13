@login
Feature: LoginFunctionality of LeafTaps Application

#Background: 
#Given open the browser
#And load the application url 'http://leaftaps.com/opentaps/'

Scenario Outline: TC001_Login test with positive credentials
#Given open the browser
#And load the application url 
Given Enter the username as <username>  
Given Enter the password as <password> 
When click on login button 
Then Home page displayed 

Examples: 
|username|password|
|'demosalesmanager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

Scenario: TC002_Login tets with negetive Credentials
Given Enter username as 'demo123' 
Given Enter password as 'crmsfa' 
When click on login button 
But Error message should be displayed 



