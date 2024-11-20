package org.testRunner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;
import org.reports.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(tags = " @book", glue = "org.stepDefinition", dryRun = false, monochrome = true, features = "src\\test\\resources\\Feature\\", plugin = {
		"json:target/name3.json", "pretty" })
public class RunnerClass {

	@AfterClass
	public static void afterClass() {

		Reporting.generateJVMReport("C:\\Users\\Kulasekaran\\eclipse-workspace\\Adactin_hotel\\target\\name3.json");
	}

}
