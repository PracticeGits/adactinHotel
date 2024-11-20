package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class bookingConfirmationPage extends BaseClass {

	public bookingConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	

	// webelements

	@FindBy(xpath = "//table//tr//td[text()='Booking Confirmation ']")
	private WebElement txtBookingConfirmationMsg;

	@FindBy(id = "hotel_name")
	private WebElement hotelName;

	@FindBy(id = "order_no")
	private WebElement orderNo;

	// setters

	public WebElement getTxtBookingConfirmationMsg() {
		return txtBookingConfirmationMsg;
	}

	public WebElement getHotelName() {
		return hotelName;
	}

	public WebElement getOrderNo() {
		return orderNo;
	}

	// methods

	public String verifyBookingConfirmationText() throws InterruptedException {

		Thread.sleep(5000);
		String elementGetText = elementGetText(getTxtBookingConfirmationMsg());
		return elementGetText;
	}

	public String hotelName() {
		String hotelName = getattributevalue(getHotelName(), "value");
		return hotelName;
	}

	public String orderIdSave() {
		orderNumber =  getattributevalue(getOrderNo(), "value");
		return orderNumber;
	}

}
