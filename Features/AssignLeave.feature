@Assign
Feature: Assign Leave
In order to Assign Leave 
 As an Admin 
 I want to  Assing Leave to test Assign Leave page
 
 Scenario Outline: Positive- Assign leave 
 
 Given Admin in Admin HomePage
 When click on Leave Link
 And click on Assign Link
 And Admin Write EmployeeName "<name>"
 And select Leave Type
 And Select From Date from calender
 And Select To date from calender 
 And click on Assign button
 Then confirmation message will display
 Then close driver 
 Examples:
 |name|
 |John Smith|

Scenario Outline: Negative- Assign leave 
 
 Given Admin in Admin HomePage
 When click on Leave Link
 And click on Assign Link
 And Admin Write EmployeeName null "<name>"
 And select Leave Type
 And Select From Date from calender
 And Select To date from calender 
 And click on Assign button
 Then Error  message will display and fail test 
 Examples:
 |name|
 |  |

 