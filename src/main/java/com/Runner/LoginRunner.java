package com.Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		
			features = "C:\\Users\\Danda\\selenium\\FreeCRMBDDFramework\\src\\main\\java\\com\\Features\\dealsmap.Feature",
					
			glue={"com.stepDefinition"},  //glue is for statedefinition class.just package name is enough
			plugin= {"pretty","html:test-outout","junit:junit_xml/cucumber.xml"},//report will come ina nice way.for reports use plugin
			dryRun=false,
			monochrome=true,
			strict=true
			)
	 
	public class LoginRunner {
	 	}	
