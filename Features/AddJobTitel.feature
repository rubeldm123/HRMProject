@Job
Feature: Add Job Titel
In order to add a job title
as a Admin
I want to go to Add job Title page , enter Automation Tester,job description,put notes,then save
so that I can creat a new job title

Scenario Outline:Positive- Admin add Job Titel
Given Admin Login it Admin HomePage
When Admin MouseHober Admin, job, select Jobtitles and click
And click onAdd Button
And Write jobTitel "<JobTitel>"
And Write JobDescription "<JobDescription>"
And Choose FIle
And Write Note "<Note>"
And click Save
Then Confirmation Message will display
Then Browser will Close
Examples:
|JobTitel         |JobDescription      |Note|
|Automation Tester| using selenium java|You will responsibel for this job|

Scenario Outline:Negative- Admin Unable to Job Titel
Given Admin Login it Admin HomePage
When Admin MouseHober Admin, job, select Jobtitles and click
And click onAdd Button
And Write jobTitel Nul "<JobTitel>"
And Write JobDescription "<JobDescription>"
And Choose FIle
And Write Note "<Note>"
And click Save
Then Error Message will display
Then Browser will Close
Examples:
|JobTitel         |JobDescription      |Note|
| | using selenium java|You will responsibel for this job|








