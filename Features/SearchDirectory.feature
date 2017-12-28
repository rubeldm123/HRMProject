@Search
Feature: Search Employee
In order to Search Employee
I want to go to Search Directory page,Enter employee Name,then Search
So that i can see Existing Employee details

Scenario Outline: Positive-Searc Valid Employee

Given Admin in AdminHomePage
When Click on Directory
And Write Existing EmployeeName"<EmployeeName>"
And Select Job Titel
And Select Location
And Click on Searc Button
Then I should be able to see the user name with his/her details
Then Close Browser

Examples:
|EmployeeName|
|Robert Craig|

Scenario Outline: Search Invalid  Employee

Given Admin in AdminHomePage
When Click on Directory  
And WriteInvalidEmployeeName"<EmployeeName>"
And Select Job Titel
And Select Location
And Click on Searc Button
Then No Record found Message Will display

Examples:
|EmployeeName|
|abcdef|

