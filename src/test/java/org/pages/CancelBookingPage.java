package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CancelBookingPage extends BaseClass {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "my_itinerary")
	private WebElement myItinerary;

	@FindBy(xpath = "//table//tr//td[text()='Booked Itinerary']")
	private WebElement bookedItinerary;

	@FindBy(id = "order_id_text")
	private WebElement orderIdField;

	@FindBy(id = "search_hotel_id")
	private WebElement go;

	@FindBy(xpath = "(//table//tr//td)[27]//input")
	private WebElement orderIdTxt;
	// table//tr//td//input[@value='"+ordernumber+"']
	@FindBy(xpath = "(//table//tr//td)[29]//input")
	private WebElement hotelNameTxt;

	@FindBy(xpath = "(//table//tbody//tr//td//input[@type='checkbox'])[2]")
	private WebElement checkBox;

	@FindBy(xpath = "//table//tr[3]//td//input[@value='Cancel Selected']")
	private WebElement cancelSelected;

	// alert should come

	@FindBy(xpath = "//table//tr//td//label")
	private WebElement searchResultError;

	// getters

	public WebElement getMyItinerary() {
		return myItinerary;
	}

	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}

	public WebElement getOrderIdField() {
		return orderIdField;
	}

	public WebElement getGo() {
		return go;
	}

	public WebElement getOrderIdTxt() {
		return orderIdTxt;
	}

	public WebElement getHotelNameTxt() {
		return hotelNameTxt;
	}

	public WebElement getCheckBox() {
		return checkBox;
	}

	public WebElement getCancelSelected() {
		return cancelSelected;
	}

	public WebElement getSearchResultError() {
		return searchResultError;
	}

	// methods

	public void bookedItinerary() {
		elementClick(getMyItinerary());
	}

	public String verifyBookedItineraryMsg() {

		String expectedMsg = elementGetText(getBookedItinerary());
		return expectedMsg;
	}

	public void enterSavedOrderId() {

		elementSendKeys(getOrderIdField(), orderNumber);
		elementClick(go);
	}

	public String orderIdverify() {

		visibilityOfElements(getOrderIdTxt());
		String expextedOrderId = getattributevalue(getOrderIdTxt(), "value");
		return expextedOrderId;
	}

	public String hotelNameverify() {
		visibilityOfElements(getHotelNameTxt());
		String expectedHotelName = getattributevalue(getHotelNameTxt(), "value");
		return expectedHotelName;
	}

	public void cancelOrder() {

		elementClick(getCheckBox());
		elementClick(getCancelSelected());
	}

	public String searchErrorMsg() {

		String actualErrorMsg = elementGetText(getSearchResultError());
		return actualErrorMsg;
	}

}
