package org.pages;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BaseClass {

	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	// setters
	@FindBy(id = "username")
	private WebElement txtUserName;

	@FindBy(id = "password")
	private WebElement txtPasssword;

	@FindBy(id = "login")
	private WebElement txtLoginBtn;

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPasssword() {
		return txtPasssword;
	}

	public WebElement getTxtLoginBtn() {
		return txtLoginBtn;
	}

	// methods

	public void login(String userName, String password) {

		elementSendKeys(txtUserName, userName);
		elementSendKeys(txtPasssword, password);
		elementClick(txtLoginBtn);

	}

}
