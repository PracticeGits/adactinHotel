package org.stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaseClass;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks extends BaseClass {

	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {

		getDriver(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("Url"));
		maximizeWindow();
		implicitWait();
	}

	@After
	public void afterScenario(Scenario scenario) {
		if (scenario.isFailed()) {
			scenario.attach(screenshot(), "images.png", "Every Scenario");
		}
		closeWindow();

	}

}
