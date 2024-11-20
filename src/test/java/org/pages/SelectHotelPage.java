package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotelPage extends BaseClass {

	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}

	// setters
	@FindBy(xpath = "//table//td[contains(text(),'Select Hotel ')]")
	private WebElement txtSelectHotelSuccessMsg;
	
	@FindBy(id  = "hotel_name_0")
	private WebElement hotelNameCheck;
	
	@FindBy(id = "radiobutton_0")
	private WebElement radiobutton;
	
	@FindBy(id = "continue")
	private WebElement continue1;
	

	// getters

	public WebElement getRadiobutton() {
		return radiobutton;
	}


	public WebElement getContinue1() {
		return continue1;
	}


	public WebElement getTxtSelectHotelSuccessMsg() {
		return txtSelectHotelSuccessMsg;
	}
	
	
	public WebElement getHotelNameCheck() {
		return hotelNameCheck;
	}

	// methods

	public String verifySelectHotelText() {

		String elementGetText = elementGetText(getTxtSelectHotelSuccessMsg());
		return elementGetText;

	}
	
	public String verifyHotelNamePresent() {
		
		String getattributevalue = getattributevalue(getHotelNameCheck(), "value");
		
//		String elementGetText = elementGetText(getHotelNameCheck());
		return getattributevalue;

	}
	
	public void selectAndContinue() {

		elementClick(getRadiobutton());
		elementClick(getContinue1());
	}
	
	
	

}
