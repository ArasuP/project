package org.agrichains.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends BaseClass {
	public HomePage(){
		PageFactory.initElements(driver,this);
		}
	@FindBy(id="input")
	private WebElement txtInput;
	@FindBy(id="submitBtn")
	private WebElement clkSubmit;
	public WebElement getTxtInput() {
		return txtInput;
	}
	
	public WebElement getClkSubmit() {
		return clkSubmit;
	}
	public  void HomePages(String input) {
		elementSendKeys(txtInput, input);
		elementClick(clkSubmit);
	}
}
