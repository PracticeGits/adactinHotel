package org.stepDefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;

public class TC3_selectHotelStep extends BaseClass {
	PageObjectManager pom = new PageObjectManager();

	@Then("User should verify hotel name present with selected {string} successfully and  click and click continue")
	public void user_should_verify_hotel_name_present_with_selected_successfully_and_click_and_click_continue(
			String hotel) {

		String hotelNameCheck = pom.getSelectHotelPage().verifyHotelNamePresent();
	
		Assert.assertEquals(hotel,hotelNameCheck);
		
		pom.getSelectHotelPage().selectAndContinue();
		
	} 

	@Then("User should verify {string} message")
	public void user_should_verify_message(String expextedText) {
		
		String verifyBookHoteltext = pom.getBookHotelPage().verifyBookHoteltext();
		Assert.assertEquals(expextedText, verifyBookHoteltext);
		
	}

}
