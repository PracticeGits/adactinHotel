package org.stepDefinition;

import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC4_BookHotelStep {

	PageObjectManager pom = new PageObjectManager();

	@Then("User book by entering all the required fiels {string},{string},{string},{string},{string},{string},{string},{string} and click BookNow")
	public void user_book_by_entering_all_the_required_fiels_and_click_book_now(String firstName, String lastName,
			String billingAddress, String ccNum, String ccType, String expMonth, String expYear, String cvvNum) {
		
		pom.getBookHotelPage().bookHotelAllFields(firstName, lastName, billingAddress, ccNum, ccType, expMonth, expYear, cvvNum);

	}
	

	@Then("User should verify {string} is present")
	public void user_should_verify_is_present(String expectedBookingConfirmationText) throws InterruptedException {
		
		String actualBookingConfirmationText = pom.getBookingConfirmationPage().verifyBookingConfirmationText();
		Assert.assertEquals(expectedBookingConfirmationText, actualBookingConfirmationText);
		
	}




}
