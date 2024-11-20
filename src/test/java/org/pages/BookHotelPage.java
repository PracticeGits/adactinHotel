package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookHotelPage extends BaseClass {

	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}


	// setters
	@FindBy(xpath = "//table//td[contains(text(),'Book A Hotel ')]")
	private WebElement txtBookHotelSuccessMsg;

	@FindBy(id = "first_name")
	private WebElement firstName;

	@FindBy(id = "last_name")
	private WebElement lastName;

	@FindBy(id = "address")
	private WebElement billing_Address;

	@FindBy(id = "cc_num")
	private WebElement cc_Num;

	@FindBy(id = "cc_type")
	private WebElement cc_Type;

	@FindBy(id = "cc_exp_month")
	private WebElement cc_Exp_Month;

	@FindBy(id = "cc_exp_year")
	private WebElement cc_Exp_Year;

	@FindBy(id = "cc_cvv")
	private WebElement cvv_Number;

	@FindBy(id = "book_now")
	private WebElement bookNowBtn;

	// getters
	public WebElement getTxtBookHotelSuccessMsg() {
		return txtBookHotelSuccessMsg;
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getBilling_Address() {
		return billing_Address;
	}

	public WebElement getCc_Num() {
		return cc_Num;
	}

	public WebElement getCc_Type() {
		return cc_Type;
	}

	public WebElement getCc_Exp_Month() {
		return cc_Exp_Month;
	}

	public WebElement getCc_Exp_Year() {
		return cc_Exp_Year;
	}

	public WebElement getCvv_Number() {
		return cvv_Number;
	}

	public WebElement getBookNowBtn() {
		return bookNowBtn;
	}

	// methods

	public String verifyBookHoteltext() {

		String elementGetText = elementGetText(getTxtBookHotelSuccessMsg());
		return elementGetText;
	}

	public void bookHotelAllFields(String firstName, String lastName, String billingAddress, String ccNum,
			String ccType, String expMonth, String expYear, String cvvNumber) {

		elementSendKeys(getFirstName(), firstName);
		elementSendKeys(getLastName(), lastName);
		elementSendKeys(getBilling_Address(), billingAddress);
		elementSendKeys(getCc_Num(), ccNum);
		selectOptionByText(getCc_Type(), ccType);
		selectOptionByText(getCc_Exp_Month(), expMonth);
		selectOptionByText(getCc_Exp_Year(), expYear);
		elementSendKeys(getCvv_Number(), cvvNumber);
		elementClick(getBookNowBtn());

	}

}
