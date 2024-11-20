package org.stepDefinition;

import java.io.FileNotFoundException;
import java.io.IOException;

import org.base.BaseClass;
import org.junit.Assert;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC1_LoginStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@Given("User in Adactin Hotel Page")
	public void user_in_adactin_hotel_page() throws FileNotFoundException, IOException {

//		getDriver(getPropertyFileValue("browser"));
//		getUrl(getPropertyFileValue("Url"));
//		maximizeWindow();
//		implicitWait();

	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String user, String password) {

		pom.getLoginPage().login(user, password);
	}

	@Then("User should verify after login success message {string}")
	public void user_should_verify_after_login_success_message(String expectedLoginSuccessMsg) {
		String actloginSuccessMsg = pom.getSearchHotelPage().loginSuccessMsg();
		Assert.assertEquals(expectedLoginSuccessMsg, actloginSuccessMsg);

	}

}
