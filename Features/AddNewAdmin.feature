 @NewAdmin
Feature: Adding NewAdmin
In order to add a new Admin
as a admin
I want to go to Add User page,select User role as Admin,enter EmployeName,Username,select Active status,enter password,confirm password then save
So that I can creat a new Admin

Scenario Outline: positive- Adding New Admin
Given Admin Login to Admin homepage
When Admin click on Admin link,
And  click on AddButton
And select UserRole Admin,
And Write Valid EmployeeName  "<EmployeeName>"
And Write username  "<Username>"
And Select Status as Enabled, 
And Enter Password"<EnterPassword>" 
And ConfirmPassword "<ConFirmPassword>" 
And click Save Button
Then ConfirmationMessage will display
Then close Browser
 
 Examples:
 |EmployeeName|Username|EnterPassword|ConFirmPassword|
 |John Smith |   rubelddm| 123456789|123456789|
 
 
 Scenario Outline: Negative- EmployeeName text editor can not be Null
Given Admin Login to Admin homepage
When Admin click on Admin link,
And  click on AddButton
And select UserRole Admin,
And Null  EmployeeName Text box "<EmployeeName>" 
And Write username  "<Username>"
And Select Status as Enabled, 
And Enter Password"<EnterPassword>" 
And ConfirmPassword "<ConFirmPassword>" 
And click Save Button
Then EmployeeName Edite box Cannot be emty message will appear
Then close Browser
 
 Examples:
 |EmployeeName|Username|EnterPassword|ConFirmPassword|
 |  |   rubelddm| 123456789|123456789|