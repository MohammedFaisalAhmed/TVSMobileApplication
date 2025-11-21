package com.tvsmobileapp.testrunner;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions
(
		features="src/test/resources/features/testdata.feature",
		glue= {"com.tvsmobileapp.stepdefinitions"},
		tags="@Regression",
		plugin= {"pretty","html:target/Cucumber-Results.html"},
		dryRun=false,
		monochrome=true	
		
		
		)


public class TestRunner extends AbstractTestNGCucumberTests
{
@DataProvider(parallel=false)
@Override
public Object[][] scenarios() {
	// TODO Auto-generated method stub
	return super.scenarios();
}

}
