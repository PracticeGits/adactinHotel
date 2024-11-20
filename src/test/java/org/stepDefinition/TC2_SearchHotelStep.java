package org.stepDefinition;

import org.base.BaseClass;
import org.junit.Assert;
import org.pageObjectManager.PageObjectManager;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TC2_SearchHotelStep extends BaseClass{
	
	PageObjectManager pom = new PageObjectManager();
	

	@When("User search by entering all the fields {string},{string},{string},{string},{string},{string},{string} , {string} and click")
	public void user_search_by_entering_all_the_fields_and_click(String location, String hotels, String room_type, String room_nos, String datepick_in, String datepick_out, String adult_room, String child_room) {
	
	pom.getSearchHotelPage().enteringSearchFields(location, hotels, room_type, room_nos, datepick_in, datepick_out, adult_room, child_room);
	
	
	
	}
	@Then("User sould verify after select hotel success message {string}")
	public void user_sould_verify_after_select_hotel_success_message(String expectedText) {
		
	String actualText = pom.getSelectHotelPage().verifySelectHotelText();
	Assert.assertEquals(expectedText, actualText);
	
	}



	
	

}
