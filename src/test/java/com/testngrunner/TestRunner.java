package com.testngrunner;

import cucumber.api.CucumberOptions;
import cucumber.api.testng.AbstractTestNGCucumberTests;


	
	@CucumberOptions(
			features="/Users/mdrubel/git/HRMProject/Features/orgLoginpage.feature", 
	        
			//features="Features",
			
		
	        glue="stepDef",
	       // tags= {"@Login"},
	        plugin= {"html:target/cucumber-html-report"}
	  
	      
	        )

	public class TestRunner extends AbstractTestNGCucumberTests{}


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