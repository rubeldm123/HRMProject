Feature: Add employee
In order to Add a new Employee
as a admin
I want to go to Add employee page,enter FirstName,MiddleName,Lastname,EmployeeId, choose Photograph Creat Username,
Password,Confirm password,selecct Status then save
So that I can Add a new Employee

Scenario Outline: positive-Admin add new Employee
Given  Admin navigate to Admin HomePage
When Admin click on PIM link
And Click on Add Button
And  Admin enter FirstName"<FirstName>"
And Enter MiddleName "<MiddleName>"
And Enter LastName"<LastName>"
And Enter EmployeeId"<EmployeeId>"
And  Upload Photograph
And  click on Create Login Details ,
And  Enter UserName "<UserName>"
And Enter password"<password>"
And Enter ConfirmPassword "<confirmPasswor>",
And  Status should be Enable 
And  clickon Save button 
Then Admin will get confirmation
Then Browser Will close
Examples:
|FirstName|MiddleName|LastName|EmployeeId|UserName|password|confirmPasswor|
|md       |MO         |Rubel   |0078      |rubeldm|password|password      |
@NewEmployee
Scenario Outline: Negative-Admin Unable to add new Employee
Given  Admin navigate to Admin HomePage
When Admin click on PIM link
And Click on Add Button
And Admin enter FirstName Null"<FirstName>"
And Enter MiddleName Null"<MiddleName>"
And Enter LastName Null"<LastName>"
And Enter EmployeeId"<EmployeeId>"
And  Upload Photograph
And  click on Create Login Details ,
And  Enter UserName "<UserName>"
And Enter password"<password>"
And Enter ConfirmPassword "<confirmPasswor>",
And  Status should be Enable 
And  clickon Save button 
Then Admin will get an Error Dirst and LastName is required
Then Browser Will close
Examples:
|FirstName|MiddleName|LastName|EmployeeId|UserName|password|confirmPasswor|
|     |MO         |   |0078      |rubeldm|password|password      |
