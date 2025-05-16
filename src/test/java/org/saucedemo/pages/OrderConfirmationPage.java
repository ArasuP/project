package org.saucedemo.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.saucedemo.baseclass.BaseClass;



public class OrderConfirmationPage extends BaseClass {
	public OrderConfirmationPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//h2[text()='Thank you for your order!']")
	private WebElement textConfirmMessage;

	public WebElement getClkCheckout() {
		return textConfirmMessage;
	}
  public String OrderConfirmationPages() {
	  String elementGetText = elementGetText(textConfirmMessage);
	  return elementGetText;
	
}
}
