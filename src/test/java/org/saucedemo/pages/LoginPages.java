package org.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.saucedemo.baseclass.BaseClass;

public class LoginPages extends BaseClass {
	public LoginPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "user-name")
	private WebElement txtUserName;
	@FindBy(id = "password")
	private WebElement txtPass;
	@FindBy(id = "login-button")
	private WebElement clkLogin;
	@FindBy(xpath = "//h3[contains(text(),'Epic sadface: Username and password do not match any user in this service')]")
	private WebElement loginErrMessage;

	public WebElement getLoginErrMessage() {
		return loginErrMessage;

	}

	public WebElement getTxtUserName() {
		return txtUserName;
	}

	public WebElement getTxtPass() {
		return txtPass;
	}

	public WebElement getClkLogin() {
		return clkLogin;
	}

	public void homePages(String userName, String password) {
		elementSendKeys(txtUserName, userName);
		elementSendKeys(txtPass, password);
		elementClick(clkLogin);
	}

	public void homePages1(String userName, String password) {
		elementSendKeys(txtUserName, userName);
		elementSendKeys(txtPass, password);
		elementClick(clkLogin);
	}

	public String LoginErrMessage() {
		String elementGetText = elementGetText(loginErrMessage);
		return elementGetText;
	}
}
