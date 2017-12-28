package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;

public class TestRunnerTestNG {
	
	@CucumberOptions(
			//features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\orgLoginpage.feature", 
	        //features = "C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AddCandidate.feature", 
			// features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AddVacancy.feature",
	        //features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AddNewAdmin.feature",
	        //features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AddLocation.feature",
			//features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AddNewEmployee.feature",
			//features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\SearchDirectory.feature",
			//features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AddJobTitel.feature",
			//features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\AssignLeave.feature",
	     // features="C:\\Users\\rubeldm\\eclipse-workspace\\orangeHRM\\Features\\logout.feature",
			features="Features",
			
		
	        glue="stepDef",
	       // tags= {"@Login"},
	        plugin= {"html:target/cucumber-html-report"}
	  
	      
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}

}
//@Login 
//@AddCandidate
//@AddNewVacancy
//@NewAdmin
//@location
//@NewEmployee
//@Search
//@Job
//@Assign
//@Logout