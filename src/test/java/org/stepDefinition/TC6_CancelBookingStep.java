package org.stepDefinition;

import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class TC6_CancelBookingStep extends BaseClass {

	PageObjectManager pom = new PageObjectManager();

	@When("User navigate to My Itinery page")
	public void user_navigate_to_my_itinery_page() {
		pom.getCancelBookingPage().bookedItinerary();
	}

	@Then("User should verify the  message {string} after navigate to My Itinery page")
	public void user_should_verify_the_message_after_navigate_to_my_itinery_page(String actualMsg) {
		String expectedMsg = pom.getCancelBookingPage().verifyBookedItineraryMsg();
		Assert.assertEquals(expectedMsg, actualMsg);

	}

	@When("User search the orderId with saved orderId")
	public void user_search_the_order_id_with_saved_order_id() {
		pom.getCancelBookingPage().enterSavedOrderId();

	}

	@Then("User should verify the same orderId is present successfully")
	public void user_should_verify_the_same_order_id_is_present_successfully() {
		String actualorderId = pom.getCancelBookingPage().orderIdverify();
		Assert.assertEquals(actualorderId, orderNumber);
	}

	@Then("User should verify the same hotel name {string} is present successfully")
	public void user_should_verify_the_same_hotel_name_is_present_successfully(String expectedHotelName) {
		String actualHotelName = pom.getCancelBookingPage().hotelNameverify();
		Assert.assertEquals(actualHotelName, expectedHotelName);

	}

	@Then("User select the hotel and hit cancel selected")
	public void user_select_the_hotel_and_hit_cancel_selected() {
		
		pom.getCancelBookingPage().cancelOrder();
		Alert a = driver.switchTo().alert();
		a.accept();
	}

	@Then("User should verify the  message {string}")
	public void user_should_verify_the_message(String expectedErrorMsg) throws InterruptedException {
	Thread.sleep(5000);
	String actalErrorMsg = pom.getCancelBookingPage().searchErrorMsg();
	Assert.assertEquals(expectedErrorMsg, actalErrorMsg);
	}
	

}
