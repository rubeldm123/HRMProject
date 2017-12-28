@location
Feature: Add Location
In order to Add Location
as a admin
I want to go to Add Location page,enter Name,select Country,enter City,Address,Zip/PostalCode,Phone,Fax,put Notes then Save
so that I can add a new location

Scenario Outline: positive- Admin Add New Location
Given Admin is in Admin homepage
When Mouse hover to Admin, organization and click on locations link
And click Add Button
And Enter Name"<Name>"
And  Select_country
And  Select State/Province
And  Enter City"<City>"
And Enter Address "<Address>"
And  Enter ZipCode "<Zip/PostalCode>"
And  Enter phoneNumber"<PhoneNumber>"
And Enter FaxN"<FaxNumber>"
And  Write Notes"<Notes>" 
And click On Save Button 
Then Positiveconfirmation message will display
Then Browser will closee After complete test
 
 Examples:
 |Name          |City    |Address         |Zip/PostalCode|PhoneNumber|FaxNumber|Notes               |
 |abnmkffn|Brooklyn|123 flushing ave|11234         |918772626|276766     | Welcome to New York|

Scenario Outline: Negative- Admin Unable to Add New Location
Given Admin is in Admin homepage
When Mouse hover to Admin, organization and click on locations link
And click Add Button
And Enter InValidName"<Name>"
And  Select_country
And  Select State/Province
And  Enter City"<City>"
And Enter Address "<Address>"
And  Enter ZipCode "<Zip/PostalCode>"
And  Enter phoneNumber"<PhoneNumber>"
And Enter FaxN"<FaxNumber>"
And  Write Notes"<Notes>" 
And click On Save Button 
Then Negativeconfirmation message will display
Then Browser will closee After complete test
 
 Examples:
 |Name          |City    |Address         |Zip/PostalCode|PhoneNumber|FaxNumber|Notes               |
 |              |Brooklyn|123 flushing ave|11234         |918772626|276766     | Welcome to New York|





