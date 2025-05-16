package org.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.saucedemo.baseclass.BaseClass;

public class CartPage extends BaseClass {
	public CartPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "checkout")
	private WebElement clkCheckout;
	@FindBy(id = "first-name")
	private WebElement txtFirstName;
	@FindBy(id = "last-name")
	private WebElement txtLastName;
	@FindBy(id = "postal-code")
	private WebElement txtPostalCode;
	@FindBy(id = "continue")
	private WebElement btnContinue;
	@FindBy(id = "finish")
	private WebElement btnFinish;

	public WebElement getBtnFinish() {
		return btnFinish;
	}

	public WebElement getClkCheckout() {
		return clkCheckout;
	}

	public WebElement getTxtFirstName() {
		return txtFirstName;
	}

	public WebElement getTxtLastName() {
		return txtLastName;
	}

	public WebElement getTxtPostalcode() {
		return txtPostalCode;
	}

	public WebElement getBtnContinue() {
		return btnContinue;
	}

	public void CartDetails(String firstName, String lastName, String postalCode) {
		elementClick(clkCheckout);
		elementSendKeys(txtFirstName, firstName);
		elementSendKeys(txtLastName, lastName);
		elementSendKeys(txtPostalCode, postalCode);
		elementClick(btnContinue);
		elementClick(btnFinish);

	}
}
