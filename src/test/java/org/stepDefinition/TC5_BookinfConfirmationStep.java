package org.stepDefinition;

import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import junit.framework.Assert;

public class TC5_BookinfConfirmationStep {
	PageObjectManager pom = new PageObjectManager();



	@Then("User should verify after booked selected hotel name {string} is present successfully and save the orderID")
	public void user_should_verify_after_booked_selected_hotel_name_is_present_successfully_and_save_the_order_id(String actualHotelName) {
		
		String expectedHotelName = pom.getBookingConfirmationPage().hotelName();
		System.out.println(pom.getBookingConfirmationPage().orderIdSave());
		System.out.println("orderid is:"+ pom.getBookingConfirmationPage().orderNumber);
		
		Assert.assertEquals(expectedHotelName, actualHotelName);
		
		
	}







	

}
