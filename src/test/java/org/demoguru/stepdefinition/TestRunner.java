package org.demoguru.stepdefinition;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features="C:\\Users\\m\\eclipse-workspace\\CucumberTask\\src\\test\\resources\\pom.feature", glue="org,demoguru.stepdefinition",
dryRun=false, tags= {"@Feature1","~@smokeTest"}, monochrome=true,plugin= {"pretty","json:target/Cucumber_Report/demoguru.json/"})


public class TestRunner {
	

}
