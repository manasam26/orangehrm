Feature: orangehrm demo
this used to verify the functionality of orangehrm demo page
@tc_01_login
Scenario Outline: i want to validate the login functionality of orangehrm webpage
Given i will the  launch browser and open orangehrm webpage
When login page appears  i will give "<username>" and "<password>"
And i will click on login button

Examples:      
			|username                 |password       |
			|Admin                 |admin123|
			|admin                 |admin|
@tc_02_admin
Scenario: goto admin link and search for system users
Given i  will launch orangehrm page
Then i will select admin block
Then i will enter usenname,role ,employee name and status
And i will click search bar
@tc_03_directory
Scenario: goto directory menu and search for employees
Given i will launch orangehrm webpage
Then i will go the directory menu
Then i will give name and jobtitle
And i will click on reset button
@tc_04_dashboard
Scenario: go to dashboard and view timesheets
Given i will open orangehrm webpage
Then i will go to dashboard
Then i will click on timesheets
Then i will enter the name
And click on view button
 
