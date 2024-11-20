package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class SearchHotelPage extends BaseClass {

	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
	}


	// setters
	@FindBy(xpath = "//table//td[contains(text(),'Welcome to Adactin Group of Hotels')]")
	private WebElement txtLoginSuccessMsg;

	@FindBy(id = "location")
	private WebElement location;

	@FindBy(id = "hotels")
	private WebElement hotels;

	@FindBy(id = "room_type")
	private WebElement room_type;

	@FindBy(id = "room_nos")
	private WebElement room_nos;

	@FindBy(id = "datepick_in")
	private WebElement datepick_in;

	@FindBy(id = "datepick_out")
	private WebElement datepick_out;

	@FindBy(id = "adult_room")
	private WebElement adult_room;

	@FindBy(id = "child_room")
	private WebElement child_room;

	@FindBy(id = "Submit")
	private WebElement Submit;

	// getters

	public WebElement getTxtLoginSuccessMsg() {
		return txtLoginSuccessMsg;
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotels() {
		return hotels;
	}

	public WebElement getRoom_type() {
		return room_type;
	}

	public WebElement getRoom_nos() {
		return room_nos;
	}

	public WebElement getDatepick_in() {
		return datepick_in;
	}

	public WebElement getDatepick_out() {
		return datepick_out;
	}

	public WebElement getAdult_room() {
		return adult_room;
	}

	public WebElement getChild_room() {
		return child_room;
	}

	public WebElement getSubmit() {
		return Submit;
	}

	// methods

	public String loginSuccessMsg() {

		String successMsg = elementGetText(getTxtLoginSuccessMsg());
		return successMsg;
	}

	public void enteringSearchFields(String location, String hotel, String roomType, String noOfrooms, String checkIn,
			String checkOut, String adult, String children) {

		selectOptionByText(getLocation(), location);
		selectOptionByText(getHotels(), hotel);
		selectOptionByText(getRoom_type(), roomType);
		selectOptionByText(getRoom_nos(), noOfrooms);
		clearText(getDatepick_in());
		elementSendKeys(getDatepick_in(), checkIn);
		clearText(getDatepick_out());
		elementSendKeys(getDatepick_out(), checkOut);
		selectOptionByText(getAdult_room(), adult);
		selectOptionByText(getChild_room(), children);
		elementClick(getSubmit());

	}

	

}
