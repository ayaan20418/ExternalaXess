package com.webapp.runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;
@RunWith(Cucumber.class)
@CucumberOptions(

		features = "./src/test/resources/Features/login.feature",

		glue = { "com/webapp/steps" },

		dryRun = false,

		plugin = { "pretty", "html:target/Html-output", "junit:target/Junit-output/index.xml",
				"json:target/cucumber/cucumber.json"},

		monochrome = true,

		strict = true,
		
		tags= "@Regression"

)

public class TestRunner extends AbstractTestNGCucumberTests {

}
