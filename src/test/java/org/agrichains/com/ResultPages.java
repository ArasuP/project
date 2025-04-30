package org.agrichains.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPages extends BaseClass {

	public ResultPages() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "ResultText")
	private WebElement txtResult;

	public WebElement getTxtInput() {
		return txtResult;
	}

	public String result() {
		String elementGetText = elementGetText(txtResult);
		return elementGetText;
	}
}
