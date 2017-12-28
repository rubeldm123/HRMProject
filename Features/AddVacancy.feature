@AddNewVacancy
Feature: AddNewVacancy
In order to add a job  vacancy
as a admin
i want to go to add job vacancy page,select job title,enter vacancy name,hiring manager name,
number of positions,description of position,select active then save 
So that I can creat a new vacancy 

Scenario Outline: positive-Add New Vacancy

Given  Admin navigate to Admin Home Page
When Admin click on Recruitment link,
And  click on Vacancies link  
And click on Add button
And Select Job Titel as IT Manager,
And enter VacancyName "<VacancyName>"
And enter HiringManager "<HiringManager>"
And enter NumberOfPosition "<NumberOfPosition>"
And Write Description"<Description>"
And  click on Active Box
And click on Save button

Then Admin will get confirmation message
Then Browser will close Automaticaly

Examples:
|VacancyName        |HiringManager |NumberOfPosition|Description                |
|sales|Jasmine Morgan|1               |This is for only TT student|


Scenario Outline: Negative-Add New Vacancy

Given  Admin navigate to Admin Home Page
When Admin click on Recruitment link,
And  click on Vacancies link  
And click on Add button
And Select Job Titel as IT Manager,
And And enter VacancyName "<VacancyName>"
And   HiringManager Null"<HiringManager>"
And enter NumberOfPosition "<NumberOfPosition>"
And Write Description"<Description>"
And  click on Active Box
And cick on Save Button

Then VacancyName fild cannot be empty
Then Browser will close Automaticly

Examples:
|VacancyName|HiringManager |NumberOfPosition|Description                |
| auto  |                   |1               |This is for only TT student|


