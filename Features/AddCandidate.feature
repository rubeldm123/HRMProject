@AddCandidate
Feature: add candidate
In order to Add a new candidte
as an Admin 
I want to go to Add candidate page, enter first name,middle name, last name, email, contactNo, select job vacancy, upload resume, write keywords, write comment,enter date of application then save
so that i can creat a new candidate

Scenario Outline: positive-Admin add new candidates
Given  Admin navigate to AdminHomePage
When Admin click on Recruitment link
And click on Candidates
And click on Add Button 
And enter FirstName"<firstName>"
And enter MiddleName"<middleName>"
And enter LastName"<lastName>"
And  enter Email"<email>"
And  enter contactNO"<contactNo>"
And AttachFil, 
And Write Keywords "<keywords>"
And WriteComment"<writeComment>"
And choose date of application 
And clickOn Save Button 
Then confirmationMmessage will display
Then Browser Must closssAfter All test Completed
Examples:
|firstName|middleName|lastName|email|contactNo|keywords|writeComment|EnterDate|
|md|MO|Rubel|rubel123@gmail.com|1234|hello|this is admin|12/132017|


Scenario Outline: Negative-Admin Unable to Add candidates
Given  Admin navigate to AdminHomePage
When Admin click on Recruitment link
And click on Candidates
And click on Add Button 
And FirstName Null"<firstName>"
And enter MiddleName"<middleName>"
And enter LastName"<lastName>"
And  enter Email"<email>"
And  enter contactNO"<contactNo>"
And AttachFil, 
And Write Keywords "<keywords>"
And WriteComment"<writeComment>"
And choose date of application 
And clickOn Save Button 
Then confirmationMessage will display
Then  Browser Must closssAfter All test Completed
Examples:
|firstName|middleName|lastName|email|contactNo|keywords|writeComment|EnterDate|
| |MO|Rubel|rubel123@gmail.com|1234|hello|this is admin|12/132017|
